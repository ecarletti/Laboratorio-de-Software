package ej1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Alumno> col = new ArrayList<Alumno>();
		for (int i = 0; i < 10; i++) {
			col.add(new Alumno(i,i,"Alumno"+i,"Apellido"+i));
		}
		
		Materia m = new Materia("Matematica",col);
		
		System.out.println(m.getAlumnos());
		m.addAlumno(new Alumno(30,30,"AlumnoAgregado","ApellidoAgregado"));
		System.out.println(m.getAlumnos());
	}

}
