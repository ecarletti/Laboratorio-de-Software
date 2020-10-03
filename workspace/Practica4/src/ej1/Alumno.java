package ej1;

import java.util.Comparator;

public class Alumno {
	private Integer legajo, dni;
	private String nombre, apellido;
	
	
	
	public Alumno(Integer numeroAlumno, Integer idAlumno, String nombre, String apellido) {
		super();
		this.legajo = numeroAlumno;
		this.dni = idAlumno;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public Integer getNumeroAlumno() {
		return legajo;
	}
	public void setNumeroAlumno(Integer numeroAlumno) {
		this.legajo = numeroAlumno;
	}
	public Integer getDni() {
		return dni;
	}
	public void setDni(Integer idAlumno) {
		this.dni = idAlumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "Alumno [legajo=" + legajo + ", dni=" + dni + ", nombre=" + nombre + ", apellido="
				+ apellido + "]";
	}

	public enum ComparadorPorLegajo implements Comparator<Alumno>{
		INSTANCE;

		@Override
		public int compare(Alumno arg0, Alumno arg1) {
			return arg0.getNumeroAlumno() - arg1.getNumeroAlumno();
		}
		

	}
	
	public enum ComparadorPorNyA implements Comparator<Alumno>{
		INSTANCE;

		@Override
		public int compare(Alumno arg0, Alumno arg1) {
			Integer res = arg0.getNombre().compareTo(arg1.getNombre());
			if (res == 0) { return arg0.getApellido().compareTo(arg1.getApellido());}
			return res;
		}
		
	}
}
