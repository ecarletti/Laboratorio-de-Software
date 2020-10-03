package ej6;

import java.util.Arrays;
import java.util.Comparator;


public class EstudianteTest {
	public static void main(String[] args) {
		Estudiante e1 = new Estudiante("Gallardo","Marcelo",50,13123,30);
		Estudiante e2 = new Estudiante("Riquelme","Juan",55,13120,25);
		Estudiante e3 = new Estudiante("Ponzio","Leo",37,13100,27);
		Estudiante e4 = new Estudiante("Prueba","Pruebin",0,12100,0);
		
		Estudiante[] est = {e1,e2,e3,e4};
		
		// Comparator Materias Aprobadas
		Arrays.sort(est, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				return arg0.getMateriasAprobadas() - arg1.getMateriasAprobadas();
			}});
		
		System.out.println("---- Materias Aprobadas Orden ----");
		
		for (int i = 0; i < est.length; i++) {
			System.out.println(est[i]);
		}
		
		// Comparator Edad
		Arrays.sort(est, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				return arg0.getEdad() - arg1.getEdad();
			}});
		
		System.out.println("---- Edad Orden ----");
		
		for (int i = 0; i < est.length; i++) {
			System.out.println(est[i]);
		}
		
		// Comparator Legajo
		Arrays.sort(est, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				return arg0.getLegajo() - arg1.getLegajo();
			}});
		
		System.out.println("---- Legajo Orden ----");
		
		for (int i = 0; i < est.length; i++) {
			System.out.println(est[i]);
		}
		
		// Comparator Nombre Apellido
		Arrays.sort(est, new Comparator<Estudiante>() {
			@Override
			public int compare(Estudiante arg0, Estudiante arg1) {
				int nombreCmp = arg0.getNombre().compareTo(arg1.getNombre());
				if (nombreCmp != 0) { return nombreCmp; }
				return arg1.getApellido().compareTo(arg0.getApellido());
				
			}});
		
		System.out.println("---- Nombre Apellido Orden ----");
		
		for (int i = 0; i < est.length; i++) {
			System.out.println(est[i]);
		}
		
		
		
	}

}
