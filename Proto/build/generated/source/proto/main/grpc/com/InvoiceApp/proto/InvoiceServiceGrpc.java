package com.InvoiceApp.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: invoice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class InvoiceServiceGrpc {

  private InvoiceServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "InvoiceApp.InvoiceService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.InvoiceApp.proto.SaveInvoiceRequest,
      com.InvoiceApp.proto.SaveInvoiceResponse> getSaveInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SaveInvoice",
      requestType = com.InvoiceApp.proto.SaveInvoiceRequest.class,
      responseType = com.InvoiceApp.proto.SaveInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.InvoiceApp.proto.SaveInvoiceRequest,
      com.InvoiceApp.proto.SaveInvoiceResponse> getSaveInvoiceMethod() {
    io.grpc.MethodDescriptor<com.InvoiceApp.proto.SaveInvoiceRequest, com.InvoiceApp.proto.SaveInvoiceResponse> getSaveInvoiceMethod;
    if ((getSaveInvoiceMethod = InvoiceServiceGrpc.getSaveInvoiceMethod) == null) {
      synchronized (InvoiceServiceGrpc.class) {
        if ((getSaveInvoiceMethod = InvoiceServiceGrpc.getSaveInvoiceMethod) == null) {
          InvoiceServiceGrpc.getSaveInvoiceMethod = getSaveInvoiceMethod =
              io.grpc.MethodDescriptor.<com.InvoiceApp.proto.SaveInvoiceRequest, com.InvoiceApp.proto.SaveInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SaveInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.InvoiceApp.proto.SaveInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.InvoiceApp.proto.SaveInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvoiceServiceMethodDescriptorSupplier("SaveInvoice"))
              .build();
        }
      }
    }
    return getSaveInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.InvoiceApp.proto.GetInvoiceRequest,
      com.InvoiceApp.proto.GetInvoiceResponse> getGetInvoiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetInvoice",
      requestType = com.InvoiceApp.proto.GetInvoiceRequest.class,
      responseType = com.InvoiceApp.proto.GetInvoiceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.InvoiceApp.proto.GetInvoiceRequest,
      com.InvoiceApp.proto.GetInvoiceResponse> getGetInvoiceMethod() {
    io.grpc.MethodDescriptor<com.InvoiceApp.proto.GetInvoiceRequest, com.InvoiceApp.proto.GetInvoiceResponse> getGetInvoiceMethod;
    if ((getGetInvoiceMethod = InvoiceServiceGrpc.getGetInvoiceMethod) == null) {
      synchronized (InvoiceServiceGrpc.class) {
        if ((getGetInvoiceMethod = InvoiceServiceGrpc.getGetInvoiceMethod) == null) {
          InvoiceServiceGrpc.getGetInvoiceMethod = getGetInvoiceMethod =
              io.grpc.MethodDescriptor.<com.InvoiceApp.proto.GetInvoiceRequest, com.InvoiceApp.proto.GetInvoiceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetInvoice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.InvoiceApp.proto.GetInvoiceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.InvoiceApp.proto.GetInvoiceResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvoiceServiceMethodDescriptorSupplier("GetInvoice"))
              .build();
        }
      }
    }
    return getGetInvoiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.InvoiceApp.proto.ListInvoicesRequest,
      com.InvoiceApp.proto.ListInvoicesResponse> getListInvoicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListInvoices",
      requestType = com.InvoiceApp.proto.ListInvoicesRequest.class,
      responseType = com.InvoiceApp.proto.ListInvoicesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.InvoiceApp.proto.ListInvoicesRequest,
      com.InvoiceApp.proto.ListInvoicesResponse> getListInvoicesMethod() {
    io.grpc.MethodDescriptor<com.InvoiceApp.proto.ListInvoicesRequest, com.InvoiceApp.proto.ListInvoicesResponse> getListInvoicesMethod;
    if ((getListInvoicesMethod = InvoiceServiceGrpc.getListInvoicesMethod) == null) {
      synchronized (InvoiceServiceGrpc.class) {
        if ((getListInvoicesMethod = InvoiceServiceGrpc.getListInvoicesMethod) == null) {
          InvoiceServiceGrpc.getListInvoicesMethod = getListInvoicesMethod =
              io.grpc.MethodDescriptor.<com.InvoiceApp.proto.ListInvoicesRequest, com.InvoiceApp.proto.ListInvoicesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListInvoices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.InvoiceApp.proto.ListInvoicesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.InvoiceApp.proto.ListInvoicesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new InvoiceServiceMethodDescriptorSupplier("ListInvoices"))
              .build();
        }
      }
    }
    return getListInvoicesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static InvoiceServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceStub>() {
        @java.lang.Override
        public InvoiceServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceStub(channel, callOptions);
        }
      };
    return InvoiceServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static InvoiceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceBlockingStub>() {
        @java.lang.Override
        public InvoiceServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceBlockingStub(channel, callOptions);
        }
      };
    return InvoiceServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static InvoiceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<InvoiceServiceFutureStub>() {
        @java.lang.Override
        public InvoiceServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new InvoiceServiceFutureStub(channel, callOptions);
        }
      };
    return InvoiceServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void saveInvoice(com.InvoiceApp.proto.SaveInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.InvoiceApp.proto.SaveInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveInvoiceMethod(), responseObserver);
    }

    /**
     */
    default void getInvoice(com.InvoiceApp.proto.GetInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.InvoiceApp.proto.GetInvoiceResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetInvoiceMethod(), responseObserver);
    }

    /**
     */
    default void listInvoices(com.InvoiceApp.proto.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.InvoiceApp.proto.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListInvoicesMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service InvoiceService.
   */
  public static abstract class InvoiceServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return InvoiceServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service InvoiceService.
   */
  public static final class InvoiceServiceStub
      extends io.grpc.stub.AbstractAsyncStub<InvoiceServiceStub> {
    private InvoiceServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveInvoice(com.InvoiceApp.proto.SaveInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.InvoiceApp.proto.SaveInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getInvoice(com.InvoiceApp.proto.GetInvoiceRequest request,
        io.grpc.stub.StreamObserver<com.InvoiceApp.proto.GetInvoiceResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listInvoices(com.InvoiceApp.proto.ListInvoicesRequest request,
        io.grpc.stub.StreamObserver<com.InvoiceApp.proto.ListInvoicesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service InvoiceService.
   */
  public static final class InvoiceServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<InvoiceServiceBlockingStub> {
    private InvoiceServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.InvoiceApp.proto.SaveInvoiceResponse saveInvoice(com.InvoiceApp.proto.SaveInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveInvoiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.InvoiceApp.proto.GetInvoiceResponse getInvoice(com.InvoiceApp.proto.GetInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetInvoiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.InvoiceApp.proto.ListInvoicesResponse listInvoices(com.InvoiceApp.proto.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListInvoicesMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service InvoiceService.
   */
  public static final class InvoiceServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<InvoiceServiceFutureStub> {
    private InvoiceServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected InvoiceServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new InvoiceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.InvoiceApp.proto.SaveInvoiceResponse> saveInvoice(
        com.InvoiceApp.proto.SaveInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveInvoiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.InvoiceApp.proto.GetInvoiceResponse> getInvoice(
        com.InvoiceApp.proto.GetInvoiceRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetInvoiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.InvoiceApp.proto.ListInvoicesResponse> listInvoices(
        com.InvoiceApp.proto.ListInvoicesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListInvoicesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_INVOICE = 0;
  private static final int METHODID_GET_INVOICE = 1;
  private static final int METHODID_LIST_INVOICES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_INVOICE:
          serviceImpl.saveInvoice((com.InvoiceApp.proto.SaveInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.InvoiceApp.proto.SaveInvoiceResponse>) responseObserver);
          break;
        case METHODID_GET_INVOICE:
          serviceImpl.getInvoice((com.InvoiceApp.proto.GetInvoiceRequest) request,
              (io.grpc.stub.StreamObserver<com.InvoiceApp.proto.GetInvoiceResponse>) responseObserver);
          break;
        case METHODID_LIST_INVOICES:
          serviceImpl.listInvoices((com.InvoiceApp.proto.ListInvoicesRequest) request,
              (io.grpc.stub.StreamObserver<com.InvoiceApp.proto.ListInvoicesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSaveInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.InvoiceApp.proto.SaveInvoiceRequest,
              com.InvoiceApp.proto.SaveInvoiceResponse>(
                service, METHODID_SAVE_INVOICE)))
        .addMethod(
          getGetInvoiceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.InvoiceApp.proto.GetInvoiceRequest,
              com.InvoiceApp.proto.GetInvoiceResponse>(
                service, METHODID_GET_INVOICE)))
        .addMethod(
          getListInvoicesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.InvoiceApp.proto.ListInvoicesRequest,
              com.InvoiceApp.proto.ListInvoicesResponse>(
                service, METHODID_LIST_INVOICES)))
        .build();
  }

  private static abstract class InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    InvoiceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.InvoiceApp.proto.InvoiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("InvoiceService");
    }
  }

  private static final class InvoiceServiceFileDescriptorSupplier
      extends InvoiceServiceBaseDescriptorSupplier {
    InvoiceServiceFileDescriptorSupplier() {}
  }

  private static final class InvoiceServiceMethodDescriptorSupplier
      extends InvoiceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    InvoiceServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (InvoiceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new InvoiceServiceFileDescriptorSupplier())
              .addMethod(getSaveInvoiceMethod())
              .addMethod(getGetInvoiceMethod())
              .addMethod(getListInvoicesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
