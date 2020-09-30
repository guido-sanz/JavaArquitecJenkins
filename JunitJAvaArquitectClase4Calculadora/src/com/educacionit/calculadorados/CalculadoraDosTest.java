package com.educacionit.calculadorados;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraDosTest {

	static CalculadoraDos calc ; //creamos static para poder utilizar metodo beforeclass()
	@BeforeClass
	public static void beforeClass() { //debe ser static static 
		System.out.println(" BeforeClass() ");
		calc = new CalculadoraDos();
	}	
	@Before 
	public void before() {
		System.out.println("     Before()  ");
		calc = new CalculadoraDos(); //no fomra parte de la prueba es una precondicion para ejecutar el test
	}
	@After 
	public void after() {
		System.out.println("     After()");
		calc.clear();
	}
	@AfterClass
	public static void afterClass() {
		System.out.println(" AfterClass()");
		calc.clear();
	}
	@Test
	public void testSum() {
		System.out.println("          Ejecutando Test: TestSum() ");
	int result = calc.add(3, 2);
	int esper = 5;
	assertEquals(esper, result);
	}
	
	@Test
	public void testAnsSum() {
		System.out.println("          Ejecutando Test: TestAnsSum() ");
		int result = calc.add(3, 2);
		assertEquals(5, result);
	}
	@Test
	public void testDiv() {
		System.out.println("          Ejecutando Test: TestDiv() ");
		int result = calc.div(6, 2);
		assertEquals(3, result);
	}
	//esta prueba funcionara por que se espera un error con el expected
	//un expected siempre va a fallar si no se genera la Exception que se le indica
	@Test ( expected = ArithmeticException.class )
	public void testDivPorCero() {
		System.out.println("          Ejecutando Test: TestDivPorCero() ");
		int result = calc.div(5, 0);
		
	}
	//timeout : sirve para testear que un metodo tarda mas de lo normal,
	//en este ejemplo son 100 milisegundos ,si modificamos el tiempo no debera generar un a exception
	
//	@Test(timeout = 100 )
	public void testAlgoritmoOptimo() {
		System.out.println("       Ejecutando Teest : testAlgoritmoOptimo() ");
		calc.operacionOptima();
	}
	
	
	
}
