package com.decathlon.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "RECRUE")
public class Recrue {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "NOM")
	private String nom;

	@Column(name = "PRENOM")
	private String prenom;

	@Column(name = "address")
	private String addresse;

	@Column(name = "TEL")
	private String numTel;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "created_at")
	private Date createdAt;

	@Column(name = "FILIERE")
	private String filiere;

	@Column(name = "METIER")
	private String metier;

	@Column(name = "IS_LEADER")
	private Boolean isLeader;

	@Column(name = "LEADER_NAME")
	private String leaderName;

	@Column(name = "ECOLE")
	private String ecole;

	@Column(name = "DIPLOME")
	private String diplome;

	@Column(name = "NIVEAU_ETUDE")
	private String niveauEtude;

	@Column(name = "COMPETENCES")
	private String competences;

	@Column(name = "born_at")
	private Date bornAt;

	@Column(name = "SPORTS")
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Sports> sports;

	@JsonIgnore
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getMetier() {
		return metier;
	}

	public void setMetier(String metier) {
		this.metier = metier;
	}

	public Boolean getIsLeader() {
		return isLeader;
	}

	public void setIsLeader(Boolean isLeader) {
		this.isLeader = isLeader;
	}

	public String getEcole() {
		return ecole;
	}

	public void setEcole(String ecole) {
		this.ecole = ecole;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getCompetences() {
		return competences;
	}

	public void setCompetences(String competences) {
		this.competences = competences;
	}

	public List<Sports> getSports() {
		return sports;
	}

	public void setSports(List<Sports> sports) {
		this.sports = sports;
	}

	public Date getBornAt() {
		return bornAt;
	}

	public void setBornAt(Date bornAt) {
		this.bornAt = bornAt;
	}

	public String getLeaderName() {
		return leaderName;
	}

	public void setLeaderName(String leaderName) {
		this.leaderName = leaderName;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

}
