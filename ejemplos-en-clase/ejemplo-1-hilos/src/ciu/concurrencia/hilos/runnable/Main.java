package ciu.concurrencia.hilos.runnable;

public class Main {

	public static void main(String[] args) {
		System.out.println("inicio hilo principal");
		Thread h1 = new Thread(new ThreadRunnable(), "hola");
		Thread h2 = new Thread(new ThreadRunnable(), "chau");
		System.out.println("inicio hilos");
		h1.start();
		h2.start();
		System.out.println("fin hilos / fin hilo principal");
	}

}
