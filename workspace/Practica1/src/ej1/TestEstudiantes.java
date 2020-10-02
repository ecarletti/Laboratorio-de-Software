package ej1;

public class TestEstudiantes {
	
	public static void main(String[] args) {
			Estudiante [] array = {
					new Estudiante("eze", "carl", 123456),
					new Estudiante("nahu", "dic", 123457),
					new Estudiante("esteban", "debo", 123458)
					
			};
			
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		
			
			Estudiante e1 = new Estudiante("roman", "riquelme", 12341);
			Estudiante e2 = new Estudiante("roman", "riquelme", 12341);

			System.out.println("Estudiante1 y Estudiante2 son (eq): " + e1.equals(e2));
			System.out.println("Estudiante1 y Estudiante2 son (==): " + (e1 == e2));
			System.out.println("Estudiante1 hashcode: " + e1.hashCode());
			System.out.println("Estudnate2 hashcode: " + e2.hashCode());
			
		
	}

}
