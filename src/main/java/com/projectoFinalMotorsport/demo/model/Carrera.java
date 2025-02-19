package com.projectoFinalMotorsport.demo.model;

import java.time.LocalDateTime;
import java.util.List;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="CARRERA")
public class Carrera {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;

    private String ubicacioString;

    private String autodromo;

    private LocalDateTime horario;

    private Integer kmVuelta;

    private Integer numerosVueltas;

    private Integer temperaturaPromedio;

    private GamaNeumaticos gamaNeumaticos;

    private Double probabilidadSafetyCar;

    @ManyToMany(mappedBy = "carreras")
    private List<Piloto> pilotos;

    private void agregarPiloto(Piloto piloto) {
        pilotos.add(piloto);
    }

}
