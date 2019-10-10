/*
 * @Author       : Rogelio Martinez 
 * @ID     		 : 1215804369
 * @Class 		 : CSE 360 Wed 9:40 a.m.
 * @Assignment # : 2
 * @Description  : This file testingAddingMaching.java is used to test the 
 * 				   methods in in AddingMachine.java. This file consists of
 * 				   the class testingAddingMachine, methods test1, test2, 
 *                 test3, test4, and test5.
 */

package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testingAddingMachine {

	/**
	 * Method Description test1 
	 * checks if the add() and subtract() methods work with positive integers
	 */
	@Test
	void test1() {
		AddingMachine test1 = new AddingMachine();
		
		test1.subtract(1);
		test1.add(3);
		test1.add(43);
		String checkStr1 = test1.toString();
		int checkInt1 = test1.getTotal();
		
		assertEquals(checkStr1, "0 - 1 + 3 + 43");
		assertEquals(checkInt1, 45);
	}
	
	/**
	 * Method Description test2
	 * Checks if the subtract() method works with negative integers
	 */
	@Test
	void test2() {
		
		AddingMachine test1 = new AddingMachine();
		
		test1.subtract(-3);
		test1.subtract(-5);
		test1.subtract(-71);
		String checkStr1 = test1.toString();
		int checkInt1 = test1.getTotal();
		
		assertEquals(checkStr1, "0 - -3 - -5 - -71");
		assertEquals(checkInt1, 79);
	}

	/**
	 * Method Description test3
	 * Checks if the add() method works with negative values.
	 */
	@Test
	void test3() {
		
		AddingMachine test1 = new AddingMachine();
		
		test1.add(-7);
		test1.add(-11);
		test1.add(-53);
		
		String checkStr1 = test1.toString();
		int checkInt1 = test1.getTotal();
		
		assertEquals(checkStr1, "0 + -7 + -11 + -53");
		assertEquals(checkInt1, -71);
	}
	
	/**
	 * Method Description test4
	 * Checks if add() and subtract() methods work with positive
	 * and negative integers. 
	 */
	@Test
	void test4() {
		
		AddingMachine test1 = new AddingMachine();
		
		test1.add(-5);
		test1.subtract(-17);
		test1.add(11);
		test1.subtract(-19);
		test1.add(-53);
		
		String checkStr1 = test1.toString();
		int checkInt1 = test1.getTotal();
		
		assertEquals(checkStr1, "0 + -5 - -17 + 11 - -19 + -53");
		assertEquals(checkInt1, -11);
	}
	
	/**
	 * Method Description test5
	 * Checks if the clear() method works and after its usage
	 * and using the add() and subtract() methods the integrity
	 * of the equation and total variable still work. 
	 */
	@Test
	void test5() {
		
		AddingMachine test1 = new AddingMachine();
		
		test1.add(-5);
		test1.subtract(-17);
		test1.add(11);
		test1.subtract(-19);
		test1.add(-53);
		test1.clear();
		String checkStr1 = test1.toString();
		int checkInt1 = test1.getTotal();
		
		assertEquals(checkStr1, "0");
		assertEquals(checkInt1, 0);
		
		test1.subtract(-23);
		test1.add(29);
		test1.subtract(-31);
		test1.add(37);
		test1.add(0);
		test1.subtract(0);
		
		checkStr1 = test1.toString();
		checkInt1 = test1.getTotal();
		
		assertEquals(checkStr1, "0 - -23 + 29 - -31 + 37 + 0 - 0");
		assertEquals(checkInt1, 120);
		
	}
}
