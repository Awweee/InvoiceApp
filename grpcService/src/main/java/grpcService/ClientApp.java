package grpcService;

import com.InvoiceApp.proto.InvoiceMetadata;
import com.InvoiceApp.proto.InvoiceServiceGrpc;
import com.InvoiceApp.proto.SaveInvoiceRequest;
import com.InvoiceApp.proto.SaveInvoiceResponse;
import io.camunda.client.CamundaClient;
import io.camunda.client.api.response.ProcessInstanceEvent;
import io.camunda.client.api.worker.JobWorker;
import io.grpc.Channel;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannel;
import javax.jms.JMSException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.logging.Logger;

public class ClientApp {

    static private final String url = "tcp://localhost:61616";

    private final InvoiceServiceGrpc.InvoiceServiceBlockingStub blockingStub;

    public ClientApp(Channel channel){
        blockingStub= InvoiceServiceGrpc.newBlockingStub(channel);
    }

    public void SaveInvoice(InvoiceMetadata metadata){
        SaveInvoiceRequest req = SaveInvoiceRequest.newBuilder().setMetadata(metadata).build();
        SaveInvoiceResponse res;
            res = blockingStub.saveInvoice(req);
    }
//    public void GetInvoice(String id){
//        GetInvoiceRequest req = GetInvoiceRequest.newBuilder().get
//    }

    static void main(String[] args) throws JMSException {

        final Logger logger = Logger.getLogger(ClientApp.class.getName());
        final String target = "localhost:50051";
        ManagedChannel channel = Grpc.newChannelBuilder(target, InsecureChannelCredentials.create())
                .build();
        final InvoiceMetadata md = InvoiceMetadata.newBuilder()
                .setId(UUID.randomUUID().toString())
                .setAussteller("grpc GmbH")
                .setEmpfaenger("HKA")
                .setBetrag(500)
                .setWaehrung("EUR")
                .setAusstellungsdatum("16.04.2026")
                .setIban("D32131541512312")
                .build();

        logger.info(md.toString());


        Map<String, Object> map = new HashMap<>();
        map.put("id",    md.getId());
        map.put("Aussteller", md.getAussteller());
        map.put("Empfaenger" , md.getEmpfaenger());
        map.put("Betrag",       md.getBetrag());
        map.put("Waehrung",     md.getWaehrung());
        map.put("Ausstellungsdatum", md.getAusstellungsdatum());
        map.put("iban",         md.getIban());

        CamundaClient client = CamundaClient.newCloudClientBuilder()
                .withClusterId("487e2664-45fe-4a21-9e53-860eddc37e5e")
                .withClientId("2qwRDM0MDQYft~UA5o_Y27KQl6DhKmOc")
                .withClientSecret("IyGgtDJJ2NmkZR8zdHHO9h.XG6YphoVgGez3cC~LgZni64lqVryMRA84YyW34zTh")
                .withRegion("bru-2")
                .build();

//        var topology = client.newTopologyRequest().send().join();
//        System.out.println("Verbunden! Broker: " + topology.getBrokers());
//

        final ProcessInstanceEvent processInstanceEvent = client.newCreateInstanceCommand()
                .bpmnProcessId("RegisterInvoice")
                .latestVersion()
                .variable("id",       md.getId())
                .variable("Aussteller",     md.getAussteller())
                .variable("Betrag",   md.getBetrag())
                .variable("Empfaenger", md.getEmpfaenger())
                .variable("Waehrung", md.getWaehrung())
                .variable("iban",     md.getIban())
                .variable("Datum",     md.getAusstellungsdatum())
                .execute();


        logger.info("Process instance started for invoice: " + md.getId());
//
//        final DeploymentEvent deploymentEvent =  client.newDeployResourceCommand()
//                .addResourceFromClasspath("RegisterInvoiceTest.bpmn")
//                .execute();

        try (final JobWorker workerRegistration = client.newWorker()
                .jobType("SaveInvoice")
                .handler(new SaveInvoiceWorker(url,map))
                .open()) {

            System.out.println("Job worker opened and receiving jobs of type: " + "SaveInvoice");

            // Keep the worker running
            Thread.sleep(Duration.ofMinutes(10));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try (final JobWorker workerRegistration = client.newWorker()
                .jobType("RegisterInvoice")
                .handler(new RegisterInvoiceWorker(channel,map))
                .open()) {

            System.out.println("Job worker opened and receiving jobs of type: " + "RegisterInvoice");

            // Keep the worker running
            Thread.sleep(Duration.ofMinutes(10));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }






    }
}
