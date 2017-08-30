package modelo;

import java.lang.reflect.Array;

public class ArregloUnidimensional {

	int vector[];

	public ArregloUnidimensional(int[] vector) {
		super();
		this.vector = vector;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	
	public int traerElmenor(){
		int i ;
		int min = 999999;
		for ( i=Array.getLength(vector) ; i == 0; i-- ){
			if (vector[i]>min){
				min = vector[i];
			}
		}
		
		return min;
	}
}