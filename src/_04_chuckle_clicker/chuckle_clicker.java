package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckle_clicker implements ActionListener{
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public void makeButtons () {
		JPanel panel = new JPanel();
		JFrame frame = new JFrame();
		button1.setText("joke");
		button2.setText("punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		JOptionPane.showMessageDialog(null, "Make Buttons");
		panel.add(button1);
		panel.add(button2);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		
	}
public static void main(String[] args) {
	chuckle_clicker clicker = new chuckle_clicker();
	clicker.makeButtons();

}
public void actionPerformed (ActionEvent e) {
	JButton buttonpressed = (JButton) e.getSource();
	if (buttonpressed == button1) {
		JPanel panel2 = new JPanel();
		JFrame frame2 = new JFrame();
		JOptionPane.showMessageDialog(null, "To get to the other side.");
	}
		else if (buttonpressed == button2) {
			JPanel panel3 = new JPanel ();
			JFrame frame3 = new JFrame ();
			JOptionPane.showMessageDialog(null, "Who's there?");
		}
	}
}

