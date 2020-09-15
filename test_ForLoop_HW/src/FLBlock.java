
public class FLBlock {

	public static void main(String[] args) {

		// Starting number :10
		// every step : 10
		// End : stop 100;

		/*
		 * int x =10;
		 * 
		 * for( ; x <=100 ; x = x+10){ System.out.println(x);
		 * 
		 * }
		 * 
		 * public class ForBlock {
		 * 
		 * public static void main(String[] args) { for( int x=0; x<10 ; x++){
		 * System.out.println(x); }
		 */
		// Starting number :100 // every step : 10 // End : stop 10;

		int x = 100;

		for (; x >= 10; x = x - 10) {
			System.out.println(x);

			for (int x = 0; x < 10; x++) {
				System.out.println(x);
			}
		}

	}
}