package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Compte;


public interface CompteRepo extends JpaRepository<Compte, Long>{

}
