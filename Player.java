
public class Player {

// Assignment 3; Question 2
// Written by: Mohona Mazumdar 40129421
// For COMP 248 Section EC C- Fall 2019
// November 22 2019
// This program creates and defines a class named Player that creates objects for the players
//along with its attributes and methods 

  //Declares the instance variables for the object
	private String name;
	private int level;
	private int x;
	private int y;
	private int energy;
	
	//Creates the default constructor
	public Player(){
		name= " ";
		energy=10;
		level=0;
		x=0;
		y=0;
	}
	
	//Creates the constructor that takes a string a parameter
	public Player(String playerName){
		name= playerName;
		energy=10;
		level=0;
		x=0;
		y=0;
	}
	
	//Creates the constructor that takes three integer 
	//parameters, one for the level and for the coordinates 
	//x and y
	public Player (int theLevel, int theX, int theY) {
		name=" ";
		energy=10;
		level=0; 
		x=0; 
		y=0;
		
	}
	
	//Creates the method that duplicates all attributes of the passed 
	//object for the attributes of the calling object
	public Player (Player originalPlayer) {
		this.name= originalPlayer.name;
		this.energy= originalPlayer.energy;
		this.level=originalPlayer.level;
		this.x=originalPlayer.x;
		this.y=originalPlayer.y;
	}
		
	
	//Creates mutator method that changes the value 
	//of the attribute name by the passed string
	public void setName (String aName) {
		name= aName;
	}
	
	//Creates the mutator method that changes the value 
	//of the attribute level by the passed value
	public void setLevel (int aLevel) {
		level=aLevel;
	}
	
	//Creates the mutator method that changes the value of 
	//the attribute energy by the passed value
	public void setEnergy (int aEnergy) {
		energy=aEnergy;
	}
	
	//Creates the mutator method that changes the value of
	//the attribute x by the passed value 
	public void setX (int aX) {
		x= aX;
	}
	
	//Creates the mutator method that changes the value of
	//the attribute y by the passed value 
	public void setY (int aY) {
		y=aY;
	}
	
	//Creates an accessor method that returns the 
	//name of the object
	public String getName () {
		return name;
	}
	
	//Creates an accessor method that returns the 
	//value stored in energy
	public int getEnergy() {
		return energy;
	}
	
	//Creates an accessor method that returns the
	//value stored in level
	public int getLevel() { 
		return level;
	}
	
	//Creates an accessor method that returns the
	//value stored in x
	public int getX() {
		return x;
	}
	
	//Creates an accessor method that returns the
	//value stored in y
	public int getY() {
		return y;
	} 
	
	//Creates a method that switches the position of 
	//the calling to the passed object 
	public void moveTo(Player p) {
		this.level=p.level;
		this.y=p.y;
		this.x=p.x;
		
	}
	
	//Creates a method that returns a boolean value
	//determining whether the calling player won the game
	public boolean won(Board b) {
		return(this.level==(b.getLevel()-1)&& this.x==(b.getSize()-1)&& this.y==(b.getSize()-1));
		
	}
	
	//Creates a method that returns a boolean value
	//determining whether the positions of both players are equal
	public boolean equals(Player p) {
		return(this.level==p.level&&this.x==p.x&&this.y==p.y);
	}
	
	//Creates a method that returns a string stating the
	//location and the energy units of the calling player
	public String toString() {
		return(name+" is on level "+level+" at location ("+x+","+y+") and has "+energy+ " units of energy");
	}
	
}
