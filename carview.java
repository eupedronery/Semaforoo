package view;

import java.util.concurrent.Semaphore;

import SO.carros;

public class carview {

	public static void main(String[] args) {
		String[] direcoes = { "Norte para o Sul", "Leste para o Oeste", "Oeste para o Leste", "Sul para o Norte" };
		Semaphore semaforo = new Semaphore(1);
		for (int i = 1; i < 5; i++) {
			carros car = new carros(direcoes[i - 1], semaforo);
			car.start();
		}
	}
}