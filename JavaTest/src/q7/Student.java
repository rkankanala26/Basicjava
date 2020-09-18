package q7;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		System.out.println("Please enter the Student age!");
		Scanner scan = new Scanner(System.in);
		int age= scan.nextInt();
		scan.close();
		try {
			getPermit(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		}

	}

	private static void getPermit(int age) throws Exception{
		if (age<13) {
			throw new UnderAgeException();
		} else {

			System.out.println("Student is allowed to get the Permit");

		}
		
	}
	

}
