package ej6;

public class Estudiante {
	

	private String apellido,nombre;
	private Integer edad,legajo,materiasAprobadas;
	
	public Estudiante(String apellido, String nombre, Integer edad, Integer legajo, Integer materiasAprobadas) {
		super();
		this.apellido = apellido;
		this.nombre = nombre;
		this.edad = edad;
		this.legajo = legajo;
		this.materiasAprobadas = materiasAprobadas;
	}
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
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
	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public Integer getMateriasAprobadas() {
		return materiasAprobadas;
	}
	public void setMateriasAprobadas(Integer materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	@Override
	public String toString() {
		return "Estudiante( Nombre: " + nombre + " /Apellido: "+ apellido +
				" /Edad: "+edad+" /Legajo: "+legajo+" /Materias aprobadas: "+materiasAprobadas+ ").";
	}

	
	
}
