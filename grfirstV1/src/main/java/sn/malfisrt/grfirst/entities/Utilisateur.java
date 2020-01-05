package sn.malfisrt.grfirst.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Utilisateur implements Serializable{
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	private String email;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="fk_profil_utilisateur")
	private Profil profil;
	@OneToMany(mappedBy = "authorCommande")
	private List<Commande> commandes;
	@OneToMany(mappedBy = "respValCommande")
	private List<ValidationCommande> validationCommandes;
	@OneToMany(mappedBy = "respValFacture")
	private List<ValidationFacture> validationFactures;
	

	
	public Utilisateur(String nom, String prenom, String login, String password, String email) {
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
		this.email = email;
		
	}



	
	
	
	
	
	
}
