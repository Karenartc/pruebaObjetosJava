package com.generation.pruebaobejtosjava0103;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.pruebaobejtosjava0103.models.Alumno;
import com.generation.pruebaobejtosjava0103.models.Profesor;

@SpringBootApplication
public class Pruebaobejtosjava0103Application {

	//para ingresar y crear un hashmap de alumnos
	public static HashMap<String, ArrayList<Double>> ingresarAlumn(Scanner teclado){
		HashMap<String, ArrayList<Double>> cuaderNotas = new HashMap<String, ArrayList<Double>>(); 

		System.out.print("\n¿Cuántos alumnos hay en su curso? ");
		  int cantidadAlumn = teclado.nextInt();

		  System.out.print("\n¿Cuántas notas tuvo este curso? ");
			int cantidadNotas = teclado.nextInt();

			for(int i = 1; i <= cantidadAlumn; i++){
				//creo objeto alumno (solo ingresare dos datos, puede buscra mas abajo o en el file que mas se puede ingresar)
				Alumno alumnoCurso = new Alumno();
				//Guarda las notas
				ArrayList<Double> notasAlumn = new ArrayList<Double>();
				teclado.nextLine();
	 
				System.out.print("\nIngrese el nombre del alumno n°"+i+": ");
				alumnoCurso.setNombre(teclado.nextLine());
	
				for(int x = 1; x <= cantidadNotas; x++){
					Double nota= 0.0;
					do{
						System.out.print("Ingrese las nota "+x+" del alumno n°"+i+": ");
						nota = teclado.nextDouble();
					}while(nota <1.0 || nota >7.0);
					notasAlumn.add(nota);
				}
				alumnoCurso.setNotas(notasAlumn);
				cuaderNotas.put(alumnoCurso.getNombre(), notasAlumn);
			  }
		return cuaderNotas;	  
	}

	//Ingresar nota por estudiante, luego obtener el promedio de cada uno
	public static Double promedioNota(ArrayList<Double> notaAlumn){
		Double sumaNotas = 0.0;
		for(int i = 0; i < notaAlumn.size(); i++){
			sumaNotas += notaAlumn.get(i);
		}
		return sumaNotas/notaAlumn.size();
	}

	//guarda en array una cantidad de alumno por curso y luego los muestra
	public static void mostarAlumn(Scanner teclado, HashMap<String, ArrayList<Double>> cuadernoAlumn){
		//guarda solo la cantidad ingresada de nombres
		ArrayList<String> nombresAlumn = new ArrayList<String>();
		//guarda todos los nombre del hashmap
		ArrayList<String> todosnombresAlumn = new ArrayList<String>();


		for(String x : cuadernoAlumn.keySet()){
			todosnombresAlumn.add(x);
		}
		System.out.print("\n¿Cuántos alumnos quiere mostar del curso?");
		int cantidadAlumn = teclado.nextInt();

		for(int i = 0; i < cantidadAlumn; i++){
			nombresAlumn.add(todosnombresAlumn.get(i));
		}
		System.out.println("\nLe mostrare los nombres de " + cantidadAlumn + " alumnos");
		System.out.println("Los cuales son: " + nombresAlumn);

	}


	//dado arreglo, obtener mejor, peor y promedio notas
	public static void mejorPeorPromedio(ArrayList<Double> notaAlumn, String nombreAlumn){
		Double mejorNota = 0.0;
		Double peorNota = 7.0;
		Double promedio = promedioNota(notaAlumn);

		for(int i = 0; i < notaAlumn.size(); i++){
			if(notaAlumn.get(i) > mejorNota){
				mejorNota = notaAlumn.get(i);
			}
			if(notaAlumn.get(i) < peorNota){
				peorNota = notaAlumn.get(i);
			}
		}

		System.out.println("\nEl Alumno " + nombreAlumn + " tiene un promedio de notas de " + promedio);
			System.out.println("Con la mejor nota de (" + mejorNota + ") y la peor nota de ("+ peorNota + ")");
	}

	public static void main(String[] args) {
		/*
		 * Crear objetos:
		 * 1. Cursos: id, seccion, cantidadAlumn, añocursa. funcion: notaPromedioGeneral *
		 * 2. Profesor: nombre, telefono, rut, materiaImparte, sueldo. funcion: educar *
		 * 3. Materia: nombre, horario, cantidadAlumnMax, notaAprobar. *
		 * 4. Alumno: nombre, edad, curso, rut, residencia, notas. funcion: aprender *
		 * 5. AlumnoNuevo: colegioProviene, primeraVez. funcion: aprenderMucho *
		 * 6. AlumnoViejo: ultimoCurso, anioEgreso. funcion: trabajar *
		 */

		 /*
		  * Funciones:
		  * 1. Ingresar nota por estudiante, luego obtener el promedio de cada uno
		  * 2. guarda en array una cantidad de alumno por curso y luego los muestra
		  * 3. dado arreglo, obtener mejor, peor y promedio notas
		  *
		  */
		
		  Scanner teclado = new Scanner(System.in);
		  int opcion = 3;

		  System.out.println("\nBienvenido al Colegio Hamilton");
		  System.out.println("Por favor Identifiquese: ");

		  Profesor profealMando = new Profesor();

		  System.out.print("¿Cuál es su nombre? ");
		  profealMando.setNombre(teclado.nextLine());
		  System.out.print("¿Qué materia imparte? ");
		  profealMando.setMateriaImparte(teclado.nextLine());
		  
		  HashMap<String, ArrayList<Double>> alumnosClase = ingresarAlumn(teclado);

		  while(opcion != 0){
			System.out.println("\n-------- Menu --------");
			System.out.println("1. Promedio de Notas");
			System.out.println("2. Nombre Estudiantes");
			System.out.println("3. Mejor, Peor y Promedio de Notas");
			System.out.println("0. Salir del Menu");

			do{
				System.out.print("\nIngrese una opcion: ");
				opcion = teclado.nextInt();
			}while(opcion < 0 || opcion > 3);
			
			if(opcion == 1){
				for(String i : alumnosClase.keySet()){
					Double promedio = promedioNota(alumnosClase.get(i));
					System.out.println("El alumno " +i+ " tiene un promedio de " + promedio);
				}
			}else if(opcion == 2){
				mostarAlumn(teclado, alumnosClase);
			}else if(opcion == 3){
				for(String i : alumnosClase.keySet()){
					mejorPeorPromedio(alumnosClase.get(i), i);
				}
			}else{
				System.out.println("\nHa elegido la opcion Numero 0");
				System.out.println("Muchas Gracias por usar el Aplicativo");
				System.out.println("tenga Buen Día :D");
			}
		}
		
	}

}
