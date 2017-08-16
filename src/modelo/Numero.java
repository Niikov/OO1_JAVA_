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
		int resultado=0;
		
		for (contador = 1; contador<=this.n; contador++){
			if ( this.n%contador == 0){
				++resultado;
			}
			
		}
		
		if (resultado ==2){
			return true;
			
		}else {return false;}
		
	
		
	}
	
	public String convertirAString(){
		return String.valueOf(n);
		
	}
	
	public double convertirDouble(){
		double resultado;
		resultado = Double.parseDouble(this.convertirAString());
		return resultado;
		
	}
	
	public double calcularPotencia (int exp){
		
		return Math.pow(this.convertirDouble(), Double.parseDouble(String.valueOf(exp)));
	}
	
	public String pasarBase2(){
		int resultado ;
		resultado = (this.n* this.n);
		return String.valueOf(resultado);
		
	}
	
	public int calcularFactorial(){
		int resultado=0;
		int contador;
		if (this.n <= 0 ){
			resultado = 1;
			return resultado;
		} else {
			for ( contador = 1; contador < this.n ; contador--){
				resultado = resultado + ( contador * (contador+1));}
			
			return resultado;}
		
	}
		
		public int calcularFactorial(int n1){
			int resultado=0;
			int contador;
			if (n1 <= 0 ){
				resultado = 1;
				return resultado;
			} else {
				for ( contador = 1; contador < n1 ; contador--){
					resultado = resultado + ( contador * (contador+1));}
				
				return resultado;
			}
		
	}
	
	public double numeroCombinatorio(int n1){
		double resultado=0;
		if(  this.n >= 0 && n1 >=0){
			
			resultado = this.calcularFactorial()/ this.calcularFactorial(n1)*this.calcularFactorial(this.n-n1);
			return resultado;
		} else {return resultado;}
	}	
		
}


		
		


	
