package ej1b;

// Se quito el abstract y se agrego el metodo afinar xq es obligatorio para una clase no abstracta

public class InstrumentoDeViento implements InstrumentoMusical {

	@Override
	public void hacerSonar() {
		// TODO Auto-generated method stub
		System.out.println("Sonar Vientos");
		
	}

	@Override
	public String queEs() {
		// TODO Auto-generated method stub
		return "Instrumento de Viento";
	}
	
    @Override
    public void afinar() {
        System.out.println("afinando Instrumento de Viento");
    }
	
}