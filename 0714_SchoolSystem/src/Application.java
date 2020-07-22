
public class Application {

	public static void main(String[] args) {
		
		Student studentA;
	    Student studentB;
		Teacher teacher1;
		
		studentA = new Student();
		studentA.name = "Ramayanam\n";
		
		//studentB = new Student();
		//studentB.name = "MahaBhartham\n";
		
		teacher1 = new Teacher();
		teacher1.name = "Sai Rama\n";
		
		studentA.readBook();
		studentA.readABook();
		
		//studentB.readBook();
		//studentB.readABook();
		
		teacher1.teach();
		teacher1.teachASubject();
		
				
		
		
	}

}
