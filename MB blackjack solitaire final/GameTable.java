/*@author MBaumgarten

 * this class represents the grid of the game and updates it as the player places cards within each square
 * 
 */



public class GameTable {
    int rows=6;
    int columns=5;
    Card[][] gameTable;
    
    //constructor
    public GameTable() {
	gameTable= new Card[rows][columns];
    }
    // method prints grid
    public void printTable() {
	System.out.print(gameTable[0][0]+ " ");
	System.out.print(gameTable[0][1]+ " ");
	System.out.print(gameTable[0][2]+ " ");
	System.out.print(gameTable[0][3]+ " ");
	System.out.println(gameTable[0][4]+ " ");
	System.out.print(gameTable[1][0]+ " ");
	System.out.print(gameTable[1][1]+ " ");
	System.out.print(gameTable[1][2]+ " ");
	System.out.print(gameTable[1][3]+ " ");
	System.out.println(gameTable[1][4]+ " ");
	System.out.print("     " +gameTable[2][0]+ " ");
	System.out.print(gameTable[2][1]+ " ");
	System.out.println(gameTable[2][2]+ " ");
	System.out.print("     " +gameTable[3][0]+ " ");
	System.out.print(gameTable[3][1]+ " ");
	System.out.println(gameTable[3][2]+ " ");
	System.out.println("Place discarded cards below");
	System.out.print(gameTable[4][0]+ " ");
	System.out.println(gameTable[4][1]+ " ");
	System.out.print(gameTable[5][0]+ " ");
	System.out.print(gameTable[5][1]+ " ");
	System.out.println();
    }
    
  //method updates grid based on the position that the user selected
  //method also checks that the selected position is not already used 
    public boolean updatedTable(Card card, int position){
	if(1<=position && position<=5){
		if(gameTable[0][position-1] ==null){
		gameTable[0][position-1]=card;
		return true;
		}
	}
	if(6<=position && position<=10){
		if(gameTable[1][position-6] ==null){
		gameTable[1][position-6]=card;
		return true;
		}
	}

	if(11<=position && position<=13){
		if(gameTable[2][position-11] ==null){
		gameTable[2][position-11]=card;
		return true;
		}
	}
	if(14<=position && position<=16){
		if(gameTable[3][position-14] ==null){
		gameTable[3][position-14]=card;
		return true;
		}
	}

	if(17<=position && position<=18){
		if(gameTable[4][position-17] ==null){
		gameTable[4][position-17]=card;
		return true;
		}
	}
	if(19<=position && position<=20){
		if(gameTable[5][position-19] ==null){
		gameTable[5][position-19]=card;
		return true;
		}
	}
	return false;
    }
    
    //method checks if the board is full and the game is over
    public boolean checkFullBoard() {
	int cardCount=0;
	for (int i=0; i<4; i++) {
	    for( int j=0; j<gameTable[i].length; j++) {
		if (gameTable[i][j]!=null) {
		    cardCount++;
		}
	   }
	}
	if(cardCount==16) {
	    return true;
	}
	return false;
    }
    
    public static void main(String[] args) {
	

    }

}
