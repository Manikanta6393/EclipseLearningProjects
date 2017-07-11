package swings;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class HelloWorldFrame extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int numClicks;
	public HelloWorldFrame() {
		super("Swing Application");
		JPanel p1 = new JPanel(); 
		JPanel p2 = new JPanel(); 
		final JLabel label = new JLabel();
		JButton button = new JButton("I am Swing button");
		p1.add(button);
		p2.add(label);
		Container container = this.getContentPane() ;
		container.setLayout(new BorderLayout());
		container.add(p1, BorderLayout.NORTH);
		container.add(p2, BorderLayout.SOUTH);
		setLocationRelativeTo(null);
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		button.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			    numClicks++;
			    label.setText("No of clicks : " + numClicks);
			  }}); 

	}
	public static void main(String[] args) {
		new HelloWorldFrame();
		
	}
}

