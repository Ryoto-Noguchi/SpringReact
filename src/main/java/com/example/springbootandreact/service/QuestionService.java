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
    return questionRepository.findAll();
  }

  public Question createQuestion(Question question) {
    return questionRepository.save(question);
  }

  public int deleteById(int id) {
    try {
      questionRepository.deleteById(id);
      return 1;
    } catch (Exception e) {
      e.printStackTrace();
      return 0;
    }
  }

}
