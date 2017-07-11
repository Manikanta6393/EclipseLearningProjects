package swings;

import javax.swing.*;

public class HelloWorldSwing {

	 public static void main(String[] args) {
	  JFrame frame = new JFrame("Manikanta's Window");
	  JLabel label = new JLabel("Hi Manikanta, How are you?");
	  JTextField textField1 = new JTextField("This is text"); 
	  JTextArea textArea1 = new JTextArea("Initial text");
	  JCheckBox checkbox = new JCheckBox("Label for checkbox");
	  JRadioButton radioButton1 = new JRadioButton("Label for button");
	  frame.getContentPane().add(radioButton1);
	  frame.setSize(1200, 1300);
	  frame.setLocationRelativeTo(null);
	  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	  frame.pack();
	  frame.setVisible(true);
	  }
	}

