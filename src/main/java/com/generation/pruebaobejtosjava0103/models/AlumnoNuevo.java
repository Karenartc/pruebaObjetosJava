package com.generation.pruebaobejtosjava0103.models;

import java.util.ArrayList;

public class AlumnoNuevo extends Alumno {
    //AlumnoNuevo: colegioProviene, primeraVez. funcion: aprenderMucho

    //ATRIBUTOS

    public String colegioProviene;
    public Boolean primeraVez;
    
    //CONSTRUCTORES
    
    public AlumnoNuevo() {
        super();
    }

     public AlumnoNuevo(String nombre, Integer edad, String curso, Integer rut, String residencia,
            ArrayList<Double> notas, String colegioProviene, Boolean primeraVez) {
        super(nombre, edad, curso, rut, residencia, notas);
        this.colegioProviene = colegioProviene;
        this.primeraVez = primeraVez;
    }
    
    //GETTERS Y SETTERS

    public String getColegioProviene() {
        return colegioProviene;
    }

    public void setColegioProviene(String colegioProviene) {
        this.colegioProviene = colegioProviene;
    }

    public Boolean getPrimeraVez() {
        return primeraVez;
    }

    public void setPrimeraVez(Boolean primeraVez) {
        this.primeraVez = primeraVez;
    }
    
    //FUNCIONES

    public void aprenderMucho(){
        System.out.println("Debo esforzarme mucho más");
    }
    
    //TOSTRING
    
    @Override
    public String toString() {
        return super.toString() + "AlumnoNuevo { colegioProviene: " + colegioProviene + ", primeraVez: " + primeraVez + " }";
    }

}
