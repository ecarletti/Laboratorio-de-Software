package ej1b;

public class TestInstrumentoMusical {
	public static void main(String[] args) {
		InstrumentoDeViento v = new InstrumentoDeViento();
		InstrumentoDeCuerda c = new InstrumentoDeCuerda();
		
		v.hacerSonar();
		v.queEs();
		c.hacerSonar();
		c.queEs();
	}
}
