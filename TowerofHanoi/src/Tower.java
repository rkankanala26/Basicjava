

public class Tower {
	
	String name;
	
	public Tower(String parm) {
		this.name = parm;
	}

	private void drawPole() {
		
		for (int i = 0 ; i<5; i++ ) {
			System.out.println("                  |");          
		}
	}
		
	private void drawBase() {
		System.out.println("                  ____________________");
		System.out.println();
		
	}
	
	private void drawTitle() {

		System.out.println(name);
	}
	
	void draw() {
		drawTitle();
		drawPole();
		drawBase();

		
	}
	
	
	

}
