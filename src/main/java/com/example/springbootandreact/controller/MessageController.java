package com.example.springbootandreact.controller;

import com.example.springbootandreact.model.MessageModel;

import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

  @MessageMapping("/admin/{to}")
  public void sendMessage(@DestinationVariable String to, MessageModel message) {
    System.out.println("handling send message: " + message + " to" + to);

  }
}
