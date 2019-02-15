package com.ashu.calcul;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCalculat {
	Calculator calc;
	@Before
	public void init(){
	 calc=new Calculator();
	}
	
	@Test
	public void testSum() {
		assertEquals(5, calc.add(2, 3),0);
	}
	@Test
	public  void testSub(){
		assertEquals(1, calc.sub(3, 2),0);
	}
	@Test
	public  void testMul(){
		Calculator calc=new Calculator();
		assertEquals(6, calc.mul(2, 3));
	}
	@Test
	public  void testDiv(){
		assertEquals(1, calc.div(5, 5),0);
	}
	@After
	public void destroy(){
	calc=null;
	}
}
