package ar.com.ciu.solucionsemaforos;

import java.util.concurrent.Semaphore;

public class Main {

	public static void main(String[] args) {
		Semaphore s = new Semaphore(1);

		Thread inc1 = new Incrementador(s);
		Thread inc2 = new Incrementador(s);
		inc1.start();
		inc2.start();

		while ( inc1.isAlive() || inc2.isAlive() ) {
			continue;
		}

		System.out.println(Contador.valor);

	}

}
