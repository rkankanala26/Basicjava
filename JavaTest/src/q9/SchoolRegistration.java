package q9;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SchoolRegistration {

	public static void main(String[] args) {

		DisplayRegistrationForm();

	}

	private static void DisplayRegistrationForm() {
//		//Create Frame
//		JFrame frame = new JFrame();
//		frame.setSize(1000, 800);
//		
//		//Show the Window
//		frame.setVisible(true);
//		
//		//Set the Title
//		frame.setTitle("School Registration Form");
//		
//		//Set default close window
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		//Add Panel to the frame
//		JPanel panel = new JPanel();
//		frame.add(panel);
//		panel.setBackground(Color.ORANGE);
	
		GuiFrame frame = new GuiFrame ();
		frame.setTitle("Chandra");
		
		//Add Panel to the frame
		MyPanel panel = new MyPanel();
		panel.setBackground(Color.CYAN);
	}

}
