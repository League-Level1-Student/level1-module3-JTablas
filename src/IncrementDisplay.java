
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class IncrementDisplay implements ActionListener {
	
	public static void main(String[] args) {
		new IncrementDisplay().createUI();
	}
	int incr;
	JButton increaseButton = new JButton();
	JButton displayButton = new JButton();
	JButton decreaseButton = new JButton();
	
	JFrame frame = new JFrame();
	
	JPanel panel = new JPanel();

	private void createUI() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 1. Add the panel to the frame
		frame.add(panel);
		// 2. Make the frame visible
		frame.setVisible(true);
		// 3. Set the text of the increaseButton to "Click me!"
		increaseButton.setText("Increment!");
		// 4. Set the text of the displayButton to "Click me!"
		displayButton.setText("Display");
		decreaseButton.setText("Decrement");
		// 5. Add an action listener to the increaseButton
		increaseButton.addActionListener(this);
		// 6. Add an action listener to the displayButton
		displayButton.addActionListener(this);
		decreaseButton.addActionListener(this);
		// 7. Add the increaseButton to the panel
		panel.add(increaseButton);
		// 8. Add the displayButton to the panel
		panel.add(displayButton);
		panel.add(decreaseButton);
		// 9. Pack the frame
		frame.pack();
		// 10. Set the title of the frame to "Demanding Buttons"
		frame.setTitle("Increasement Buttons");
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		JButton buttonPressed = (JButton) arg0.getSource();
		
		
		/* If the buttonPressed was the increaseButton....*/
		if(buttonPressed==increaseButton){
		incr=incr+1;
		System.out.println(incr);
		}
			// Set the text of the displayButton to "No, click Me!"
			// Set the PREFERRED size of the displayButton to BIG
			// Set the text of the increaseButton to "Click Me!"
			// Set the PREFERRED size of the increaseButton to SMALL
		
		
		/* If the buttonPressed was the displayButton, do the opposite. */
		if(buttonPressed==decreaseButton){
		incr=incr-1;	
		System.out.println(incr);
		}
		
		if(buttonPressed==displayButton){
		JOptionPane.showMessageDialog(null, incr);
			
		}

		frame.pack();
	}
}
