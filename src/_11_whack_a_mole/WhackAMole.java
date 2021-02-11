package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
	public static void main(String[] args) {
		WhackAMole whack = new WhackAMole();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	Date date = new Date();
	int game = 0;
	int miss = 0;

	public WhackAMole() {
		DrawButtons();
	}

	public void DrawButtons() {
		frame.dispose();
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		
		frame.setVisible(true);
		int rand = new Random().nextInt(24);
		System.out.println(rand);
			for (int i = 0; i < 24; i++) {
				JButton button = new JButton(" ");
				panel.add(button);
				
				button.addActionListener(this);
				if (i == rand) {
					button.setText("mole!");
				}
			}
			frame.setSize(225, 250);
		}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonpressed = (JButton) arg0.getSource();
		if (buttonpressed.getText().equals("mole!")) {
			DrawButtons();
			game = game + 1;
		} else {
			speak("you missed " + miss + "moles");
			DrawButtons();
			miss = miss + 1;

		}

		if (game == 10) {
			endGame(date, 10);
		} else if (miss == 5) {
			JOptionPane.showMessageDialog(null, "you lost");
			endGame(date, game);
		}

	}

	static void speak(String words) {
//		if (System.getProperty("os.name").contains("Windows")) {
//			String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
//					+ words + "');\"";
//			try {
//				Runtime.getRuntime().exec(cmd).waitFor();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		} else {
//			try {
//				Runtime.getRuntime().exec("say " + words).waitFor();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		JOptionPane.showMessageDialog(null, words);
	}

}