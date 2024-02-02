public class BINGOCardMerrittAubrey {
	int[][] card = new int[5][5];
	
	public void printCard() { // printing the BINGO Card
		System.out.println("B \t I \t N \t G \t O");
		for (int i = 0; i < card.length; i++) {
			for(int x = 0; x < card[i].length; x++) {
				System.out.print(card[i][x] + "\t");
			}
			System.out.println();
		}
	}
	
	public void getBINGOcard() {
		int num = (int)(Math.random() * 100); // random # 
		int min = 0;
			
			for (int i = 0; i < card.length; i++) { 
				for (int x = 0; x < card[i].length; x++) {
					num = (int)(Math.random() * 15 + 1 + min); // randomizing card numbers
					
					for(int a = 0; a <= x; a++) { // checking for copies
						if (card[a][i] == num) { // comparing previous value with current value
							num = (int)(Math.random() * 15 + 1 + min); // randomizing card numbers
							a = -1; // starting for loop again
						}
					}
					card[x][i] = num; // filling the BINGO card w/ random numbers
				}
				min = min + 15; // updating the random numbers used in each column
			}
			card[2][2] = 0;
		}

	public void replaceNumbers(int callNumber) {	
		for (int i = 0; i < card.length; i++) {
			for(int x = 0; x < card[i].length; x++) {
				if (card[x][i] == callNumber) {
					card[x][i] = 0;
				}
			}
		}
	}
	
	public boolean findWinner() {	
		boolean value = false;
		for (int i = 0; i < card.length; i++) {
			if (card[0][i] == 0 && card[1][i] == 0 && card[2][i] == 0 && card[3][i] == 0 && card[4][i] == 0) { // row winner
				System.out.println("Looks like we've got a winner!");
				value = true;
			}
			if (card[i][0] == 0 && card[i][1] == 0 && card[i][2] == 0 && card[i][3] == 0 && card[i][4] == 0) { // column winner
				System.out.println("Looks like we've got a winner!");
				value = true;
			}
		}
		if (card[0][0] == 0 && card[1][1] == 0 && card[2][2] == 0 && card[3][3] == 0 && card[4][4] == 0 && card[4][0] == 0 && card[3][1] == 0 && card[4][0] == 0) { // "X" winner
			System.out.println("Looks like we've got a winner!");
			value = true;
		}
		if (value == false) {
			System.out.println("No winner yet!");
		}
		return value;
	}
}