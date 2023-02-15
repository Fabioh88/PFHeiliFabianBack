/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolio.fah.Dto;

import javax.validation.constraints.NotBlank;

public class dtoHys {
    @NotBlank
    private String nombre;
    @NotBlank
    private int Porcentaje;

    public dtoHys() {
    }

    public dtoHys(String nombre, int Porcentaje) {
        this.nombre = nombre;
        this.Porcentaje = Porcentaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(int Porcentaje) {
        this.Porcentaje = Porcentaje;
    }
    
    
}
