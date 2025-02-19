package com.projectoFinalMotorsport.demo.dto;

import java.time.LocalDateTime;

import com.projectoFinalMotorsport.demo.model.GamaNeumaticos;

import lombok.Data;

@Data
public class CarreraDTO {
    private String nombre;

    private String ubicacioString;

    private String autodromo;

    private LocalDateTime horario;

    private Integer kmVuelta;

    private Integer numerosVueltas;

    private Integer temperaturaPromedio;

    private GamaNeumaticos gamaNeumaticos;

    private Double probabilidadSafetyCar;
}
