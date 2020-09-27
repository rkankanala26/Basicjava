package q9;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GuiFrame extends JFrame {

	public GuiFrame() {
		//Create Frame
		this.setSize(400, 400);
		//Show the Window
		this.setVisible(true);
		
		//Set the Title
		this.setTitle("School Registration Form");
		
		//Set default close window
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
	}

}
