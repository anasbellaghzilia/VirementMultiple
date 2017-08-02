package com.Adria.VirementMultiple.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beneficiaire implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5739240835962156332L;
	@Id
	@GeneratedValue
	private Long idBeneficiaire;
	private String nom;
	private String prenom; 
	private int numeroCompte; 
	public Beneficiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Beneficiaire(String nom, String prenom, int numeroCompte) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.numeroCompte = numeroCompte;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(int numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public Long getIdBeneficiaire() {
		return idBeneficiaire;
	}
	@Override
	public String toString() {
		return "Beneficiaire [idBeneficiaire=" + idBeneficiaire + ", nom=" + nom + ", prenom=" + prenom
				+ ", numeroCompte=" + numeroCompte + "]";
	}	
}
