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
public class ValidationCommande implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "fk_val_cmd")
	private Commande valCommande;
	@ManyToOne
	@JoinColumn(name = "fk_resp_val_cmd")
	private Utilisateur respValCommande;
	private Date dateValidation;
	private String commantaire;
	
}
