package q2;

import java.util.Scanner;


public class StudentGrade{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your grade");

		int Grade = scanner.nextInt();

		if (Grade >= 1 && Grade <= 5) {
			System.out.println("Elementary School");
		}

		else if (Grade >= 6 && Grade <= 8) {
			System.out.println("Middle School");

		} else if (Grade >= 9 && Grade <= 12) {
			System.out.println("High School");
		}

		else {
			System.out.println("College");
		}
		
		scanner.close();
	}

}
