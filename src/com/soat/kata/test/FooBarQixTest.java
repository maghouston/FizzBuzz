package com.soat.kata.test;

import com.soat.kata.FooBarQuix;

import junit.framework.TestCase;

public class FooBarQixTest extends TestCase{
	
	public void testFooBarQixTrois(){
		assertEquals("FooFoo", FooBarQuix.getFooBarQix(3));
	}
	public void testFooBarQixCinq(){
		assertEquals("BarBar", FooBarQuix.getFooBarQix(5));
	}
	
	public void testFooBarQixSept(){
		assertEquals("QixQix", FooBarQuix.getFooBarQix(7));
	}
	
	public void testFooBarQixCinquanteUn(){
		assertEquals("FooBar", FooBarQuix.getFooBarQix(51));
	}
	
	public void testFooBarQixTreize(){
		assertEquals("Foo", FooBarQuix.getFooBarQix(13));
	}
	
	public void testFooBarQixQuinze(){
		assertEquals("FooBarBar", FooBarQuix.getFooBarQix(15));
	}
	
	public void testFooBarQixTrenteTrois(){
		assertEquals("FooFooFoo", FooBarQuix.getFooBarQix(33));
	}
	
	public void testFooBarQixCinquanteTrois(){
		assertEquals("BarFoo", FooBarQuix.getFooBarQix(53));
	}
	
	
	public void testFooBarQixSerieUnDix(){
		assertEquals("1\n2\nFooFoo\n4\nBarBar\nFoo\nQixQix\n8\nFoo\nBar", FooBarQuix.getFooBarQixListe(1,2,3,4,5,6,7,8,9,10));
	}

}
