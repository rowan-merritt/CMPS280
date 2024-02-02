import java.util.Scanner; // importing Scanner

public class GradeMerrittAubrey {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] exams = new double[0];
		double[] assignments = new double[0];
		
		System.out.println("Let's start with Exams. Enter how many exams have been taken so far: "); // Prompting user for the amount of exams
		int examAmount = input.nextInt(); // input amount of exam
		if (examAmount >= 1) {
			System.out.println("Go ahead an enter " + examAmount + " exam grades:"); // Prompting user for their exam scores
			
			exams = new double[examAmount];
			// Put input into the exam array
			for (int e = 0; e <= exams.length - 1; e++) {
				exams[e] = input.nextDouble();
			}
		}
		else {
			System.out.print("");
		}

		
		System.out.println("Now enter how many assignments have been done: "); // Prompting user for the amount of assignments
		int assignmentAmount = input.nextInt(); // input amount of assignments
		if (assignmentAmount >= 1) {
			System.out.println("Go ahead an enter " + assignmentAmount + " assignments grades:"); // Prompting user for their assignment scores
			assignments = new double[assignmentAmount];
			// Put input into the assignment array
			for (int a = 0; a <= assignments.length - 1; a++) {
				assignments[a] = input.nextDouble();
			}
		}
		else {
			System.out.print("");
		}
		
		if (examAmount == 0 && assignmentAmount == 0) {
			System.out.println("Your current averages and grades are:  \n   Exam Average: 100.0    \n   Assignment Average: 100.0    \n   Overall Grade: 100.0");
		}
		else {
			double examAverage = examAverage(exams, examAmount);
			double assignmentAverage = assignmentAverage(assignments, assignmentAmount);
			double overallGrade = overallGrade(examAverage, assignmentAverage);
		
			// Printing out averages and overall grade
			System.out.println("Your current averages and grades are:  \n   Exam Average: " + examAverage + "\n   Assignment Average: " + assignmentAverage + "\n   Overall Grade: " + overallGrade);
		}
	} // closing main method
	
	public static double examAverage(double[] exam, int eAmount) {
		
		double m = exam[0];
		double total = 0;
		double average = 100.0;
			
			if (eAmount > 0 && eAmount != 4) {
				for(int x = 0; x < exam.length; x++) {
					// adding all of the exam scores
					total += exam[x];
					average = total / eAmount; //getting the average exam score
				} // ending for
			} // ending if
			
			if (eAmount == 4) {
				for(int x = 0; x < exam.length; x++) {
					total += exam[x]; // adding all of the exam scores
					// finding the lowest exam score
					if (m > exam[x]) {
						m = exam[x];
					} // ending if
				} // ending for
				
				total = total - m;
				average = total / (eAmount - 1); //getting the average exam score
			} // ending if
		
		return average;
		
	} // closing examAverage method
	
	public static double assignmentAverage(double[] assignment, int aAmount) {
		double average = 100.0;
		double total = 0;
	
		if (aAmount >= 1) {
			for(int x = 0; x < assignment.length; x++) {
				total += assignment[x]; // adding all of the assignment scores
			}
			average = total / aAmount; //getting the average assignment score
		}
		return (int)average;
		
	} // closing assignmentAverage method
		
	public static double overallGrade(double examAverage, double assignmentAverage) {
		double overallGrade = Math.ceil((assignmentAverage * .5) + (examAverage * .4) + 10); // Getting the overall grade from exam and assignment scores
		return Math.ceil(overallGrade);
		
	} // closing overallAverage method
	
} // closing GradeMerrittAubrey