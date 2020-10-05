/*@author MBaumgarten

 * This class provides the framework for the simulation of the game
 * 
 */

import java.util.Scanner;

public class BlackjackSolitaire {
    
 
    //constructor
    public BlackjackSolitaire() {
	
    }
    
//method runs the simulation
//checks if board is full
//calculates the score
  public void play() {
	boolean gameOver=false;
	Scanner s=new Scanner(System.in);
	System.out.println("Please enter your name:");
	String playerName=s.nextLine();
	System.out.println("Welcome to BlackjackSolitaire " + playerName + "!");
	//new instance of a game display
	GameTable myGT= new GameTable();
	//new instance of a deck
	Deck myDeck= new Deck();
	//new instance of a score
	Score myScore= new Score();
	//shuffle the deck
	myDeck.shuffle();
	//run the game
	while(!gameOver) {
	    	//display the game
		myGT.printTable(); 
		//deal a card
		Card dealtCard=myDeck.dealCard();
		//check if the card is placed in the correct position
		boolean rightCardPlace=myDeck.placeCard(myGT, dealtCard);
			if(rightCardPlace==false) {
			    System.out.println("Please pick a new position.");
			}else {
			myDeck.removeUsedCards();
			}
		//check if the board is full. If yes, game over. If not, keep playing.
		gameOver=myGT.checkFullBoard();
		
	}
	
	myGT.printTable();
	//if game over, calculate the sum of each hand
       int [] myHandSums=myScore.calculateHandSum(myGT.gameTable);
       //find all the suits in a hand
       String [] myHandTotals=myScore.handTotals(myGT.gameTable);
       //calculate final score
       myScore.calculateFinalScore(myHandSums, myHandTotals);
       System.out.println("Game Over. Stop playing games and go get some fresh air!");
    
    
	
    
   
  }
}
