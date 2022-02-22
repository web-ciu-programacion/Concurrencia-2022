package ar.com.ciu.solucionsynchronized;

public class Main {

	public static void main(String[] args) {

		Thread inc1 = new Incrementador();
		Thread inc2 = new Incrementador();
		inc1.start();
		inc2.start();

		while ( inc1.isAlive() || inc2.isAlive() ) {
			continue;
		}

		System.out.println(Contador.getValor());

	}

}
