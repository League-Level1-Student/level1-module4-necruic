package _08_calculator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class calculatorRunner implements ActionListener {
public static void main(String[] args) {
	calculatorRunner calculator = new calculatorRunner();
}
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton addbutton = new JButton();
JButton multbutton = new JButton();
JButton subbutton = new JButton();
JButton divbutton = new JButton();
JTextField field1 = new JTextField(10);
JTextField field2 = new JTextField(10);
public calculatorRunner (){
addbutton.setText("add");
addbutton.addActionListener(this);
multbutton.setText("mult");
multbutton.addActionListener(this);
subbutton.setText("sub");
subbutton.addActionListener(this);
divbutton.setText("div");
divbutton.addActionListener(this);
panel.add(addbutton);
panel.add(multbutton);
panel.add(subbutton);
panel.add(divbutton);
panel.add(field1);
panel.add(field2);
frame.add(panel);
frame.pack();
frame.setVisible(true);
}

public int add(int a, int b) {
	return a + b;
}
public int mult(int a, int b) {
	return a*b;
}
public int sub(int a, int b) {
	return a-b;
}
public double div(double a, double b) {
	return a/b;
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonpressed = (JButton) e.getSource();
	String one = field1.getText();
	int oneint = Integer.parseInt(one);
	String two = field2.getText();
	int twoint = Integer.parseInt(two);
	
	if (buttonpressed == addbutton) {
	int addcalc = add(oneint, twoint);
	JOptionPane.showMessageDialog(null, addcalc);
	}
	else if (buttonpressed ==multbutton) {
	int multcalc = mult(oneint, twoint);
		JOptionPane.showMessageDialog(null, multcalc);
	}
	else if (buttonpressed == subbutton) {
		int subcalc = sub(oneint, twoint);
		JOptionPane.showMessageDialog(null, subcalc);
	}
	else if (buttonpressed == divbutton) {
		double divcalc = div(oneint, twoint);
		JOptionPane.showMessageDialog(null, divcalc);
	}
}
}
