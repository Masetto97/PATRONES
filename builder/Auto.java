package org.escuela.oesia.patrones.builder;

public class Auto {

//CLASE PRODUCTO

	private String motor = "";
	private String marca = "";
	private String modelo = "";
	private int CANT_PUERTAS = 0;

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setCANT_PUERTAS(int cANT_PUERTAS) {
		CANT_PUERTAS = cANT_PUERTAS;
	}

	public String getMotor() {
		return motor;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getCANT_PUERTAS() {
		return CANT_PUERTAS;
	}

	
	
}
