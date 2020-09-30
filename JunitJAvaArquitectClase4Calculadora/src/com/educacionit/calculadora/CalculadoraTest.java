package com.educacionit.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
//import static java.lang.Math.*;
public class CalculadoraTest {

	@Test//esta anotacion marca al metodo como una prueba 
	public void testSuma() {
		int resultado = Calculadora.suma(2, 3);
		int esperado = 5;
		assertEquals(esperado, resultado);
//		pow(45, 45);
//		double resultado2 = PI*2;
		//llamada a la funcion fail (esto hace que la prueba automaticamente falle)
		//fail("Not yet Implemented");
	}
	
	@Test 
	public void testResta() {		
		int resultado = Calculadora.resta(3 ,2);
		int esperado = 1;
		assertEquals(esperado, resultado);
	}

}










