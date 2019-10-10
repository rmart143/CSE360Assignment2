/*
 * @Author       : Rogelio Martinez 
 * @ID     		 : 1215804369
 * @Class 		 : CSE 360 Wed 9:40 a.m.
 * @Assignment # : 2
 * @Description  : This file AddingMachine.java is used to keep a history of the value that are 
 * 					added and subtracted to an equation and outputs the total value.
 * 				    The file contains the AddingMachine class, AddingMachine Constructor, the 
 * 					getTotal method, the add method, the subtract method, the toString method,
 * 					and the clear method. 
 */

package cse360assign2;

/**
 * Class AddingMachine
 * maintains a record of the numbers added and subtracted.
 * Contains the variable integer total, AddingMachine Constructor, 
 * the getTotal method, the add method, the subtract method, the 
 * toString method, and the clear method.
 */
public class AddingMachine {

private int total;

private String equation;
	
	/**
	 * Class constructor
	 * Makes an AddingMachine object
	 */
	public AddingMachine () {
		
		total = 0;  
		
		equation = "0";
		
	}
	
	/**
	 * Method Description getTotal
	 * @return integer total
	 */
	public int getTotal () {
		
		return total;
	}
	
	/**
	 * Method Description adds an value to the total
	 * @param int value
	 */
	public void add (int value) {
		
		equation += " + " + String.valueOf(value);
		
		total = total + value;
		
	}
	
	/**
	 * Method Description subtracts value to the total
	 * @param int value
	 */
	public void subtract (int value) {
		
		equation += " - " + String.valueOf(value);
		
		total = total - value;
		
	}
	
	/**
	 * Method Description returns the string of the arithmetic actions.
	 * @return String equation
	 */
	public String toString () {
			
		return equation;
	}
	
	/**
	 * Method Description clear() sets the String equation to "0" and
	 * sets the integer total to zero. 
	 */
	public void clear() {
		
		equation = "0";
		
		total = 0;
	
	}
	
	
}//closes class AddingMachine