package ciu.concurrencia.hilo.autonomo;

public class Autonomo implements Runnable {

	public Autonomo(String name) {
		super();
		new Thread(this, name).start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
