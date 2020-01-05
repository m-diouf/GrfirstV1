package sn.malfisrt.grfirst.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import sn.malfisrt.grfirst.entities.Profil;
import sn.malfisrt.grfirst.entities.Utilisateur;

@Entity @Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Profil implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String code;
	private String commantaire;
	@OneToMany(mappedBy = "profil")
	private List<Utilisateur> utilisateurs;
	public Profil(String code, String commantaire) {
		super();
		this.code = code;
		this.commantaire = commantaire;
	}
	
	
	
}
