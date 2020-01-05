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
public class Facture implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String numFacture;
	private String commentaire;
	private Date date;
	private String etat;
	private String commantaire;
	private double valeur;
	@ManyToOne
	@JoinColumn(name = "fk_facture_commande")
	private Commande factureCommande;
	@OneToMany(mappedBy = "facture")
	private List<Reglement> reglements;
	@OneToMany(mappedBy = "facture")
	private List<ValidationFacture> validationFactures;
	
}
