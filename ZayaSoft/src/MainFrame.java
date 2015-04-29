import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MainFrame {

	private JFrame frame;
	private JTextField display;
	private String op1 = "none", op2 = "none";
	private double doubleOp1, doubleOp2;
	private int key;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		key = -1;
		
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		frame.setBounds(100, 100, 358, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setBounds(47, 32, 241, 50);
		frame.getContentPane().add(display);
		display.setColumns(10);
		
		JButton number7 = new JButton("7");
		number7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"7");
			}
		});
		number7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number7.setBounds(47, 106, 50, 50);
		frame.getContentPane().add(number7);
		
		JButton number4 = new JButton("4");
		number4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"4");
			}
		});
		number4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number4.setBounds(47, 167, 50, 50);
		frame.getContentPane().add(number4);
		
		JButton number8 = new JButton("8");
		number8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"8");
			}
		});
		number8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number8.setBounds(109, 106, 50, 50);
		frame.getContentPane().add(number8);
		
		JButton number9 = new JButton("9");
		number9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"9");
			}
		});
		number9.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number9.setBounds(171, 106, 50, 50);
		frame.getContentPane().add(number9);
		
		JButton number5 = new JButton("5");
		number5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"5");
			}
		});
		number5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number5.setBounds(109, 167, 50, 50);
		frame.getContentPane().add(number5);
		
		JButton number6 = new JButton("6");
		number6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"6");
			}
		});
		number6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number6.setBounds(171, 167, 50, 50);
		frame.getContentPane().add(number6);
		
		JButton number1 = new JButton("1");
		number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"1");
			}
		});
		number1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number1.setBounds(48, 224, 50, 50);
		frame.getContentPane().add(number1);
		
		JButton number2 = new JButton("2");
		number2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"2");
			}
		});
		number2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number2.setBounds(109, 224, 50, 50);
		frame.getContentPane().add(number2);
		
		JButton number3 = new JButton("3");
		number3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"3");
			}
		});
		number3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number3.setBounds(171, 224, 50, 50);
		frame.getContentPane().add(number3);
		
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (setOperator1()){
						key = 0;
						System.out.println(key);
				}
			}
		});
		buttonPlus.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonPlus.setBounds(233, 106, 50, 50);
		frame.getContentPane().add(buttonPlus);
		
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (setOperator1()){
					if (key == -1){
						key = 1;
					}
				}
			}
		});
		buttonMinus.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonMinus.setBounds(233, 167, 50, 50);
		frame.getContentPane().add(buttonMinus);
		
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (setOperator1()){
					if (key == -1){
						key = 2;
					}
				}
			}
		});
		buttonMultiply.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonMultiply.setBounds(233, 224, 50, 50);
		frame.getContentPane().add(buttonMultiply);
		
		JButton buttonPoint = new JButton(".");
		buttonPoint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!display.getText().contains(".")){
					display.setText(display.getText()+".");
				}
			}
		});
		buttonPoint.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonPoint.setBounds(47, 278, 50, 50);
		frame.getContentPane().add(buttonPoint);
		
		JButton number0 = new JButton("0");
		number0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText(display.getText()+"0");
			}
		});
		number0.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number0.setBounds(109, 278, 50, 50);
		frame.getContentPane().add(number0);
		
		JButton buttonClear = new JButton("CE");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				op1 = "none";
				op2 = "none";
				key = -1;
				display.setText("");
			}
		});
		buttonClear.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		buttonClear.setBounds(171, 278, 50, 50);
		frame.getContentPane().add(buttonClear);
		
		JButton buttonEqual = new JButton("=");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doOperation();
			}
		});
		buttonEqual.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonEqual.setBounds(171, 336, 112, 50);
		frame.getContentPane().add(buttonEqual);
		
		JButton buttonDivide = new JButton("/");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (setOperator1()){
					if (key == -1){
						key = 3;
					}
				}
			}
		});
		buttonDivide.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonDivide.setBounds(233, 278, 50, 50);
		frame.getContentPane().add(buttonDivide);
	}
	
	private boolean setOperator1(){
		if (op1.equals("none")){
			op1 = display.getText();
			doubleOp1 = Double.parseDouble(op1);
			display.setText("");
			return true;
		}
		return false;
	}
	
	private boolean setOperator2(){
		if (op2.equals("none")){
			op2 = display.getText();
			doubleOp2 = Double.parseDouble(op2);
			display.setText("");
			return true;
		}
		return false;
	}
	
	
	private void doOperation(){
		double result;

		switch (key) {
		case 0:
			if (setOperator2()){
				result = Modulo2.suma(doubleOp1, doubleOp2);
				op1 = "none";
				op2 = "none";
				key = -1;
				display.setText(String.valueOf(result));
			}
			break;

		default:
			break;
		}
	}
}
