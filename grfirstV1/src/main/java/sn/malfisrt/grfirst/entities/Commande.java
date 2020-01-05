package sn.malfisrt.grfirst.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
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
public class Commande implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numCommande;
	private String commentaire;
	private Date dateCommande;
	private String etat;
	private String commantaire;
	@ManyToOne
	@JoinColumn(name = "fk_utilisateur_commande")
	private Utilisateur authorCommande;
	@OneToMany(mappedBy = "valCommande")
	private List<ValidationCommande> validationCommandes;
	@OneToMany(mappedBy = "factureCommande")
	private List<Facture> factures;
	@OneToMany(mappedBy = "livraisonCommande")
	private List<Livraison> livraisons;
	

}
