/*@author MBaumgarten
 * 
 * this class creates a card object 
 */
public class Card {
    String rank;
    String suit;
    int value;


    	//constructor
    public Card(String rank, String suit, int value) {
	    this.rank=rank;
	    this.suit=suit;
	    this.value=value;
	    System.out.println();
	
    }
    //get rank of card
    public String getRank() {
   	return rank;
    }
    //get value of card
    public int getValue() {
   	return value;
    }
    //get suit of card
    public String getSuit() {
   	return suit;
    }
    
    //return card as a string
    public String toString() {
	return  rank +  suit;
    }
    
  
   public static void main(String[] args) {
    }
    
}
	
