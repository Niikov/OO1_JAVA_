package modelo;

import modelo.Punto;

public class Circulo {

	double radio;
	Punto origen;
	

	public Circulo(double radio, Punto origen) {
		super();
		this.radio = radio;
		this.origen = origen;
	}
	

	public Punto getOrigen() {
		return origen;
	}



	public void setOrigen(Punto origen) {
		this.origen = origen;
	}



	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public  void setRadio(Punto radio){ 
		this.radio = radio.calcularDistancia(this.origen);
		
	}
	
	public boolean equals(Circulo c){
		if ( this.origen == c.getOrigen() && this.radio == c.getRadio() ){
			return true;
		}else {return false;}
	}
	
	public double calcularPerimetro(){
		return (2*Math.PI)*this.radio;
		}
	
	public double calcularArea(){
		return Math.PI*(Math.pow(this.radio, 2));
	}
	
	public double calcularDistancia(Circulo c){
		return c.origen.calcularDistancia(this.origen);
	}
	

	public String toString(){
		return "Radio : "+this.radio+" "+"Origen : "+this.origen;
	}
}