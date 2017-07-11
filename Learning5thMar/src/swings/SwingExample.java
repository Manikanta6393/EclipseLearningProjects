package swings;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class SwingExample extends JFrame{
	public SwingExample() {
		super("Simple example");
		setSize(300, 200);
		setLocationRelativeTo(null); // centers the window on the screen
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				SwingExample ex = new SwingExample();
			}
		});
	}
}

