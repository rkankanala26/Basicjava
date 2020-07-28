
public class Tower {
	String name;

	void draw() {
		drawPole();
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
