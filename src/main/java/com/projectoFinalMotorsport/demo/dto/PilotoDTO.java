package com.projectoFinalMotorsport.demo.dto;

import com.projectoFinalMotorsport.demo.model.Categoria;

import lombok.Data;

@Data
public class PilotoDTO {
    private String nombre;
    
    private Integer peso;
    
    private Integer numero;
    
    private String nacionalidad;
    
    private Categoria categoria;
}
