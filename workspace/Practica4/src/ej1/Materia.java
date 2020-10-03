package ej1;

import java.util.*;

public class Materia {
	private String nombre;
	private SortedSet<Alumno> alumnos = new TreeSet<>(Alumno.ComparadorPorLegajo.INSTANCE);
	
	public Materia(String nombre, Collection<Alumno> col) {
		this.nombre = nombre;
		this.alumnos.addAll(col);
	}
	
	public SortedSet<Alumno> getAlumnos(){
		return alumnos;
	}
	
	public void addAlumno (Alumno a) {
		this.alumnos.add(a);
	}
	

}
