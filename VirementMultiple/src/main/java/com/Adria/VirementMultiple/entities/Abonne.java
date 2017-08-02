package com.Adria.VirementMultiple.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Abonne implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1487121415780180780L;
	@Id
	@GeneratedValue
	private Long idAbonne; 
	private String username; 
	private String password; 
	private String nom; 
	private String prenom;
	public Abonne() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Abonne(String username, String password, String nom, String prenom) {
		super();
		this.username = username;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
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
	public Long getIdAbonne() {
		return idAbonne;
	}
	@Override
	public String toString() {
		return "Abonne [idAbonne=" + idAbonne + ", username=" + username + ", password=" + password + ", nom=" + nom
				+ ", prenom=" + prenom + "]";
	}
	
	
	
}
