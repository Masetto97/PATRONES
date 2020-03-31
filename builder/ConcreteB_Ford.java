package org.escuela.oesia.patrones.builder;

public class ConcreteB_Ford extends Auto_Builder {

	@Override
	public void buildMotor() {
		auto.setMotor("Diesel");
		
	}

	@Override
	public void buildMarca() {
		auto.setMarca("Focus");
		
	}

	@Override
	public void buildModelo() {
		auto.setModelo("Focus");
		
	}

	@Override
	public void buildCant_puertas() {
		auto.setCANT_PUERTAS(3);
		
	}

}
