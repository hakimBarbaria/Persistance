package com.example.demo.entities;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte{
	private Double taux;

	public CompteEpargne() {
		super();
	}

	public CompteEpargne(Double taux) {
		super();
		this.taux = taux;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
}
