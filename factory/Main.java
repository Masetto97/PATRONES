package org.escuela.oesia.patrones.factory;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Coche coche = new Coche(); 
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		while (true) {

			System.out.println(" ");
			System.out.println("Ingrese la opcion correspondiente para obtener el codigo del servicio");
			System.out.println("1. Codigo servicio de Taxis");
			System.out.println("2. Codigo servicio de Buses");
			System.out.println("3. Codigo servicio de Coches");

			Scanner enter = new Scanner(System.in);
			int option = enter.nextInt();

			if (option == 1 || option == 2 || option == 3) {

				switch (option) {

				case 1:
					taxi.senObject();
					
				case 2:
					bus.senObject();
					
				case 3:
			
					coche.senObject();
				default:
					System.out.println(" ");
					System.out.println("¿Desea consultar algun codigo?");
				}
			}
		}

	}

}
