package com.Adria.VirementMultiple.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class VirementMultiple implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5744439358916350460L;
	@Id
	@GeneratedValue
	private Long idVirementMultiple; 
	private int nombreBeneficiaires;
	public VirementMultiple(int nombreBeneficiaires) {
		super();
		this.nombreBeneficiaires = nombreBeneficiaires;
	}
	public VirementMultiple() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getNombreBeneficiaires() {
		return nombreBeneficiaires;
	}
	public void setNombreBeneficiaires(int nombreBeneficiaires) {
		this.nombreBeneficiaires = nombreBeneficiaires;
	}
	public Long getIdVirementMultiple() {
		return idVirementMultiple;
	}
	@Override
	public String toString() {
		return "VirementMultiple [idVirementMultiple=" + idVirementMultiple + ", nombreBeneficiaires="
				+ nombreBeneficiaires + "]";
	}
 
	
}
