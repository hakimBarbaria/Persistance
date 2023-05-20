package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Operations;

@Repository
public interface OpeartionsRepo extends JpaRepository<Operations, Long>{

}
