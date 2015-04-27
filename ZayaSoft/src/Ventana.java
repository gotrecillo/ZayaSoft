import javax.swing.JFrame;


public class Ventana {
	private JFrame mainFrame;

	public Ventana() {
		mainFrame = new JFrame("Calculadora");
		mainFrame.setSize(600, 600);
		mainFrame.setVisible(true);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
