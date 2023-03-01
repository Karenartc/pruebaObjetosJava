package com.generation.pruebaobejtosjava0103.models;

public class Materia {
    // Materia: nombre, horario, cantidadAlumnMax, notaAprobar.

    //ATRIBUTOS

    public String nombre;
    public Integer horario;
    public Integer cantidadAlumnMax;
    public Double notaAprobar;

    //CONSTRUCTORES 

    public Materia() {
    }

    public Materia(String nombre, Integer horario, Integer cantidadAlumnMax, Double notaAprobar) {
        this.nombre = nombre;
        this.horario = horario;
        this.cantidadAlumnMax = cantidadAlumnMax;
        this.notaAprobar = notaAprobar;
    }

	//GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHorario() {
        return horario;
    }

    public void setHorario(Integer horario) {
        this.horario = horario;
    }

    public Integer getCantidadAlumnMax() {
        return cantidadAlumnMax;
    }

    public void setCantidadAlumnMax(Integer cantidadAlumnMax) {
        this.cantidadAlumnMax = cantidadAlumnMax;
    }

    public Double getNotaAprobar() {
        return notaAprobar;
    }

    public void setNotaAprobar(Double notaAprobar) {
        this.notaAprobar = notaAprobar;
    }

    //FUNCIONES

    //decidi dejarla sin funcion

	//TOSTRING
    
    @Override
    public String toString() {
        return "Materia { nombre: " + nombre + ", horario: " + horario + ", cantidadAlumnMax: " + cantidadAlumnMax + ", notaAprobar: " + notaAprobar + "} ";
    }

}
