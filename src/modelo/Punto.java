package modelo;

public class Punto {
	double x,y;

	// Constructor
		public Punto(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

	// Getters and Setters
		
		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}
		
	// Metodos
		
		public String toString(){
			
			return String.valueOf(this.getX()+this.getY());
		}
		
		
		public boolean equals(Punto p){
			 if (p.getX()==p.getY()){
				  
				 return true;
				 
			 }else{ return false;} 
		}
		
		public double calcularDistancia (Punto p){
			double resultado;
			resultado = Math.sqrt(Math.pow((this.getX()-p.getX()), 2)+Math.pow((this.getY()- p.getY()), 2));
			return resultado;
		}
			
}