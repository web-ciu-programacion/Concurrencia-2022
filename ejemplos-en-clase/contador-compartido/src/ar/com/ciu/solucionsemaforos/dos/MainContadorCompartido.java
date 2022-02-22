package ar.com.ciu.solucionsemaforos.dos;

import java.util.concurrent.Semaphore;

public class MainContadorCompartido {

	public static void main(String[] args) {

		Semaphore s = new Semaphore(1, true);

		A a = new A(s);
		B b = new B(s);

		System.out.println("valor contador: " + Valor.contador);
		
		a.start();
		b.start();

		while ( a.isAlive() || b.isAlive() ) {
			continue;
		}

		System.out.println("valor contador: " + Valor.contador);

	}

}
