
public class Tower1 {
	String name;

	void draw() {
		drawPole();
		
		//draw the small disk
		Disk small = new Disk(4);
		small.draw();
		
		//draw the medium disk
		Disk medium = new Disk(8);
		medium.draw();
		
		//draw the large disk
		Disk large = new Disk(12);
		large.draw();
		
		
		drawBase();
		drawTitle();

	}

	void drawPole() {
		for (int i = 0; i < 4; i++) {
			System.out.println("    |");
		}

	}

	void drawBase() {
		System.out.println("           ----------");

	}

	void drawTitle() {
		System.out.println("          " + name);
	}
}
