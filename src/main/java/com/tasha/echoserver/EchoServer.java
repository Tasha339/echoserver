package com.tasha.echoserver;

import jakarta.websocket.OnMessage;
import jakarta.websocket.server.ServerEndpoint;

//i tried using the websocket api defined by java EE but it didn't work either

@ServerEndpoint("/echo")
public class EchoServer {

    @OnMessage
    public String onMessage(String message){
        return "I got this (" + message + ")"
                + " so I am sending it back !";
    }
}
