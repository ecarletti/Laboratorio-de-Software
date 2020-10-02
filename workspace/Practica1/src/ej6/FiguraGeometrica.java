package ej6;

// el implemets se agrego de la practica 2 ej 2 es un metodo de ordenacion de java.utils.array 
public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{

	private String color;
	
	public FiguraGeometrica(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void dibujar();
	public abstract int area();
	

	//Se agrego para el punto practica 2 ej2
    @Override
    public int compareTo(FiguraGeometrica obj) {
        if (this.area() > obj.area()) return 1;
        if (this.area() == obj.area()) return 0;
        return -1;
    }
}
