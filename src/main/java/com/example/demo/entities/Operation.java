package com.example.demo.entities;

import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name= "operation")
public class Operation {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long numOperation;
	  private Date dateOperation;
	  private Double montant;
	  @ManyToOne
	  private Compte compte;
	public Operation() {
		super();
	}
	public Operation(Date dateOperation, Double montant) {
		super();
		this.dateOperation = dateOperation;
		this.montant = montant;
	}
	public Long getNumOperation() {
		return numOperation;
	}
	public void setNumOperation(Long numOperation) {
		this.numOperation = numOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	  
}
