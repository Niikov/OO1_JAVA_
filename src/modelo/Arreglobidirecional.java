package modelo;

import java.lang.reflect.Array;

public class Arreglobidirecional {

	double matrizA[][];

	public Arreglobidirecional(double[][] matrizA) {
		super();
		this.matrizA = matrizA;
	}

	public double[][] getMatrizA() {
		return matrizA;
	}

	public void setMatrizA(double[][] matrizA) {
		this.matrizA = matrizA;
	}
	
	public boolean compararMatriz(double[][] matrizB){
		
		if (Array.getLength(matrizA)==Array.getLength(matrizB)){
			return true;
		}else return false;
	}
	/*public double[][] sumar(double[][] matrizB){
		double matrizsuma[][];
		if (compararMatriz(matrizB) == true){
			
		}else { System.out.println("No son Cuadradas");
		return matrizB; }
		
	}
*/
}
