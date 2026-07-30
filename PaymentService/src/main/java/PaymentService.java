import com.google.gson.Gson;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import java.util.logging.Logger;

public class PaymentService {
    private static Logger logger = Logger.getLogger(PaymentService.class.getName());
    private static final String url = "tcp://localhost:61616";
    private static final String queueName = "PaymentOrders";
    private static final Gson GSON = new Gson();
    static class PaymentOrder {
        String id;
        String aussteller;
        String empfaenger;
        double betrag;
        String waehrung;
        String ausstellungsdatum;
        Boolean ist_bezahlt;
        String iban;
    }
    public static void main(String[] args) throws Exception {
        Connection connection = new ActiveMQConnectionFactory(url).createConnection();
        connection.start();
        Session session = connection.createSession();
        MessageConsumer consumer = session.createConsumer(session.createQueue(queueName));
        consumer.setMessageListener(msg -> {
            try {
                PaymentOrder order = GSON.fromJson(((TextMessage) msg).getText(), PaymentOrder.class);
                logger.info("Processing: " + order.id +
                        " | " + order.betrag + " " + order.waehrung);
                logger.info("Payment succeeded: " + order.id);
            } catch (JMSException e) {
                logger.info("Error: " + e.getMessage());
            }
        });
    }
}