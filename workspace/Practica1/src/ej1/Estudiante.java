package ej1;

import java.util.Objects;

public class Estudiante {

	private String nombre;
	private String apellido;
	private Integer legajo;
	
	
	public Estudiante(String nombre, String apellido, Integer legajo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.legajo = legajo;
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
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	
	@Override
	public String toString() {
		StringBuffer tmp = new StringBuffer("Estudiante{" );
			tmp.append(nombre);
			tmp.append(" ");
			tmp.append(apellido);
			tmp.append(" ");
			tmp.append(legajo);
			tmp.append("}");
			
		return tmp.toString();
		//return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", legajo=" + legajo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Estudiante that = (Estudiante) obj;
		return Objects.equals(nombre, that.nombre) &&
				Objects.equals(apellido, that.apellido) &&
				Objects.equals(legajo, that.legajo);

	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(nombre,apellido,legajo);
	}
	

	
	
}
