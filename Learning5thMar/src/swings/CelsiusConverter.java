package swings;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class CelsiusConverter implements ActionListener{
	  JFrame converterFrame;
	  JPanel converterPanel;
	  JTextField tempCelsius;
	  JLabel celsiusLabel, fahrenheitLabel;
	  JButton convertTemp;

	  public CelsiusConverter() {
	    converterFrame = new JFrame("Convert Celsius to Fahrenheit");
	    converterPanel = new JPanel();
	    converterPanel.setLayout(new GridLayout(2, 2));
	    addWidgets();
	    converterFrame.getContentPane().add(converterPanel);
	    converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    converterFrame.setLocationRelativeTo(null);
	    converterFrame.pack();
	    converterFrame.setVisible(true);
	 }
	  private void addWidgets() {
		    tempCelsius = new JTextField(2);
		    celsiusLabel = new JLabel("Celsius");
		    convertTemp = new JButton("Convert...");
			fahrenheitLabel = new JLabel("into Fahrenheit");
		    convertTemp.addActionListener(this);
		    converterPanel.add(tempCelsius);
		    converterPanel.add(celsiusLabel);
		    converterPanel.add(convertTemp);
		    converterPanel.add(fahrenheitLabel);
		  }
	  public void actionPerformed(ActionEvent event) {
		  int tempFahr = (int)((Double.parseDouble(tempCelsius.getText())) * 1.8 + 32);
		 // fahrenheitLabel.setText(tempFahr + " Fahrenheit");
		  String userName = JOptionPane.showInputDialog(converterFrame,"What is your name?");

		  JOptionPane.showMessageDialog(converterFrame,"Hello "+userName+", \nResult is "+tempFahr + " Fahrenheit");
		    }

		  public static void main(String[] args) {
		      try {
		          UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
		      } catch(Exception e) {}

		      new CelsiusConverter();
		    }
		 } 

