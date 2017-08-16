package modelo;

public class Numero {

	int n;

	// Constructor
	public Numero(int n) {
		super();
		this.n = n;
	}

	// Getters and Setters
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	// Metodos
	
	public int sumar(int n1){
		return this.n+n1;
	}
	
	public int multiplicar(int n1){
		return this.n*n1;
	}
	
	public boolean esPar(){
		if( this.n%2 != 1){
			return false;
		}else return true;
	}
	
	public boolean esPrimo(){
		int contador;
		boolean resultado = false;
		for( contador= this.n-1 ; contador >= 1; --contador){
			if ( contador%2 == 0 ){
				resultado = false;}
			else {resultado = true;}
			
		}
		
		return resultado;
		
	}
	
	public String convertirAString(){
		return String.valueOf(n);
		
	}
		
		
}


	
