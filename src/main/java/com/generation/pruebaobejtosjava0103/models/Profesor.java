package com.generation.pruebaobejtosjava0103.models;

public class Profesor {
    //Profesor: nombre, telefono, rut, materiaImparte, sueldo. funcion: educar

    //ATRIBUTOS

    public String nombre;
    public Integer telefono;
    public Integer rut;
    public String materiaImparte;
    public Double sueldo;

	//CONSTRUCTORES
    
    public Profesor() {
    }

    public Profesor(String nombre, Integer telefono, Integer rut, String materiaImparte, Double sueldo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.rut = rut;
        this.materiaImparte = materiaImparte;
        this.sueldo = sueldo;
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getMateriaImparte() {
        return materiaImparte;
    }

    public void setMateriaImparte(String materiaImparte) {
        this.materiaImparte = materiaImparte;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
    }

    //FUNCIONES

    public void educar(){
        System.out.println("Me enorgullece que mis alumnos aprendan :D");
    }

	//TOSTRING

    @Override
    public String toString() {
        return "Profesor { nombre: " + nombre + ", telefono: " + telefono + ", rut: " + rut + ", materiaImparte: "
        + materiaImparte + ", sueldo: " + sueldo + " }";
    }

}
