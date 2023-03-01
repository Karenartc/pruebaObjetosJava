package com.generation.pruebaobejtosjava0103.models;

import java.util.ArrayList;

public class AlumnoViejo extends Alumno{
    //AlumnoViejo: ultimoCurso, anioEgreso. funcion: trabajar

    //ATRIBUTOS

    public String ultimoCurso;
    public Integer anioEgreso;

    //CONSTRUCTORES

    public AlumnoViejo() {
        super();
    }
    
    public AlumnoViejo(String nombre, Integer edad, String curso, Integer rut, String residencia,
    ArrayList<Double> notas, String ultimoCurso, Integer anioEgreso) {
        super(nombre, edad, curso, rut, residencia, notas);
        this.ultimoCurso = ultimoCurso;
        this.anioEgreso = anioEgreso;
    }
    
    //GETTERS Y SETTERS
    
    public String getUltimoCurso() {
        return ultimoCurso;
    }

    public void setUltimoCurso(String ultimoCurso) {
        this.ultimoCurso = ultimoCurso;
    }

    public Integer getAnioEgreso() {
        return anioEgreso;
    }

    public void setAnioEgreso(Integer anioEgreso) {
        this.anioEgreso = anioEgreso;
    }
    
    //FUNCIONES

    public void trabajar(){
        System.out.println("Regresenme a cuando estudiaba :c");
    }

    //TOSTRING
    
    @Override
    public String toString() {
        return super.toString() + "AlumnoViejo { ultimoCurso: " + ultimoCurso + ", anioEgreso: " + anioEgreso + " }";
    }

}
