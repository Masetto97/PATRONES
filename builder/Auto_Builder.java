package org.escuela.oesia.patrones.builder;

public abstract class Auto_Builder {
	
protected Auto auto;
	
	public Auto getAuto() {
		return auto;
	}
	
	public void createObjetc() {
		auto = new Auto();
	}
	
	public abstract void  buildMotor();
	public abstract void  buildMarca();
	public abstract void  buildModelo();
	public abstract void  buildCant_puertas();
}
