package sn.malfisrt.grfirst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import sn.malfisrt.grfirst.entities.ValidationFacture;

@RepositoryRestResource
public interface ValidationFactureRepository extends JpaRepository<ValidationFacture, Long> {

}
