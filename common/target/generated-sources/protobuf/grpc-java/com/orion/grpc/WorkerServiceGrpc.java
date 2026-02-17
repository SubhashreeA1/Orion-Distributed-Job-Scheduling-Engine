package com.orion.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: job.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WorkerServiceGrpc {

  private WorkerServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "WorkerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.orion.grpc.JobRequest,
      com.orion.grpc.JobResponse> getExecuteJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteJob",
      requestType = com.orion.grpc.JobRequest.class,
      responseType = com.orion.grpc.JobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.orion.grpc.JobRequest,
      com.orion.grpc.JobResponse> getExecuteJobMethod() {
    io.grpc.MethodDescriptor<com.orion.grpc.JobRequest, com.orion.grpc.JobResponse> getExecuteJobMethod;
    if ((getExecuteJobMethod = WorkerServiceGrpc.getExecuteJobMethod) == null) {
      synchronized (WorkerServiceGrpc.class) {
        if ((getExecuteJobMethod = WorkerServiceGrpc.getExecuteJobMethod) == null) {
          WorkerServiceGrpc.getExecuteJobMethod = getExecuteJobMethod =
              io.grpc.MethodDescriptor.<com.orion.grpc.JobRequest, com.orion.grpc.JobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orion.grpc.JobRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.orion.grpc.JobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WorkerServiceMethodDescriptorSupplier("ExecuteJob"))
              .build();
        }
      }
    }
    return getExecuteJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkerServiceStub>() {
        @java.lang.Override
        public WorkerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkerServiceStub(channel, callOptions);
        }
      };
    return WorkerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkerServiceBlockingStub>() {
        @java.lang.Override
        public WorkerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkerServiceBlockingStub(channel, callOptions);
        }
      };
    return WorkerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkerServiceFutureStub>() {
        @java.lang.Override
        public WorkerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkerServiceFutureStub(channel, callOptions);
        }
      };
    return WorkerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void executeJob(com.orion.grpc.JobRequest request,
        io.grpc.stub.StreamObserver<com.orion.grpc.JobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExecuteJobMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WorkerService.
   */
  public static abstract class WorkerServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WorkerServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WorkerService.
   */
  public static final class WorkerServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WorkerServiceStub> {
    private WorkerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkerServiceStub(channel, callOptions);
    }

    /**
     */
    public void executeJob(com.orion.grpc.JobRequest request,
        io.grpc.stub.StreamObserver<com.orion.grpc.JobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExecuteJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WorkerService.
   */
  public static final class WorkerServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WorkerServiceBlockingStub> {
    private WorkerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.orion.grpc.JobResponse executeJob(com.orion.grpc.JobRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExecuteJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WorkerService.
   */
  public static final class WorkerServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WorkerServiceFutureStub> {
    private WorkerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.orion.grpc.JobResponse> executeJob(
        com.orion.grpc.JobRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExecuteJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EXECUTE_JOB = 0;

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
        case METHODID_EXECUTE_JOB:
          serviceImpl.executeJob((com.orion.grpc.JobRequest) request,
              (io.grpc.stub.StreamObserver<com.orion.grpc.JobResponse>) responseObserver);
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
          getExecuteJobMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.orion.grpc.JobRequest,
              com.orion.grpc.JobResponse>(
                service, METHODID_EXECUTE_JOB)))
        .build();
  }

  private static abstract class WorkerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.orion.grpc.JobProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WorkerService");
    }
  }

  private static final class WorkerServiceFileDescriptorSupplier
      extends WorkerServiceBaseDescriptorSupplier {
    WorkerServiceFileDescriptorSupplier() {}
  }

  private static final class WorkerServiceMethodDescriptorSupplier
      extends WorkerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WorkerServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (WorkerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkerServiceFileDescriptorSupplier())
              .addMethod(getExecuteJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
