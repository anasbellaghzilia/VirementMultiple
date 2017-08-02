package com.Adria.VirementMultiple.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Virement implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3544959432686346658L;
	@Id
	@GeneratedValue
	private int idVirement;
	private Date dateCreation;
	private BigDecimal montant;
	private String motif;
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}
	public String getMotif() {
		return motif;
	}
	public void setMotif(String motif) {
		this.motif = motif;
	}
	public int getIdVirement() {
		return idVirement;
	}
	public Virement(Date dateCreation, BigDecimal montant, String motif) {
		super();
		this.dateCreation = dateCreation;
		this.montant = montant;
		this.motif = motif;
	}
	public Virement() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Virement [idVirement=" + idVirement + ", dateCreation=" + dateCreation + ", montant=" + montant
				+ ", motif=" + motif + "]";
	}
	
}
