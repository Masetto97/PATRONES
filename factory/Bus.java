package org.escuela.oesia.patrones.factory;

public class Bus implements Fabrica{

	protected int codeBus=90002;
	
	public void senObject() {
		System.out.println("El codigo del Bus es: "+ codeBus);
		
	}
	
}
