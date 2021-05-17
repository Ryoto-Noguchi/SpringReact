package com.example.springbootandreact.model.entity;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Question {

  private long id;
  private String question;
  private char answer;

}
