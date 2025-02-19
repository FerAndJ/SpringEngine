package com.projectoFinalMotorsport.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectoFinalMotorsport.demo.model.Piloto;

@Repository
public interface PilotoRepository extends JpaRepository<Piloto, Long> {

}
