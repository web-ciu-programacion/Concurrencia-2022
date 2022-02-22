package ar.com.ciu.solucionsemaforos.dos;

import java.util.concurrent.Semaphore;

public class A extends Thread {

	private Semaphore s;

	public A(Semaphore s) {
		super();
		this.s = s;
	}

	public void run() {
		for (int i = 0; i < 3000; i++) {
			try {
				this.s.acquire();
				Valor.contador ++;
				this.s.release();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
