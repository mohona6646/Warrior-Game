import java.util.Scanner;
import java.util.Random;
public class LetUsPlay {
// Assignment 3; Question 2
// Written by: Mohona Mazumdar 40129421
// For COMP 248 Section EC C- Fall 2019
// November 22 2019
// This program creates the objects board game, 
//dice and players and implement them to create the game


	public static void main(String[] args) {
		
		
		//Declares the object of type Scanner
		Scanner key= new Scanner(System.in);
		//Declares the object of type of Random
		Random random = new Random();
		
		//Creates the array of type Player of size 2
		Player[] thePlayers = new Player[2];
		
		//Declare the object of type Board and sets it to 
		//null
		Board theBoard = null;
		
		//Declare the object of type Dice and creates it with the default
		//constructor method
		Dice theDice = new Dice();
		
		//Declares variables of type integers
		int choice,levels=0,sizeBoard=0;
		
		//Displays a welcome message
		System.out.println("*************************************************************************");
		System.out.println("\t\tWelcome to Nancy's 3D Warrior  Game!");
		System.out.println("*************************************************************************");
		
		//Displays the options for the board dimensions to create the board
		//either the default board size (0) or with the dimensions of the user's choice (-1)
		System.out.println("The default game board has 3 levels and each level has 4x4 board");
		System.out.println("You can use this default board size or change the size");
		System.out.println("\t0 to use the default board size\n\t-1 to enter your own size");
		System.out.println("\t--> What do you want to do?"); 
		
		
		//Creates the variable to read the input of the user
		choice=key.nextInt(); 
		
		//Makes sure the user chooses between the numbers 0 and -1 using 
		//a while loop
		while (!(choice ==-1|| choice ==0))
		{
			//Displays the message in case the user inputs a number
			//other than 0 and -1
			System.out.println("Sorry but "+choice+" is not a legal choice");
			//Reads the input of the user
			choice=key.nextInt();
		}
		
		//In the case where the user chooses -1 for which they have
		//to create their own board
		if (choice==-1)
		{
			//Prompts the user to get the numbers of levels of the board
			System.out.println("How many levels would you like? (minimum 3, maximum 10)");
			
			  //Reads the input of the user for the number of levels
			  levels= key.nextInt();
			 
			  //Makes sure the user chooses between 3 and 10 levels
			  //using a while loop
			 while (!(levels>=3||levels<=10))
					 {
				 //Displays a message in the case where the user inputs
				 //a number smaller than 3 or greater than 10
				 System.out.println("Sorry but "+levels+" is not a legal choice");
				 
				    //Reads the input of the user to for number
				    //of levels
					levels=key.nextInt();
					 }
			
			//Prompts the user to get the size of the board
			System.out.println("What size do you want the nxn boards on each level to be\n Minimum size is 4x4 "
					+ "maximum is 10x10.\n-->Enter the value of n: ");
			
			//Reads the input of the user 
			 sizeBoard = key.nextInt();
			 
			 //Makes sure the user chooses a number between 4
			 //and 10
			while (!(sizeBoard>=4||sizeBoard<=10))
			{
				 //Displays a message in the case where the user inputs
				 //a number smaller than 4 or greater than 10
				 System.out.println("Sorry but "+sizeBoard+" is not a legal choice");
				 //Reads the user's input again
					sizeBoard=key.nextInt();
			}
			
		}
		
		//Displays a message letting the user know the board game have been set up
		System.out.println("Your 3D board have been set up and looks like this: \n");
		
		//In the case where the user chooses the default board (0)
          if (choice==0)
          { 
        	  //Creates the board with the default constructor
        	  theBoard = new Board();
        	  //Displays the board game with the appropriate energy 
        	  //at each square using the appropriate method 
            System.out.println(theBoard);
             
          }
          
          
        //In the case where the user chooses to create its board (1)
          if (choice==-1)
          {
        	  //Creates the board with constructor thats takes two
        	  //integers
        	   theBoard = new Board(levels,sizeBoard);
        	  //Displays the board game with the appropriate energy 
         	  //at each square using the appropriate method 
        	  System.out.println(theBoard);
        	  
          }
		
         //Prompts the user to enter the first player's name
		System.out.print("What is the player 0's name (one word only): ");
		//Reads the input of the user
		String name1 = key.next();
		//Stores the object of type player in the array player 
		//as the 0th element
		thePlayers [0] = new Player(name1);
		
		//Skips a line
		System.out.println();
		
		//Prompts the user to enter the second player's name 
		System.out.print("What is the player 1's name (one word only): ");
		//Reads the input of the user
		String name2 = key.next();
		//Stores the object of type player in the array player 
	    //as the 1st element
		thePlayers [1] = new Player(name2);
		
		//Skips a line
		System.out.println();
		
		//Generates a random number between 0 and 1 using the appropriate method
		int firstPlayer = random.nextInt(2);
		//Declares a variable of type integer for the other
		//player
		int otherPlayer;
		
		//In the case where the random number equals to 0
		if (firstPlayer==0)
		{
			//Displays a message stating the start of the game and the name of the player that goes first
		System.out.println("The game has started. "+name1+" goes first\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		//Initializes the variable to the other number (1)
		 otherPlayer=1;
		}
		
		//In the case where the random number equals to 1
		else 
		{
			//Displays a message stating the start of the game and the name of the player that goes first
		System.out.println("The game has started. "+name2+" goes first\n_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
		//Initializes the variable to the other number (1)
		 otherPlayer=0;
		}
		
		
		//Makes sure none of the players won the game using a while loop
		while (!(thePlayers[0].won(theBoard))||thePlayers[1].won(theBoard))
		{
			{
			//Declares the variable count
			int count=0;
			
			//Makes sure the count doesn't exceed 2 with a while loop
			while (count !=2)
			{
				
				//Declares variables of type integers
				int i,o;
				
				//In the case where the count equals to 0
				if (count==0)
				{
					//The variable takes the value of firstPlayer
					 i=firstPlayer;
					 //The variable takes the value of the otherPlayer
				     o=otherPlayer;
				}
				
				//In the case where the value doesn't equal to 0
				else 
				{
					//The variable takes the value of the otherPlayer
					 i= otherPlayer;
					//The variable takes the value of firstPlayer
				     o=firstPlayer;
				}
				
				//Displays a message stating the names of the first player
				System.out.println("It is "+thePlayers[i].getName()+"'s turn.");
				
				
					//In the case where the players have 0 or less energy unit		
					if (thePlayers[i].getEnergy()<=0)
						{
						
						//Uses a for loop to roll the dice
							for (int j=0; j<3; j++)
							{	
								//Uses method roll the dice to roll the die
								theDice.rollDice();
								
							//In the case where the die are equal
					     if (theDice.isDouble())
					    	 //Increments by 2 the energy units of the player
					     thePlayers[i].setEnergy(thePlayers[i].getEnergy()+2);
							} 
								
						}
					
					//In the case where the energy units of the player is still 0 or less
					if (thePlayers[i].getEnergy()<=0)
						//Restart the inner most loop
					      continue;
					    	
					//Rolls the die with the method
					theDice.rollDice();
					
					//Displays a message stating the numbers of  the die rolled using theDice method
					System.out.println(thePlayers[i].getName()+" you rolled "+ theDice);
					
					//In the case where the die are equal
					if (theDice.isDouble()) 
					{
						//Increments the energy units of the player by 2
					 thePlayers[i].setEnergy(thePlayers[i].getEnergy()+2);
					 //Display a message stating the fact that the player rolled a double
					 System.out.println("Congratulations you rolled double "+theDice.getdie1()
					 + ". Your energy went up by 2 units.");
					 
					}
					
					
                    //Declares and creates variables
					int sumOfDies= theDice.getdie1()+theDice.getdie2();
					
					int numOfLocationX= sumOfDies/theBoard.getSize();
					int numOfLocationY= sumOfDies%theBoard.getSize();
					
					
					int newX= thePlayers[i].getX()+numOfLocationX;
					int newY= thePlayers[i].getY()+numOfLocationY;
					
					//In the case where either the  x or y is greater than the size of the board
					if (newX>=theBoard.getSize()||newY>=theBoard.getSize())
					{
						//in the case where the y is greater than the size of the board
						if (newY>=theBoard.getSize())
						{
							thePlayers[i].setY(newY%theBoard.getSize());
							int temp=newY%theBoard.getSize();
							newX= temp+newX;
							
						}
						
						//In the case where the x is greater than the size of the board
						if (newX>=theBoard.getSize())
						{
							thePlayers[i].setLevel((thePlayers[i].getLevel()+1));
							thePlayers[i].setX(newX%theBoard.getSize());
						}
							
					
					}
					//In the case where the x and y within range
					else 
					{
						thePlayers[i].setX(newX);
						thePlayers[i].setY(newY);
				        thePlayers[i].setEnergy(theBoard.getEnergyAdj(thePlayers[i].getLevel(), thePlayers[i].getX(), thePlayers[i].getY())+
						            thePlayers[i].getEnergy());
					}
					
					//In the case where the positions of the two players equal
					if (thePlayers[i].equals(thePlayers[o]))
					{
						
							int choice2 = key.nextInt();
						while (!(choice2==0||choice2==1));
						{
							System.out.println("Sorry but "+choice2+ " is not a legal choice.");
							 choice2 = key.nextInt();
						}
						
						if (choice2==1)
						{
							if (thePlayers[i].getLevel()==0)
							{
								thePlayers[i].setX(0);
								thePlayers[i].setY(0);
							}
							
							else
							{
							thePlayers[i].setLevel((thePlayers[i].getLevel()-1));
							thePlayers[i].setEnergy(thePlayers[i].getEnergy()-2);
						    }
								
						}
						else
						{
							int ranNum= random.nextInt(11);
							if(ranNum>6)
							{
								int levelSwitch = thePlayers[o].getLevel();
								int xSwitch = thePlayers[o].getX();
								int ySwitch = thePlayers[o].getY();
								int energySwitch = thePlayers[o].getEnergy();
								thePlayers[i].moveTo(thePlayers[o]);
								thePlayers[i].setEnergy(thePlayers[i].getEnergy()+(thePlayers[o].getEnergy()/2));
								thePlayers[o].setLevel(levelSwitch);
								thePlayers[o].setX(xSwitch);
								thePlayers[o].setY(ySwitch);
								thePlayers[o].setEnergy(energySwitch/2);
							
							}
							
							else 
							{
								thePlayers[i].setEnergy(thePlayers[i].getEnergy()/2);
							}
						}
						
					
					}	
					
					//displays a message stating the adjustements of energy
						
	  System.out.println("Your energy is adjusted by "+
	       theBoard.getEnergyAdj(thePlayers[i].getLevel(),thePlayers[i].getX() ,thePlayers[i].getY())+
	       " for landing at (" +thePlayers[i].getX()+","+thePlayers[i].getY()+") at level "+
	       thePlayers[i].getLevel()+"\n");
						
	  
	         
						count++;
					    	 
					}
						
					System.out.println("At the end of this round:");
					System.out.println(thePlayers[firstPlayer]);
					System.out.println(thePlayers[otherPlayer]);
					System.out.println("Any key to continue the next round...");
					
					String nextRound = key.next();	
					
			}
						
						
			}
			//In the case where player 0 wins
		if (thePlayers[0].won(theBoard))
			System.out.println("The winner is player "+name1+". Well Done!!!");
		
		//In the case where player 0 wins
		else
			System.out.println("The winner is player "+name2+". Well Done!!!");
						
						
					
					
					
					
					
					
					
			}
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
		
		
		
		
		
		
		
		
	


