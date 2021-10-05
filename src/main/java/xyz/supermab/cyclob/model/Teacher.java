package xyz.supermab.cyclob.model;

import java.io.Serializable;
import java.util.Date;

public class Teacher implements Serializable{

	private Long id;
	private String code;
	private String nom;
	private String diplome;
	private Date naissance;
	private String adresse;
	
	public Teacher() {
	}
	
	public Teacher(Long id, String code, String nom, String diplome, Date naissance, String adresse) {
		super();
		this.id = id;
		this.code = code;
		this.nom = nom;
		this.diplome = diplome;
		this.naissance = naissance;
		this.adresse = adresse;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDiplome() {
		return diplome;
	}
	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}
	public Date getNaissance() {
		return naissance;
	}
	public void setNaissance(Date naissance) {
		this.naissance = naissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", code=" + code + ", nom=" + nom + ", diplome=" + diplome + ", naissance="
				+ naissance + ", adresse=" + adresse + "]";
	}
	
	
	
}
