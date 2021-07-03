package com.example.springbootandreact.controller;

import java.util.List;

import com.example.springbootandreact.model.entity.Question;
import com.example.springbootandreact.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class QuestionController {

  @Autowired
  private QuestionService questionService;

  @GetMapping("/questions")
  public List<Question> getAllQuestions() {
    return questionService.getAllQuestions();
  }

  @PostMapping("/questions")
  public Question createQuestion(@RequestBody Question question) {
    return questionService.createQuestion(question);
  }

  @DeleteMapping("/questions/delete/{id}")
  public boolean deleteQuestion(@PathVariable int id) {
    boolean isDeleted = false;
    int result = questionService.deleteById(id);
    if (result > 0) {
      isDeleted = true;
    }
    return isDeleted;
  }
}
