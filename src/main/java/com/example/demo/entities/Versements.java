package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Versements extends Operations{

	public Versements() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Versements(Date dateOperation, Double montant) {
		super(dateOperation, montant);
		// TODO Auto-generated constructor stub
	}
	
}
