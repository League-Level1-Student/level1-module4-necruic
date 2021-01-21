package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typing_tutor implements KeyListener {
	char currentletter;

public static void main(String[] args) {
	typing_tutor tutor = new typing_tutor();
	tutor.setup(); 
}
char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
 
    
}
JLabel label = new JLabel();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
public void setup() {
	currentletter = generateRandomLetter();
	
	label.setText(currentletter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(this);
	panel.add(label);
	frame.add(panel);
	frame.pack();
	frame.setVisible(true);
}


@Override
public void keyPressed(KeyEvent arg0) {
	// TODO Auto-generated method stub
	System.out.println(currentletter);
	if (currentletter == arg0.getKeyChar()) {
		panel.setBackground(Color.green);;
	}
	else {
		panel.setBackground(Color.red);
	}
}
@Override
public void keyReleased(KeyEvent arg0) {
	// TODO Auto-generated method stub
	currentletter = generateRandomLetter();
	label.setText(currentletter+"");
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
}
@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}
}
