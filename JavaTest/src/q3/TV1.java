package q3;

import java.util.Scanner;

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
		this.make="SONY";
		this.price=100;
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your tv color");
		String color = scan.next();
		TV1 objTV1 = new TV1(color);
		
		System.out.println("Please enter your TV size and model");
		int size = scan.nextInt();
		String model = scan.next();
		TV1 objTV2 = new TV1(size,model);
		
		TV1 objTV3 = new TV1();
		System.out.println("Please ener your TV make and price");
		String make = scan.next();
		double price = scan.nextDouble();
		objTV3.make=make;
		objTV3.price=price;
		
		System.out.println("Your TV Color is " + objTV1.color);
		
		System.out.println("      Size is " + objTV2.size +" inches ");
		System.out.println("      Model is "+objTV2.model);
		
		System.out.println("      Make is "+objTV3.make );
		System.out.println("      Price is: $"+ objTV3.price);

	}

}
