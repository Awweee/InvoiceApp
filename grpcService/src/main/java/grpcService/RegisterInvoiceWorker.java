package grpcService;

import com.InvoiceApp.proto.InvoiceMetadata;
import io.camunda.client.api.response.ActivatedJob;
import io.camunda.client.api.worker.JobClient;
import io.camunda.client.api.worker.JobHandler;
import io.grpc.Channel;
import java.util.Map;

public class RegisterInvoiceWorker implements JobHandler {

    private final Channel channel;
    Map<String, Object> vars;

    public RegisterInvoiceWorker(Channel channel, Map<String, Object> vars) {
        this.vars = vars;
        this.channel = channel;
    }

    @Override
    public void handle(final JobClient client, final ActivatedJob job) {
        InvoiceMetadata metadata = InvoiceMetadata.newBuilder()
                .setId((String)  vars.get("id"))
                .setAussteller((String)       vars.get("Aussteller"))
                .setWaehrung((String)   vars.get("Waehrung"))
                .setIban((String)       vars.get("iban"))
                .setAusstellungsdatum((String)       vars.get("Ausstellungsdatum"))
                .build();

        ClientApp grpcClient = new ClientApp(channel);
        grpcClient.SaveInvoice(metadata);

        client.newCompleteCommand(job.getKey())
                .variables(Map.of("InvoiceRegistered", true))
                .send()
                .join();
    }

}
