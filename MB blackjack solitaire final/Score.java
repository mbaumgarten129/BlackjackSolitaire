/*@author MBaumgarten
 * 
 * This score class takes in the value of the cards in each hand and sums them up to calculate the yielded points
 * This class also evaluates the suits in each hand and adjusts for the values of Ace
 */
public class Score {
    int value;
    
    //constructor
    public Score() {
    
    }
    
   //this method calculates the sum of the values of the cards in each column and row
    //creates an array of all the values of each hand
   public int[] calculateHandSum(Card [][] gameTable) {
	int handSum1= gameTable[0][0].getValue()+ gameTable[0][1].getValue();
	int handSum2= gameTable[0][4].getValue()+ gameTable[1][4].getValue();
	int handSum3= gameTable[0][1].getValue()+ gameTable[1][1].getValue()+gameTable[2][0].getValue()+gameTable[3][0].getValue();
	int handSum4= gameTable[0][2].getValue()+ gameTable[1][2].getValue()+gameTable[2][1].getValue()+gameTable[3][1].getValue();
	int handSum5= gameTable[0][3].getValue()+ gameTable[1][3].getValue()+gameTable[2][2].getValue()+gameTable[3][2].getValue();
	int handSum6= gameTable[2][0].getValue()+ gameTable[2][1].getValue()+gameTable[2][2].getValue();
	int handSum7= gameTable[3][0].getValue()+ gameTable[3][1].getValue()+gameTable[3][2].getValue();
	int handSum8=gameTable[0][0].getValue()+ gameTable[0][1].getValue()+gameTable[0][2].getValue()+gameTable[0][3].getValue()+gameTable[0][4].getValue();
	int handSum9= gameTable[1][0].getValue()+ gameTable[1][1].getValue()+gameTable[1][2].getValue() + gameTable[1][3].getValue()+ gameTable[1][4].getValue() ;
	
	int[] handSums=new int[] {handSum1,handSum2,handSum3,handSum4, handSum5, handSum6, handSum7,handSum8,handSum9};
	return handSums;
	
    }
    //this method yields the suits in each column and row 
   //creates an array of all the hands
    public String[] handTotals(Card[][] gameTable) {
	String handTotal1= gameTable[0][0].getRank() + gameTable[0][1].getRank();
	String handTotal2= gameTable[0][4].getRank()+ gameTable[1][4].getRank();
	String handTotal3= gameTable[0][1].getRank()+ gameTable[1][1].getRank()+gameTable[2][0].getRank()+gameTable[3][0].getRank();
	String handTotal4= gameTable[0][2].getRank()+ gameTable[1][2].getRank()+gameTable[2][1].getRank()+gameTable[3][1].getRank();
	String handTotal5= gameTable[0][3].getRank()+ gameTable[1][3].getRank()+gameTable[2][2].getRank()+gameTable[3][2].getRank();
	String handTotal6= gameTable[2][0].getRank()+ gameTable[2][1].getRank()+gameTable[2][2].getRank();
	String handTotal7= gameTable[3][0].getRank()+ gameTable[3][1].getRank()+gameTable[3][2].getRank();
	String handTotal8= gameTable[0][0].getRank()+ gameTable[0][1].getRank()+gameTable[0][2].getRank()+gameTable[0][3].getRank()+gameTable[0][4].getRank() ;
	String handTotal9=gameTable[1][0].getRank()+ gameTable[1][1].getRank()+gameTable[1][2].getRank()+gameTable[1][3].getRank()+gameTable[1][4].getRank() ;
	
	String[] handTotals=new String[] {handTotal1, handTotal2, handTotal3, handTotal4, handTotal5, handTotal6, handTotal7, handTotal8, handTotal9};
	return handTotals;
	
    }
    
    //this method calculates the score using the sum of the values and checks for an Ace and adjusts the score
    public int calculateIndScore(int handSum, String handTotal) {
	int score=0;
	int aceCounter=0;
	for(int i=0; i<handTotal.length(); i++) {
	    if(handTotal.charAt(i)=='A'){
		aceCounter++;
	    }
	}
	if(handSum>21 && handSum<32) {
	    if(aceCounter>=1) {
		handSum=handSum-10;
	    }
	}
	else if(handSum>=32 && handSum<42) {
		if(aceCounter>=2) {
		handSum=handSum-20;
		}
	}
	else if(handSum>=42 && handSum<52) {
	    if(aceCounter>=3) {
		handSum=handSum-30;
	    }
	}
	else if(handSum>=52 && handSum<62) {
	    if(aceCounter>=4) {
		handSum=handSum-40;
	    }
	}
	if(handSum>21) {
	    score=0;
	}
	if(handSum==21 && handTotal.length()==2) {
	     score=10;
	}
	
	if(handSum==21 && handTotal.length()>2) {
	       score=7;
	}

    	if(handSum==20) {
    	   score=5;
	}

    	if(handSum==19) {
	    score=4;
	}

	if(handSum==18) {
	    score=4;
	}

	 if(handSum==17) {
	    score=3;
	}
	
	if(handSum<=16) {
	    score=1;
	}
	return score; 
	
    }
    
    //calculates the final score by looping through the arrays of the sums and suits in each hand
    public int calculateFinalScore(int[]handSums, String[] handTotals) {
	int finalScore=0;
	for(int i=0; i<handSums.length;i++) {
	    finalScore=finalScore + calculateIndScore(handSums[i],handTotals[i]);
	}
	System.out.println("Your final score is:  "+ finalScore);
	return finalScore;
	
	
    }
    public static void main(String[] args) {
	
	
    }

}
    
