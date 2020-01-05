package sn.malfisrt.grfirst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.malfisrt.grfirst.entities.Prestataire;

@RepositoryRestResource
public interface PrestataireRepository extends JpaRepository<Prestataire, Long> {

}
