package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="T_compte")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PTE", discriminatorType = DiscriminatorType.STRING, length = 4)
public abstract class Compte {
	@Id
	@Column(name="num_cpte")
	private String numCompte;
	@Column(name="date_cr")
	private Date dateCreation;
	private Double solde;
	@ManyToOne
	@JoinColumn(name="codeCli")
	private Client client;
	 @OneToMany(mappedBy = "compte")
	 private List<Operations> operations;
	public Compte() {
		super();
	}
	
	

	public Compte(String numCompte, Date dateCreation, Double solde, Client client, List<Operations> operations) {
		super();
		this.numCompte = numCompte;
		this.dateCreation = dateCreation;
		this.solde = solde;
		this.client = client;
		this.operations = operations;
	}



	public String getNumCompte() {
		return numCompte;
	}
	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Double getSolde() {
		return solde;
	}
	public void setSolde(Double solde) {
		this.solde = solde;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	public List<Operations> getOperations() {
		return operations;
	}



	public void setOperations(List<Operations> operations) {
		this.operations = operations;
	}
	
	
	
}
