package ciu.concurrencia.hilos.herencia;

public class ThreadHerencia extends Thread {

	public ThreadHerencia(String name) {
		super(name);
	}

	public void run() {
		for (int i = 0; i < 100000; i++) {
			if ( (i%1000)==0 ) {
				System.out.println(Thread.currentThread().getName());	
			}
		}
	}

}
