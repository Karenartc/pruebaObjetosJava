package com.generation.pruebaobejtosjava0103.models;
import java.util.ArrayList;

public class Alumno {
    //Alumno: nombre, edad, curso, rut, residencia, notas. funcion: aprender
    //ObjetoPadre

    //ATRIBUTOS

    public String nombre;
    public Integer edad;
    public String curso;
    public Integer rut;
    private String residencia;
    public ArrayList<Double> notas;

    //CONSTRUCTORES

    public Alumno() {
    }

    public Alumno(String nombre, Integer edad, String curso, Integer rut, String residencia, ArrayList<Double> notas) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
        this.rut = rut;
        this.residencia = residencia;
        this.notas = notas;
    }

    //GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
        this.rut = rut;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }

    //FUNCION

    public void aprender(){
        System.out.println("\n¡Estoy feliz de aprender en este Colegio!");
    }
    
    //TOSTRING

    @Override
    public String toString() {
        return "Alumno { nombre: " + nombre + ", edad: " + edad + ", curso: " + curso + ", rut: " + rut + ", residencia: " + residencia + ", notas: " + notas + " }";
    }
    
}
