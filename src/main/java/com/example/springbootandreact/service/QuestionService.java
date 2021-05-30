package com.example.springbootandreact.service;

import java.util.List;

import com.example.springbootandreact.model.dao.QuestionRepository;
import com.example.springbootandreact.model.entity.Question;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {

  @Autowired
  private QuestionRepository questionRepository;

  public List<Question> getAllQuestions() {
    List<Question> questionList = questionRepository.findAll();
    for (Question question : questionList) {
      System.out.println("選択肢A: " + question.getChoices().get("A"));
    }
    return questionList;
  }

  public Question createQuestion(Question question) {
    return questionRepository.save(question);
  }


}
