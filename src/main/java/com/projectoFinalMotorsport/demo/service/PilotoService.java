package com.projectoFinalMotorsport.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectoFinalMotorsport.demo.model.Equipo;
import com.projectoFinalMotorsport.demo.model.Piloto;
import com.projectoFinalMotorsport.demo.repository.PilotoRepository;

@Service
public class PilotoService {

    @Autowired
    private PilotoRepository pilotoRepository;

     public Piloto save(Piloto piloto) {
        return pilotoRepository.save(piloto);
    }
}
