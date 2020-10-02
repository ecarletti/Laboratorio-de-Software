package ej6;

import java.util.Arrays;

public class TestPaint {

	public static void main(String[] args) {
		
		Paint p = new Paint();
		p.init();
		
		FiguraGeometrica[] fg = p.getPaleta();
		
		// usamos sort de .util.Arrays, y lo ordena segun lo definimos en figuraGeometrica
		// ya que reescribimos el metodo para comparar
        Arrays.sort(fg);
		
		for (int i=0; i < fg.length; i++) {
			FiguraGeometrica f = fg[i];
			System.out.println(f + " -------> con area " + f.area());
			if (f instanceof Circulo) {
				Circulo casted = (Circulo) f;
				System.out.println(" ----> con radio " + casted.getRadio());;
			}
			
		}
		
		
		
	}
}
