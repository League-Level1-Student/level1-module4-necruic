package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	public static void main(String[] args) {
		SlotMachine slot = new SlotMachine();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button = new JButton();

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;

	}

	public SlotMachine() {
		

		button.setText("spin");
		button.addActionListener(this);
		panel.add(button);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		frame.remove(panel);
		panel = new JPanel();
		panel.add(button);
		JLabel label = null;
		JLabel label2 = null;
		JLabel label3 = null;
		JButton buttonpressed = (JButton) arg0.getSource();
		int rand = new Random().nextInt(3);
		int rand2 = new Random().nextInt(3);
		int rand3 = new Random().nextInt(3);
		System.out.println(rand);
		if (rand == 0) {
			label = createLabelImage("cherry.jpg");
		} else if (rand == 1) {
			label = createLabelImage("bell.jpg");
		} else if (rand == 2) {
			label = createLabelImage("orange.jpg");
		}
		System.out.println(rand2);
		if (rand2 == 0) {
			panel.add(label);
		} else if (rand2 == 1) {
			panel.add(label2);
		} else if (rand2 == 2) {
			panel.add(label3);
		}
		System.out.println(rand3);
		if (rand3 == 0) {
			panel.add(label);
		} else if (rand3 == 1) {
			panel.add(label2);
		} else if (rand3 == 2) {
			panel.add(label3);
		}
		panel.add(label);
		panel.add(label2);
		panel.add(label3);
		
		frame.add(panel);
		frame.pack();

	}

}
