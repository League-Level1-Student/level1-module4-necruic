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
int game=0;
public WhackAMole () {
	DrawButtons();
	}

public void DrawButtons () {
	frame.add(panel);
	frame.setSize(225, 250);;
	frame.setVisible(true);
}
private void endGame(Date timeAtStart, int molesWhacked) { 
    Date timeAtEnd = new Date();
    JOptionPane.showMessageDialog(null, "Your whack rate is "
            + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                  + " moles per second.");
}
	int rand = new Random().nextInt(24); {
	for (int i = 0; i < 24; i++) {
			JButton button = new JButton(" ");
			panel.add(button);
			button.addActionListener(this);
			if (i==rand) {
				button.setText("mole!");
			}
			
			
}
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonpressed = (JButton) arg0.getSource();
		if (buttonpressed.getText().equals("mole!") ) {
			frame.dispose();
			DrawButtons();
		}
		else {
			speak("you missed");
			frame.dispose();
			DrawButtons();
		}
		game=game+1;
		
	}
	static void speak(String words) {
        if( System.getProperty( "os.name" ).contains( "Windows" ) ) {
            String cmd = "PowerShell -Command \"Add-Type -AssemblyName System.Speech; (New-Object System.Speech.Synthesis.SpeechSynthesizer).Speak('"
                    + words + "');\"";
            try {
                Runtime.getRuntime().exec( cmd ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        } else {
            try {
                Runtime.getRuntime().exec( "say " + words ).waitFor();
            } catch( Exception e ) {
                e.printStackTrace();
            }
        }
    }

}