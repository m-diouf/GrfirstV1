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
public class ValidationFacture implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date dateValidation;
	private String commentaire;
	@ManyToOne 
	@JoinColumn(name = "fk_fact_val_fact")
	private Facture facture;
	@ManyToOne
	@JoinColumn(name = "fk_resp_val_fact")
	private Utilisateur respValFacture;
	

}
