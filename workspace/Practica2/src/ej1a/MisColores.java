package ej1a;

public class MisColores implements ColImpresion, ColorArcoIris{
	private int unColor;
	
	public MisColores() {
		// se agrego colorArcoIris.Amarillo ya que Amarillo no estaba bien implementado
		unColor= ColorArcoIris.AMARILLO;
	}

	public int getUnColor() {
		return unColor;
	}
}
