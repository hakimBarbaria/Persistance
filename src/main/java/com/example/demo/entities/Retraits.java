package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Retraits extends Operations{

	public Retraits() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retraits(Date dateOperation, Double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
	
}
