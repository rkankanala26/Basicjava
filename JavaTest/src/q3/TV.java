package q3;

public class TV {
	private String color;
	private int size;
	private String model;
	private String make;
	private double price;

	//TV has color, size, model, make, price and some more
	public TV (String color) {
		this.color=color;
	}
	
	public TV (int size, String model) {
		this.size = size;
		this.model= model;
	}
	
	public TV() {
		this.make="Samsung";
		this.price=1200;
	}
	public static void main(String[] args) {
		
		TV objTV1 = new TV("Blue");
		System.out.println("My TV Color is " + objTV1.color);
		
		TV objTV2 = new TV(46,"LED TV");
		System.out.println("      Size is " + objTV2.size +" inches ");
		System.out.println("      Model is "+objTV2.model);
		
		TV objTV3 = new TV();
		System.out.println("      Make is "+objTV3.make );
		System.out.println("      Price is: $"+ objTV3.price);

	}

}
