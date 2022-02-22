package ar.com.ciu.sinsolucion;

public class A extends Thread {

	public void run() {
		for (int i = 0; i < 3000; i++) {
			Valor.contador ++;
		}
	}

}
