import java.util.Scanner; // importing Scanner

public class BINGOGameMerrittAubrey {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean complete = false;
		
		BINGOCardMerrittAubrey card = new BINGOCardMerrittAubrey();
		
		System.out.println("Welcome to a game of BINGO!"); 
		System.out.println("Here is your card: ");
		card.getBINGOcard(); // Create a new  bingo card
		card.printCard(); // print new bingo card
	
		while (!complete) {
			// Prompt the user for what to do
			System.out.println("What would you like to do? ");
			System.out.println("\t1) Enter a called number.");
			System.out.println("\t2) See current card.");
			
			double pick = input.nextDouble();
			
			// Entering Called numbers
			if (pick == 1) {
				System.out.println("Enter the called number: ");
				int callNumber = input.nextInt(); 
				card.replaceNumbers(callNumber); // "marking out" called numbers
				card.printCard(); // printing card
				complete = card.findWinner(); // finding the winner to end the end
			}
			
			// Looking at the given card again
			if (pick == 2) {
				card.printCard();
			}		
		}
	}
}