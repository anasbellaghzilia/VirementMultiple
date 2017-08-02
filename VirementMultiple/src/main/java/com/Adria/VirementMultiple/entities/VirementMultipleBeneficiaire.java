package com.Adria.VirementMultiple.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VirementMultipleBeneficiaire implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4998056144513840051L;
	@Id
	@GeneratedValue
	private Long idVirMultipBen; 
	private BigDecimal montant;
	public VirementMultipleBeneficiaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	public VirementMultipleBeneficiaire(BigDecimal montant) {
		super();
		this.montant = montant;
	}
	public BigDecimal getMontant() {
		return montant;
	}
	public void setMontant(BigDecimal montant) {
		this.montant = montant;
	}
	public Long getIdVirMultipBen() {
		return idVirMultipBen;
	}
	@Override
	public String toString() {
		return "VirementMultipleBeneficiaire [idVirMultipBen=" + idVirMultipBen + ", montant=" + montant + "]";
	} 
	
}
