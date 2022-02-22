package ar.com.ciu.sinsolucion;

public class MainContadorCompartido {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();

		System.out.println("valor contador: " + Valor.contador);
		
		a.start();
		b.start();

		while ( !"TERMINATED".equals(a.getState().name()) && !"TERMINATED".equals(b.getState().name()) ) {
			continue;
		}

		System.out.println("valor contador: " + Valor.contador);

	}

}
