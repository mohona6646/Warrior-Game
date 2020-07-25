import java.util.Random;
public class Dice {
	
 // Assignment 3; Question 2
// Written by: Mohona Mazumdar 40129421
// For COMP 248 Section EC C- Fall 2019
// November 22 2019
// This program creates and defines a class named Dice which creates the 
//the object dice along with its attributes and methods 


   //Declares the instance variables for the object
	private int die1;
	private int die2;
	
	//Creates the object of type Random
	Random random = new Random();
	
	//Creates the default constructor
	public Dice(){
		
	}
	
	//Creates the method that returns the value stored in dice 1
	public int getdie1() {
		return die1;
	}
	
    //Creates the method that returns the value stored in dice 2
	public int getdie2() {
		return die2;
	}
	
	//Creates the method that randomly assigns values between
	// 0 and 1 to both die and returns the sum of the two values
	public int rollDice() {
		die1 = (int)((Math.random()*6)+1);
		die2 = (int)((Math.random()*6)+1);
		return (die1 + die2);
		
	}
	
	//Creates a method that returns a boolean value whether 
	//dice 1 equals to dice 2
	public boolean isDouble() {
		return (die1==die2);
	}
	
	//Creates a method that returns a string stating the values for
	//each dice
	public String toString() {
		return("Die1: "+ die1+ " Die2: " +die2);  
	}
	
	
	
	
	
}
