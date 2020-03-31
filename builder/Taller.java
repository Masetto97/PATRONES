package org.escuela.oesia.patrones.builder;

public class Taller {

	private Auto_Builder autoBuilder;

	public Auto getAuto() {
		return autoBuilder.getAuto();
	}

	public void setAutoBuilder(Auto_Builder autoBuilder) {
		autoBuilder = autoBuilder;
	}
	
	public void createAuto() {
		autoBuilder.createObjetc();
		autoBuilder.buildMotor();
		autoBuilder.buildMarca();
		autoBuilder.buildModelo();
		autoBuilder.buildCant_puertas();
	}
	
}
