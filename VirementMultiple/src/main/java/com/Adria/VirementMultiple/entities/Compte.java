package com.Adria.VirementMultiple.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Compte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8195028378507923136L;
	@Id
	@GeneratedValue
	private Long idCompte; 
	private String numeroCompte; 
	private String intitule; 
	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Compte(String numeroCompte, String intitule, BigDecimal soldeComptable) {
		super();
		this.numeroCompte = numeroCompte;
		this.intitule = intitule;
		this.soldeComptable = soldeComptable;
	}
	private BigDecimal soldeComptable;
	public String getNumeroCompte() {
		return numeroCompte;
	}
	public void setNumeroCompte(String numeroCompte) {
		this.numeroCompte = numeroCompte;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public BigDecimal getSoldeComptable() {
		return soldeComptable;
	}
	public void setSoldeComptable(BigDecimal soldeComptable) {
		this.soldeComptable = soldeComptable;
	}
	public Long getIdCompte() {
		return idCompte;
	}
	@Override
	public String toString() {
		return "Compte [idCompte=" + idCompte + ", numeroCompte=" + numeroCompte + ", intitule=" + intitule
				+ ", soldeComptable=" + soldeComptable + "]";
	} 
}
