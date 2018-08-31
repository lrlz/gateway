package com.timevale.grpc;

import com.timevale.grpc.helloworld.GeeterGrpc;
import com.timevale.grpc.helloworld.HelloGreeting;
import com.timevale.grpc.helloworld.HelloReply;
import io.grpc.stub.StreamObserver;

public class HelloWorld extends GeeterGrpc.GeeterImplBase {

    @Override
    public void sayHello(HelloGreeting request, StreamObserver<HelloReply> responseObserver ) {

        HelloReply helloReply = HelloReply.newBuilder().setMessage("call helloimpl").build();
        System.out.println("say hello here");
        responseObserver.onNext(helloReply);
        responseObserver.onCompleted();
    }
}
