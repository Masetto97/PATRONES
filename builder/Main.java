package org.escuela.oesia.patrones.builder;

public class Main {

	public static void main(String[] args) {
		
		Taller taller = new Taller();

		Auto_Builder ford = new ConcreteB_Ford();
		Auto_Builder fiat = new ConcreteB_fiat();

		taller.setAutoBuilder(fiat);
		taller.createAuto();
		
		Auto auto = taller.getAuto();

		System.out.println();
	}

}
