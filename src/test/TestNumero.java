package test;

import modelo.Numero;

public class TestNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numero numero1 = new Numero(7);
		Numero numero2 = new Numero(1857);
		Numero numero3 = new Numero (4);
		
		System.out.println(numero1.getN());
		System.out.println("¿Es numero primo? "+numero1.esPrimo());
		System.out.println("¿Es numero primo? "+numero2.esPrimo());
		System.out.println("¿Es numero primo? "+numero3.esPrimo());
	}

}
