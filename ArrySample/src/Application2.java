import java.util.ArrayList;

public class Application2 {
	public static void main(String[] args) {

		ArrayList list = new ArrayList();
		list.add("Krish");
		list.add("Ram");
		list.add("Sam");
		list.add("Rina");
		list.add("ted");

		for (Object s : list) {
			System.out.println(s);

		}

	}
}
