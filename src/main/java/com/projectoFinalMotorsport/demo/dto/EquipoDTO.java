package com.projectoFinalMotorsport.demo.dto;

import lombok.Data;

@Data
public class EquipoDTO {
    
    private String nombre;

    private String nacionalidad;

    private Integer victoriasTotales;

    private String sede;

    private Boolean esMotorista;
}
