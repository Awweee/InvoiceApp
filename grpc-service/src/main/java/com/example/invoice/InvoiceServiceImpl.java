package com.example.invoice;

import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class InvoiceServiceImpl extends InvoiceServiceGrpc.InvoiceServiceImplBase {

    private static final List<InvoiceRequest> invoices = new ArrayList<>();

    @Override
    public void saveInvoice(InvoiceRequest request,
                            StreamObserver<InvoiceResponse> responseObserver) {

        invoices.add(request);

        InvoiceResponse response = InvoiceResponse.newBuilder()
                .setSuccess(true)
                .setMessage("Rechnung gespeichert: " + request.getInvoiceNumber())
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}