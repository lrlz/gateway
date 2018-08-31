package com.timevale.grpc;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class HelloServer {

    private Server server;

    private void start() throws IOException {
        int port = 8080;
        server = ServerBuilder
                .forPort(port)
                .addService(new HelloWorld())
                .build()
                .start();
        System.out.println("server start at port:" + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {

            @Override
            public void run() {
                System.out.println(" shutdown grpc server");
                HelloServer.this.stop();
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

    public static void main(String [] args) throws IOException, InterruptedException {
        final HelloServer helloServer = new HelloServer();
        helloServer.start();
        helloServer.blockUntilShutdown();







    }

}
