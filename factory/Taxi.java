package org.escuela.oesia.patrones.factory;

public class Taxi implements Fabrica{
		
	protected int codeTaxi=90001;
	

	public void senObject() {
		Taxi taxi= new Taxi();
		System.out.println("El c�digo del Taxi es: "+ codeTaxi);
	}
}
