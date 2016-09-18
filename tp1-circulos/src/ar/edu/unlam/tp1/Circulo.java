package ar.edu.unlam.tp1;

public class Circulo {
	
	private Double radio;
	
	public Double calcularArea(){
		Double area;
		area=(Math.PI)*(radio*radio);
		return area;
	}
	public Double calcularPerimetro(){
		Double perimetro;
		perimetro=(Math.PI)*2*radio;
		return perimetro;
	}
	public void setRadio(Double radio){
		this.radio=radio;
	}
	public Double getRadio(){
		return radio;
	}

}
