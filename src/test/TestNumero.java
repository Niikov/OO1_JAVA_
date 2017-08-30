package test;

import modelo.Numero;
import modelo.Punto;

public class TestNumero {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Numero numero1 = new Numero(7);
		Numero numero2 = new Numero(1857);
		Numero numero3 = new Numero (4);
		System.out.println("Primo: Verdadero o falso");
		System.out.println("¿Es numero primo el numero "+numero1.getN()+"? "+numero1.esPrimo());
		System.out.println("¿Es numero primo el numero "+numero2.getN()+"? "+numero2.esPrimo());
		System.out.println("¿Es numero primo el numero "+numero3.getN()+"? "+numero3.esPrimo());
		
		System.out.println("Sumas:");
		System.out.println(numero1.getN()+"+5 ="+numero1.sumar(5));
		System.out.println(numero2.getN()+"+20 ="+numero2.sumar(20));
		System.out.println(numero3.getN()+"+6 ="+numero3.sumar(6));
		
		System.out.println("Multiplicaciones");
		System.out.println(numero1.getN()+"*5 ="+numero1.multiplicar(5));
		System.out.println(numero2.getN()+"*20 ="+numero2.multiplicar(20));
		System.out.println(numero3.getN()+"*6 ="+numero3.multiplicar(6));
		
		System.out.println("Es par: Verdadero o falso");
		System.out.println(numero1.getN()+" ? "+numero1.esPar());
		System.out.println(numero2.getN()+" ? "+numero2.esPar());
		System.out.println(numero3.getN()+" ? "+numero3.esPar());
		
		
		System.out.println("Calcular potencia");
		
		System.out.println(numero1.getN()+" = "+numero1.calcularPotencia(2));
		System.out.println(numero2.getN()+" = "+numero2.calcularPotencia(2));
		System.out.println(numero3.getN()+" = "+numero3.calcularPotencia(2));
		
		
		System.out.println("---------- Metodos Punto --------------");
		
		Punto punto1 = new Punto (7,15);
		Punto punto2 = new Punto (47,4);
		Punto punto3= new Punto (7,15);
		
		System.out.println(punto1.toString());
		System.out.println(punto2.toString());
		System.out.println(punto1.equals(punto2));
		System.out.println(punto1.equals(punto3));
		System.out.println("Distancia entre 2 puntos");
		System.out.println(punto1.calcularDistancia(punto2));
		
	}

}