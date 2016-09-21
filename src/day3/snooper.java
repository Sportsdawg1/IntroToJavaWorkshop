package day3;

import javax.swing.JOptionPane;

public class snooper {
	public static void main(String[] args) {
		String answer = JOptionPane.showInputDialog("What time is it?");
		JOptionPane.showMessageDialog(null, "YOU LIE");
		JOptionPane.showMessageDialog(null, "THE TIME IS " + answer);
	}
}
