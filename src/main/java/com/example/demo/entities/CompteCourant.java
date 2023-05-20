package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte{
	private Double decouverte;

	public CompteCourant() {
		super();
	}

	public CompteCourant(Double decouverte) {
		super();
		this.decouverte = decouverte;
	}

	public Double getDecouverte() {
		return decouverte;
	}

	public void setDecouverte(Double decouverte) {
		this.decouverte = decouverte;
	}
	
}
