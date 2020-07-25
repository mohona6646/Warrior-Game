
public class Board 
// Assignment 3; Question 2
// Written by: Mohona Mazumdar 40129421
// For COMP 248 Section EC C- Fall 2019
// November 22 2019
// This program creates and defines a class named Board that creates an object for the 
//board game along with its attributes and methods 

{
	//Declares its instance variables
	private int [][][] board;
	private static final int MIN_LEVEL = 3;
	private static final int MIN_SIZE = 3;
	private int level;
	private int size; 
	
	//Creates the default constructor
	public Board() {
		level=3;
		size=4;
		createBoard();
	}
	
	//Creates a constructor that takes two parameters
	//of type integers and assigns them to attributes level and
	//size
	public Board(int l, int x) {
		level = l;
		size= x;
		createBoard();
	}
	
	//Creates the game board with the given values for attributes level and
	//size and assigns energy accordingly to each square
	private void createBoard() {
		board = new int [level][size][size];
		
		for (int l=0;l<level;l++)
			for (int x=0;x<size;x++)
				for (int y=0;y<size;y++)
				{
					int sum = l+x+y;  
					
					if (sum%3==0)
			        {
					board[l][x][y]=-3;
					}
					else if (sum%5==0)
					{
	              	board[l][x][y]=-2;
					}
					
					else if (sum%7==0)
					{
			        board[l][x][y]=2;
					}
					
					else 
					{
					board[l][x][y]=0;
					}	
				}
		
	}
	
	//Creates an accessor method for attribute level
	
	public int getLevel() {
		return level;
	}
	
	//Creates an accessor method for attribute size
	public int getSize() {  
		return size;
	}
	
	//Creates a method that returns the energy at a specific square of
	//the board game given the values
	public int getEnergyAdj(int L, int x, int y) {
		return board[L][x][y];
	}
	
	//Creates a method that returns a string displaying the board game 
	//and the appropriate values in each square
	public String toString() {
		String str="";
		for (int l=0; l<level;l++)
		{
			str+= "Level "+l+"\n";
			
				for (int x=0; x<size;x++)
				{
					for (int y=0;y<size;y++)
					{
						str+=String.format("%2d",board[l][x][y])+"\t";
					}
				str+="\n";
		}
			str+="\n";
		}
		
		return str;					
		
					
		
	}
	
	
	

}

