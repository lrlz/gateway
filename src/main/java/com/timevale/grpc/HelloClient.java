package com.timevale.grpc;

import com.timevale.grpc.helloworld.GeeterGrpc;
import com.timevale.grpc.helloworld.HelloGreeting;
import com.timevale.grpc.helloworld.HelloReply;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;

public class HelloClient {

    private ManagedChannel managedChannel;

    private GeeterGrpc.GeeterBlockingStub geeterBlockingStub;


    public HelloClient( ManagedChannel managedChannel ) {
        this.managedChannel = managedChannel;
        this.geeterBlockingStub = GeeterGrpc.newBlockingStub(managedChannel);
    }


    public HelloClient(String host, int port) {
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }

    public void shutdown() throws InterruptedException {
        managedChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws Exception {
        HelloClient client = new HelloClient("localhost", 8080);
        try {
            /* Access a service running on the local machine on port 50051 */
            String user = "world";
            if (args.length > 0) {
                user = args[0]; /* Use the arg as the name to greet if provided */
            }
            client.greet(user);
        } finally {
            client.shutdown();
        }
    }

    private void greet( String user ) {
        System.out.println("Will try to greet " + user + " ...");
        HelloGreeting request = HelloGreeting.newBuilder().setName(user).build();
        HelloReply response;
        try {
            response = geeterBlockingStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            System.err.println("RPC failed: " + e.getStatus());
            return;
        }
        System.out.println("Greeting: " + response.getMessage());
    }

}
