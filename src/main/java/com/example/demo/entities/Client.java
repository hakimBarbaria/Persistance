package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "T_Client")
public class Client {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long codeCl;
	  private String nomCl;
	  @OneToMany(mappedBy = "client")
	    private List<Compte> compte;
	public Client() {
		super();
	}
	public Client(String nomCl) {
		super();
		this.nomCl = nomCl;
	}
	
	public Long getCodeCl() {
		return codeCl;
	}
	public void setCodeCl(Long codeCl) {
		this.codeCl = codeCl;
	}
	public String getNomCl() {
		return nomCl;
	}
	public void setNomCl(String nomCl) {
		this.nomCl = nomCl;
	}
	 
}
