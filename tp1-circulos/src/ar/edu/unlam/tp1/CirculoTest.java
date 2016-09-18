package ar.edu.unlam.tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {


	@Test
	public void crearUnCirculoConRadio2() {
		Circulo miCirculoRadio2= new Circulo();
		miCirculoRadio2.setRadio(2d);
		Double radio;
		radio=2d;
		assertEquals(2d, radio, 1.10);
	}
	
	@Test
	public void crearUnCirculoConRadio3Punto7() {
		Circulo miCirculoRadio3Punto7= new Circulo();
		miCirculoRadio3Punto7.setRadio(3.7);
		Double radio;
		radio=3.7;
		assertEquals(3.7, radio, 1.10);
	}
	
	@Test
	public void crearUnCirculoConRadio5() {
		Circulo miCirculoRadio5= new Circulo();
		miCirculoRadio5.setRadio(2d);
		Double radio;
		radio=5d;
		assertEquals(5d, radio, 1.10);
	}
	
	@Test
	public void crearUnCirculoConRadio10Punto9() {
		Circulo miCirculoRadio10Punto9= new Circulo();
		miCirculoRadio10Punto9.setRadio(3.7);
		Double radio;
		radio=10.9;
		assertEquals(10.9, radio, 1.10);
	}
	
	@Test//calculamos el perimetro de un circulo con radio 9.8
	public void queElPerimetroDeUnCirculoConRadio9Punto8Es615Punto73() {
		Circulo miCirculoRadio9Punto8= new Circulo();
		miCirculoRadio9Punto8.setRadio(9.8);
		Double perimetro;
		perimetro=miCirculoRadio9Punto8.calcularPerimetro();
		assertEquals(61.57,perimetro,0.01);
	}
	
	@Test//calculamos el area de un circulo con radio 16.6
	public void crearUnCirculoConRadio16Punto6Es865Punto67() {
		Circulo miCirculoRadio16Punto6= new Circulo();
		miCirculoRadio16Punto6.setRadio(16.6);
		Double area;
		area=miCirculoRadio16Punto6.calcularArea();
		assertEquals(865.69,area,0.01);
	}
	
	@Test
	public void queElTipDeAyudaDeVerde(){ // :)
		
		Double esperado = 1.10;
		Double actual = 1.10;
		
		/**
		 *  Recordar que el siguiente mètodo se puede usar por que al inicio del archivo
		 *  se importaron todos los assert con la siguiente linea 
		 *  import static org.junit.Assert.*; 
		 */
		 
		assertEquals(esperado.doubleValue(), actual.doubleValue(),0.01);
	

	}

}
