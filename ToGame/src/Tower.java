
public class Tower {

	private String name;

	Tower(String name) {
		this.name = name;
	}

	void draw() {
		drawPole();
		drawBase();
		drawTitle();
		
		// draw the small disk
        disk small = new disk(4);
        small.draw();

        // draw the medium disk
        disk medium = new disk(8);
        medium.draw();

        // draw the large disk
        disk large = new disk(12);
        large.draw();

	}

	void drawPole() {
		for (int i = 0; i < 4; i++) {
			System.out.println("          |");

		}
	}

	void drawBase() {
		System.out.println("         ----------");
	}

	void drawTitle() {
		System.out.println("         " + name);
	}
	
	
}
