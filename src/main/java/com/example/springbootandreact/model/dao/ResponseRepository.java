package com.example.springbootandreact.model.dao;

import com.example.springbootandreact.model.entity.Response;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Integer> {

}
