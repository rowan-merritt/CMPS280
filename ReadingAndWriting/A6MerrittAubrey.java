import java.util.Scanner;
import java.io.*;
public class A6MerrittAubrey {
    public static void main(String[] args) throws IOException{  // Create Scanner for file
        // User prompting
        System.out.println("This program will return the following from a file containing a list of numbers: sum of all listed numbers, total count, largest listed number, smallest listed number, and average of all listed numbers. \n\tPlease enter the file name of a file that contains a list of numbers and the name of your choosen output file.");
        Scanner s = new Scanner(System.in);
        System.out.println("\nEnter the name of the input file: ");
        String input = s.nextLine();
        System.out.println("\nEnter the name of the output file: ");
        String output = s.nextLine();
        PrintWriter out = new PrintWriter(output);
        s.close();
        // default variables
        double count = 0;
        double largest = 0;
        double smallest = 0;
        double average = 0;
        double sum = 0;
        try {
            Scanner file = new Scanner(new File(input)); // Accessing the user file and read
            if (file.hasNext()){
                count++; // increasing count
                    double value = file.nextDouble(); // reading in the value
                    largest = value;
                    smallest = value;
                    sum += value; // getting the sum of all values
            }
            while ( file.hasNext() ) {
                if ( file.hasNextDouble() ) {
                    count++; // increasing count
                    double value = file.nextDouble(); // reading in the value
                    if (value > largest){
                        largest = value;
                    }
                    if(value < smallest){
                        smallest = value;
                    }
                    sum += value; // getting the sum of all values
                }
            }
            average = sum / count; // getting the average
            
        }catch (FileNotFoundException e){
            System.out.println("\tCould not find the given filename to read! \n\tPlease make sure the filename is correct!");
            System.exit(1);
        }
        // Printing out to terminal
        System.out.println("\tCount: " + count);
        System.out.println("\tLargest: " + largest);
        System.out.println("\tSmallest: " + smallest);
        System.out.println("\tSum: " + sum);
        System.out.println("\tAverage: " + average);
        System.out.println("\tProgram completed with no problems!");
        // Printing out to the outputFile
        out.println("\tCount: " + count);
        out.println("\tLargest: " + largest);
        out.println("\tSmallest: " + smallest);
        out.println("\tSum: " + sum);
        out.println("\tAverage: " + average);
        out.println("\tProgram completed with no problems!");
        out.close();
    }
}