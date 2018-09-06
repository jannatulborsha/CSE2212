package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.OperatorTestClass;

class OperatorTestUnitTest {
	OperatorTestClass  myObject = new OperatorTestClass();
	
	@Test
	void additionTest() {
		
		assertEquals(20, myObject.addition(10, 10));
		assertEquals(20, myObject.addition(0, 20));
		assertEquals(100, myObject.addition(67, 33));
		
	}
	
	@Test
	void subtractionTest() {
		
		assertEquals(1, myObject.subtraction(2, 1));
		assertEquals(0, myObject.subtraction(0, 0));
		assertEquals(15, myObject.subtraction(20, 5));
		
	}
	
	@Test
	void divisionTest() {
		
		assertEquals(2, myObject.division(20, 10));
		assertEquals(0, myObject.division(0, 1));
		assertEquals(1, myObject.division(5, 5));
		
	}
	
	@Test
	void multiplicationTest() {
		
		assertEquals(64, myObject.multiplication(8, 8));
		assertEquals(0, myObject.multiplication(0, 8));
		assertEquals(10000, myObject.multiplication(100, 100));
		assertEquals(0, myObject.multiplication(0, 0));
		
	}
	
	@Test
	void modulusTest() {
		
		assertEquals(13, myObject.modulus(13, 50));
		assertEquals(0, myObject.modulus(0, 50));
		assertEquals(15, myObject.modulus(15, 100));
		
	}
	
	@Test
	void bitAndTest() {
		
		assertEquals(10, myObject.bitAnd(10, 10));
		assertEquals(0, myObject.bitAnd(1, 2));
		assertEquals(0, myObject.bitAnd(1, 10));
		
	}
	
	@Test
	void bitOrTest() {
		
		assertEquals(10, myObject.bitOr(10, 10));
		assertEquals(3, myObject.bitOr(1, 2));
		assertEquals(11, myObject.bitOr(1, 11));
		
	}
	
	@Test
	void bitNotTest() {
		
		assertEquals(~5, myObject.bitNot(5));
		assertEquals(~10, myObject.bitNot(10));
		assertEquals(~100, myObject.bitNot(100));
		
	}
	
	@Test
	void bitExOrTest() {
		
		assertEquals(0, myObject.bitExOr(10, 10));
		assertEquals(3, myObject.bitExOr(1, 2));
		assertEquals(10, myObject.bitExOr(10, 0));
		
	}
	
	@Test
	void equalToTest() {
		
		assertEquals(true, myObject.equalTo(10, 10));
		assertEquals(false, myObject.equalTo(1, 2));
		assertEquals(false, myObject.equalTo(10, 0));
		
	}
	
	@Test
	void lessThanTest() {
		
		assertEquals(false, myObject.lessThan(10, 10));
		assertEquals(true, myObject.lessThan(1, 2));
		assertEquals(false, myObject.lessThan(10, 0));
		
	}
	
	@Test
	void greaterThanTest() {
		
		assertEquals(false, myObject.greaterThan(10, 10));
		assertEquals(false, myObject.greaterThan(1, 2));
		assertEquals(true, myObject.greaterThan(10, 0));
		
	}
	
}