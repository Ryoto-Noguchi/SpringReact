package com.example.springbootandreact.service;

import java.util.List;

import com.example.springbootandreact.model.dao.ResponseRepository;
import com.example.springbootandreact.model.entity.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResponseService {

  @Autowired
  private ResponseRepository responseRepository;

  public List<Response> getAllResponses() {
    return responseRepository.findAll();
  }
}
