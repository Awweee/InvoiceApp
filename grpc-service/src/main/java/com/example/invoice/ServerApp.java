package com.example.invoice;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ServerApp {

    public static void main(String[] args) throws Exception {
        Server server = ServerBuilder
                .forPort(9090)
                .addService(new InvoiceServiceImpl())
                .build();

        server.start();
        System.out.println("gRPC-Server läuft auf Port 9090");

        server.awaitTermination();
    }
}