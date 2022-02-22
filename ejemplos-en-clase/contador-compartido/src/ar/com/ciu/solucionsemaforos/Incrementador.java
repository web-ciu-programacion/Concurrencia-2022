package ar.com.ciu.solucionsemaforos;

import java.util.concurrent.Semaphore;

public class Incrementador extends Thread {

	private Semaphore s;

	public Incrementador(Semaphore s) {
		super();
		this.s = s;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				this.s.acquire();
				Contador.valor++;
				this.s.release();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
