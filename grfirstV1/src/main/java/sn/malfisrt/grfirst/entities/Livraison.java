package sn.malfisrt.grfirst.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Livraison implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date date;
	private String commentaire;
	@ManyToOne
	@JoinColumn(name = "fk_commande_livraison")
	private Commande livraisonCommande;
	@ManyToOne
	@JoinColumn(name = "fk_liraison_prestataire")
	private Prestataire prestataire;
	
}
