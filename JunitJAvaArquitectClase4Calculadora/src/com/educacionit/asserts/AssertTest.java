package com.educacionit.asserts;



import com.educacionit.calculadora.Calculadora;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

class AssertTest {

	@Test
	void test() {
		//assertEquals(long, long); //sirve para todos los numericos
		//assertEquals(Object, Object); // debe temer bien implementado el metodo equals en el object
		//assertEquals(double, double ,double delta):
		//Ej :
		assertEquals("3 es distinto de 4", 4 , 4);
//		assertEquals(array[] , array []);  nos sirve para los arrays
		//Sirven para validar que una determinada condicion sea falsa 
		//o verdadera
		//assertFalse(); y assertTrue(); 
		
		
		 //funciona al reves que los assertEquals (Falla cuando no sean iguales los parametros)			
//		assertNotEquals(unexpected, actual);
//		assertNotNull() //sirve para comprobar que algo no sea nulo
//		assertNull() : sirve para comprobar que algo sea null

		//		assertSame(expected, actual); sirve para comprobar que los objetos sean los mismos
		//Ejemplo:
		Calculadora micalculadorUno = new Calculadora();
		Calculadora micalculadorDos = new Calculadora();
		
		String st1 = "hola";
		String st2 = "hola";
		
		assertEquals(st1, st2);//esto da true  , por que los dos string son iguales 
		
		//esto da false por que los dos objetos estan en posiciones de memorias distitas 
		assertSame(micalculadorUno, micalculadorUno);
		
	}

}
