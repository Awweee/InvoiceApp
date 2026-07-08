package grpcService;


import com.InvoiceApp.proto.GetInvoiceRequest;
import com.InvoiceApp.proto.GetInvoiceResponse;
import com.InvoiceApp.proto.InvoiceMetadata;
import com.InvoiceApp.proto.InvoiceServiceGrpc;
import com.InvoiceApp.proto.SaveInvoiceRequest;
import com.InvoiceApp.proto.SaveInvoiceResponse;
import com.google.gson.Gson;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.internal.StreamListener.MessageProducer;
import io.grpc.stub.StreamObserver;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.Connection;
import javax.jms.JMSException;
import javax.jms.Session;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class grpcServer {
    private static final Logger logger = Logger.getLogger(grpcServer.class.getName());

    private Server server;

    public grpcServer(){
    }

    public void start() throws IOException {
        server = ServerBuilder.forPort(50051)
                .addService(new InvoiceServiceImpl())
                .build()
                .start();
        logger.info("gRPC Server, Port: " + "50051");
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            logger.info("Shutting down...");
            stop();
        }));
    }

    public void stop() {
        if (server != null) server.shutdown();
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) server.awaitTermination();
    }

    public class InvoiceServiceImpl extends InvoiceServiceGrpc.InvoiceServiceImplBase{
       private List<InvoiceMetadata> invoices = new ArrayList<>();


       public void saveInvoice(SaveInvoiceRequest req, StreamObserver<SaveInvoiceResponse> out) {

           invoices.add(req.getMetadata());

           SaveInvoiceResponse response = SaveInvoiceResponse.newBuilder()
                           .setMessage("gespeichert")
                                   .build();
           out.onNext(response);

           logger.info(response.getMessage()+ "\n Your id: "+req.getMetadata().getId());
           out.onCompleted();

       }

       public void getInvoice(GetInvoiceRequest req, StreamObserver<GetInvoiceResponse> out){
           try {
               Optional<InvoiceMetadata> response = invoices.stream()
                       .filter(i -> i.getId().equals(req.getId())).findFirst();
               out.onNext(GetInvoiceResponse.newBuilder().setMetadata(response.get()).build());
           }
           catch (NullPointerException e) {
               logger.info("There is no user with this id");
           }
           out.onCompleted();
       }
        

    }

    public static void main(String[] args) throws IOException, InterruptedException {
        grpcServer srv = new grpcServer();
        srv.start();
        srv.blockUntilShutdown();
    }
}

