package com.generation.pruebaobejtosjava0103.models;

public class Curso {
    //Cursos: id, seccion, cantidadAlumn, añocursa. funcion: notaPromedioGeneral
    //no lo utilizo en el main

    //ATRIBUTOS

    public Integer idCurso;
    public String Seccion;
    public Integer cantidadAlumn;
    public Integer anioCursa;

	//CONSTRUCTORES
    
    public Curso() {
    }

    public Curso(Integer idCurso, String seccion, Integer cantidadAlumn, Integer anioCursa) {
        this.idCurso = idCurso;
        Seccion = seccion;
        this.cantidadAlumn = cantidadAlumn;
        this.anioCursa = anioCursa;
    }

	//GETTERS Y SETTERS

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getSeccion() {
        return Seccion;
    }

    public void setSeccion(String seccion) {
        Seccion = seccion;
    }

    public Integer getCantidadAlumn() {
        return cantidadAlumn;
    }

    public void setCantidadAlumn(Integer cantidadAlumn) {
        this.cantidadAlumn = cantidadAlumn;
    }

    public Integer getAnioCursa() {
        return anioCursa;
    }

    public void setAnioCursa(Integer anioCursa) {
        this.anioCursa = anioCursa;
    }

    //FUNCIONES

    public void promedioGeneral(Double sumaNotas){
        System.out.println("El promedio general del curso es: " + (sumaNotas/cantidadAlumn));
    }

	//TOSTRING

    @Override
    public String toString() {
        return "Curso { idCurso: " + idCurso + ", Seccion: " + Seccion + ", cantidadAlumn: " + cantidadAlumn
        + ", anioCursa: " + anioCursa + " }";
    }
}