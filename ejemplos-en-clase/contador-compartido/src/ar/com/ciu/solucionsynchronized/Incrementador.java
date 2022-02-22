package ar.com.ciu.solucionsynchronized;

public class Incrementador extends Thread {

	public Incrementador() {
		super();
	}

	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 1000; j++) {
			}
			Contador.incrementar(1);
		}
	}

}
