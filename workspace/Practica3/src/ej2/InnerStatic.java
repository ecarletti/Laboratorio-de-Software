package ej2;

import java.util.Scanner;

// funcion pow()
import static java.lang.Math.pow;

public class InnerStatic {

	static double PI = 3.1416;
	
	static class Circulo {
		// borramos el valor 2 q venia en el pdf
		static double radio;
		
		static double getArea() {
			// implementamos scanner para escribir del teclado
			Scanner input = new Scanner(System.in);
			System.out.println("Ingrese el radio del circulo");
			setRadio(input.nextInt());
			System.out.println("Ingresaste: " + radio);
			// scanner
			
			double a = PI * pow(radio,2);
			System.out.println("El area es: " + a);
			return a;
		}
		
		public static void setRadio(double radio) {
			Circulo.radio = radio;
			
		}

		static double getLongitudCircunsferencia() {
			double l = 2 * PI * radio;
			System.out.println("La longitud es: " + l);
			return l;
		}
	}
}
