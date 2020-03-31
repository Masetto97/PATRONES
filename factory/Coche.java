package org.escuela.oesia.patrones.factory;

public class Coche implements Fabrica{

//	protected static final int CODE_CAR = 90003;
//	private int codeCar;
//	
//	public Coche(int codeCar) {
//		this.codeCar = codeCar;
//	}
//
//	@Override
//	public void senObject() {
//		System.out.println("El codigo del Coche es: " + getCodeCar());
//	}
//
//	public void setCodeCar(int codeCar) {
//		this.codeCar = codeCar;
//	}
//
//	public int getCodeCar() {
//		return codeCar;
//	}
//	
	protected int codeCoche=90001;
	
	
	public void senObject() {
		System.out.println("El código del Coche es: "+ codeCoche);
	}
	
	
	
}
