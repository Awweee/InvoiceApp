package grpcService;

import com.google.gson.Gson;
import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.api.worker.JobClient;
import io.camunda.client.api.worker.JobHandler;
import org.apache.activemq.ActiveMQConnectionFactory;
import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.Map;
import java.util.logging.Logger;

public class SaveInvoiceWorker implements JobHandler {
    final Logger logger = Logger.getLogger(SaveInvoiceWorker.class.getName());
    private final String url;
    private final Map<String, Object> map;
    static private final Gson GSON = new Gson();

    public SaveInvoiceWorker(String url, Map<String, Object> map){
        this.url = url;
        this.map = map;
    }

    @Override
    public void handle(final JobClient client, final ActivatedJob job) throws JMSException {
        // Perform your business logic here
        Connection conn = new ActiveMQConnectionFactory(url).createConnection();
        conn.start();
        Session session = conn.createSession();
        javax.jms.MessageProducer producer = (javax.jms.MessageProducer) session.createProducer(
                session.createQueue("PaymentOrders"));
        String json = GSON.toJson(map);
        logger.info("JSON: " + json);
        TextMessage message = session.createTextMessage(json);
        producer.send(message);

        conn.close();
        client.newCompleteCommand(job.getKey())
                .variables(Map.of("InvoiceSaved", true))
                .send()
                .join();
    }
}
