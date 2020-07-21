
public class Application {

	public static void main(String[] args) {
		
		
			Person person1;
			Person person2;
			Person person3;
			
			
			person1 = new Person();
			person1.name = "John" ;	
			person1.age = 35;
			person1.gender = "Male";
			person1.Occupation = "Clerk";
			person1.city = "Portland";
			
			person2 = new Person();
			person2.name ="Tom";	
			person2.age = 42;
			person2.gender = "Male";
			person2.Occupation = "Nurse";
			person2.city = "Hillsboro";
			
			person3 = new Person();
			person3.name ="Annie";	
			person3.age = 47 ;
			person3.gender = "Female";
			person3.Occupation = "Doctor";
			person3.city = "Tigard";
			
			person1.details();			
			person2.details();			
			person3.details();
			person1.location();
			
		
		
		
	}

}
