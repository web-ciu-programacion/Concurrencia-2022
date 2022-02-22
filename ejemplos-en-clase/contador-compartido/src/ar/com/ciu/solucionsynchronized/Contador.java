package ar.com.ciu.solucionsynchronized;

public class Contador {

	private static int valor = 0;

	public static synchronized void incrementar(int i) {
		valor+=i;
	}

	public static int getValor() {
		return valor;
	}

}
