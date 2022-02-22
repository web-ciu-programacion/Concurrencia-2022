package ar.com.ciu.sinsolucion;

public class B extends Thread {

	public void run() {
		for (int i = 0; i < 5000; i++) {
			Valor.contador ++;
		}
	}


}
