
public class Application {

	public static void main(String[] args) {

		String[] names = new String[3];

		names[0] = "Rina";
		names[1] = "Ram";
		names[2] = "Sam";
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
				
		}
		
		System.out.println("----------");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		
	}

}
