package com.example.springbootandreact.controller;

import java.util.List;

import com.example.springbootandreact.model.entity.Question;
import com.example.springbootandreact.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class QuestionController {

  @Autowired
  private QuestionService questionService;

  @GetMapping("/questions")
  private List<Question> getAllQuestions() {
    return questionService.getAllQuestions();
  }
}
