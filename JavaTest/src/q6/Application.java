package q6;
public class Application {

	public static void main(String[] args) {
		System.out.println("Testing the method to add two numbers and multiply the result with another number");
		System.out.println("Pass the numbers 4,5,6");
		System.out.println("The result is: " +Math(4,5,6));

	}
	
	private static int Math(int p1, int p2, int p3) {
		int result = (p1+p2)*p3; 
		return result;
		
	}


}
