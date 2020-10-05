/*@author MBaumgarten


 * this class uses the card class to build a deck and deal those cards in the game
 * 
 */
import java.util.ArrayList;


import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Deck {
    List<Card>deck=new ArrayList<Card>();
    String[] ranks= new String[]{"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K","A"};
    String[] suits=new String[]{"C", "S", "H", "D"};
    int[] values= new int[]{2,3,4,5,6,7,8,9,10,10,10,10,11};


    public Deck() {
	for (int i=0; i<52; i++) {
	    Card deckCard = new Card(ranks[i%13], suits[i/13], values[i%13]);
	    deck.add(deckCard);
	    }
	}
    //shuffles the deck
    public void shuffle() {
	Collections.shuffle(deck);
    }
    //deals the first card of the deck
    public Card dealCard() {
	System.out.println("The next card is " +deck.get(0));
	return deck.get(0);
    }
    //asks the user where to place the card in the game table and places it accordingly
    public boolean placeCard(GameTable gameTable, Card dealCard) {
	System.out.println("Please enter a position. Positions are designated as integers from 1 to 20 (including 1 and 20) starting from the top left going left to right and all the way down including the discard grid. ");
	Scanner posit= new Scanner(System.in);
	int gtPosit=posit.nextInt();
	return gameTable.updatedTable(dealCard, gtPosit);
    }
    
    //removes the used cards from the deck in order not to have repeated cards
    public Card removeUsedCards() {
	return deck.remove(0);
    }
    
   
    
public static void main(String[] args) {
	
	
	
	
	
	        
}


}



