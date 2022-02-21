package ciu.concurrencia.hilos.runnable;

public class ThreadRunnable implements Runnable {

	public void run() {
		for (int i = 0; i < 100000; i++) {
			if ( (i%1000)==0 ) {
				System.out.println(Thread.currentThread().getName());	
			}
		}
	}

}
