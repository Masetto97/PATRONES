package org.escuela.oesia.patrones.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Tiempo implements Runnable {

	List<Tiempo> observador = new ArrayList<Tiempo>();

	private int hour;
	private int minutes;
	private int seconds;
	Thread hilo;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	private void notifik() {
		hilo.notify();
	}

	public void infinito() {

		while (true) {
			hilo = new Thread(this, "@@ Hilo 1");
			System.out.println("@@ ESTOY EN EJECUCION" + hilo);
			notifik();
		}
	}

	public void run() {
		hilo.start();
		infinito();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		notifik();
	}

	@Override
	public String toString() {
		return observador.toString();
	}

	public void addOberver(Tiempo observado) {
		observador.add((Tiempo) observado);
	}

	public void deleteObserver() {
		observador.clear();
	}

}
