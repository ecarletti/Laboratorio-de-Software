package ej6;

public class Circulo extends FiguraGeometrica {

	private int radio;
	
	public Circulo(String color, int radio) {
		super(color);
		this.setRadio(radio);
	}

	public int getRadio() {
		return radio;
	}
	
	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public void dibujar() {
		System.out.println("Se dibuja un circulo de radio " + this.getRadio() + 
				" y color " + this.getColor());
	}
	
	@Override
	public int area() {
		//Formula para sacar el area de un circulo
		return (int)(Math.PI * Math.pow(radio,2));
	}

	@Override
	public String toString() {
		return "Circulo{" +
                "color=" + this.getColor() +
                ", radio=" + radio +
                '}';
    }
	
}
