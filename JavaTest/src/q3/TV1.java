package q3;

public class TV1 {
	private String color;
	private int size;
	private String model;
	private String make;
	private double price;

	//TV has color, size, model, make, price and some more
	public TV1 (String color) {
		this.color=color;
	}
	
	public TV1 (int size, String model) {
		this.size = size;
		this.model= model;
	}
	
	public TV1() {
		this.make="Samsung";
		this.price=1200;
	}
	public static void main(String[] args) {
		
		TV1 objTV1 = new TV1("Blue");
		System.out.println("My TV Color is " + objTV1.color);
		
		TV1 objTV2 = new TV1(46,"LED TV");
		System.out.println("      Size is " + objTV2.size +" inches ");
		System.out.println("      Model is "+objTV2.model);
		
		TV1 objTV3 = new TV1();
		System.out.println("      Make is "+objTV3.make );
		System.out.println("      Price is: $"+ objTV3.price);

	}

}
