package ciu.concurrencia.hilos.herencia;

public class Main {

	public static void main(String[] args) {
		System.out.println("inicio hilo principal");
		Thread hiloUno = new ThreadHerencia("hola");
		Thread hiloDos = new ThreadHerencia("chau");
		System.out.println("inicio hilos");
		hiloUno.start();
		hiloDos.start();
		System.out.println("fin hilos / fin hilo principal");
	}

}
