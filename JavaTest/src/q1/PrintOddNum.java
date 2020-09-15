package q1;

public class PrintOddNum {

	public static void main(String[] args) {
		
		System.out.println("Print all odd numbers between 1-100");
		for (int i=0; i<=100; i++) {
			
			if (i%2==1) {
				System.out.print(i);
				if (i<99) {
				System.out.printf(", ");
				}

			}
			
		}
		

	}

}
