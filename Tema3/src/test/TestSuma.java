package test;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clases.Calculadora;;

public class TestSuma {

	private Calculadora calcula;
	
	@Before
	public void inicializa() {
		calcula = new Calculadora();
		
	}
	
	@Test
	public void test1() {
		assertEquals(2,calcula.suma(1, 1) );
	}
	
	@Test
	public void test2() {
		assertEquals(3,calcula.suma(1, 2) );
	}
	
	@Test
	public void test3() {
		assertEquals(4,calcula.suma(1, 3) );
	}
	
	@Test
	public void test4() {
		assertEquals(5,calcula.suma(1, 4) );
	}
	
	@Test
	public void test5() {
		assertEquals(6,calcula.suma(1, 5) );
	}

}
