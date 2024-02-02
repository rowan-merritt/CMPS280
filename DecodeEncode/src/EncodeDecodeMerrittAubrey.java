import java.util.Scanner;

public class EncodeDecodeMerrittAubrey {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		EncoderMerrittAubrey encode = new EncoderMerrittAubrey();
		DecoderMerrittAubrey decode = new DecoderMerrittAubrey();
		
		//Prompting the user
		System.out.println("This program will read in a message an an offset to encode the message by. \nIt can also be used to decode a message with a given offset \nEnter 1 to encode and 2 to decode.");
		
		int encodeOrDecode = input.nextInt(); // taking in the user input
		
		if (encodeOrDecode == 1) {
			System.out.println("Enter the message that you want to encode: ");
			String encodeMessage = input.next();
			System.out.println("Enter the offset to encode with: ");
			int offest = input.nextInt();
			//encode.
			
			System.out.println("Do you want to decode the message? (Y/N) : ");
			String decodeMessage = input.next();
			if (decodeMessage == "Y") {
				//decode.
			}
			if(decodeMessage == "N"){
				System.out.println("Thanks for using the program.");
			}

		}
		
		// decode the message
		if(encodeOrDecode == 2) {
			System.out.println("Enter the message that you want to decode: ");
			String decodeMessage = input.next();
			System.out.println("Enter the offset to decode with: ");
			int offest = input.nextInt();
			
			//decode.
		}
	}
}