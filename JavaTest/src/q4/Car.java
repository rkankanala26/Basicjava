package q4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Car {
	private String model;
	private String make;
	private static boolean electric, gas;
	private static String fuelType;
	static ArrayList<String> cars = new ArrayList<String>();
	
	private Car() {
		this.model="";
		this.make="";
		this.electric=false;
		this.gas=false;
	}

	public static void main(String[] args) {
		
		for (int i=0; i<3; i++) {
			Start(i);
		}
		
		Display();
	
	}

	private static void Display() {
		
		int len = cars.size();
		for(int i=0;i<len;i++) {
			System.out.println(cars.get(i));
		}
	}

	private static void Start(int i) {
		System.out.println("Start the car");
		Car car=new Car();
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your car Make");
		car.make=scan.next();
		System.out.println("Enter your car Model");
		car.model=scan.next();
		System.out.println("Enter your Fuel type");
		fuelType=scan.next();
		if (fuelType=="electric"){
				electric=true;
		}else if (fuelType=="gas"){
				gas=true;
		};
		
		cars.add("Make: "+car.make+", Model: "+car.model+", Fuel Type: "+car.fuelType);	
		}

}
