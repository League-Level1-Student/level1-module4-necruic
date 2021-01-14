package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	JButton trick = new JButton();
	JButton treat = new JButton();
	public nastySurprise() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.setText("Trick");
		treat.setText("Treat");
		frame.pack();
		frame.setVisible(true);
		trick.addActionListener(this);
		treat.addActionListener(this);
	
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		nastySurprise trick = new nastySurprise();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		if (buttonPressed == trick) {
			showPictureFromTheInternet("https://hips.hearstapps.com/countryliving.cdnds.net/17/47/1511194376-cavachon-puppy-christmas.jpg");
		}
		else if (buttonPressed == treat) {
			showPictureFromTheInternet("https://www.amle.org/Portals/0//EasyDNNnews/1092/1092Moulton_pic.jpg");
		}
	}
}
