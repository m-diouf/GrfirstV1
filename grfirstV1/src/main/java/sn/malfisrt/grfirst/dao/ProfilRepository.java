package sn.malfisrt.grfirst.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import sn.malfisrt.grfirst.entities.Profil;

@RepositoryRestResource
public interface ProfilRepository extends JpaRepository<Profil, Long> {

}
