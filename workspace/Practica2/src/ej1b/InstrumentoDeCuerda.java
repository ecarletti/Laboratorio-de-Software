package ej1b;


// Se agrego la clase afinar, porq si esta en la interface es obligatorio

public class InstrumentoDeCuerda implements InstrumentoMusical{

	@Override
	public void hacerSonar() {
		// TODO Auto-generated method stub
		System.out.println("Instrumento de Viento");
	}

	@Override
	public String queEs() {
		// TODO Auto-generated method stub
		return "Instrumento de cuerda";
	}

	@Override
	public void afinar() {
		System.out.println("afinando Instrumento de cuerda");
		
	}

	

}
