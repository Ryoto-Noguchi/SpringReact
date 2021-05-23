package com.example.springbootandreact.controller;

import java.util.List;

import com.example.springbootandreact.model.entity.Response;
import com.example.springbootandreact.service.ResponseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1")
public class ResponseController {

  @Autowired
  private ResponseService responseService;

  @GetMapping("/responses")
  public List<Response> getAllResponses() {
    return responseService.getAllResponses();
  }

}
