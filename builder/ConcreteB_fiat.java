package org.escuela.oesia.patrones.builder;

public class ConcreteB_fiat extends Auto_Builder{

	@Override
	public void buildMotor() {
		auto.setMotor("Gasolina");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Fiat");
		
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Punto");
		
	}

	@Override
	public void buildCant_puertas() {
		auto.setCANT_PUERTAS(4);
		
	}

}
