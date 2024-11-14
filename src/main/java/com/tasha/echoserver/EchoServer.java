package com.tasha.echoserver;

import jakarta.websocket.OnMessage;
import jakarta.websocket.server.ServerEndpoint;

//i'm using the web socket api provided by java EE and not the spring boot websocket api

@ServerEndpoint("/echo")
public class EchoServer {

    @OnMessage
    public String onMessage(String message){
        return "I got this (" + message + ")"
                + " so I am sending it back !";
    }
}
