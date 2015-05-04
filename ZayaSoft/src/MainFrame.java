import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * 
 * @author gotre
 * @version 2.0
 */

public class MainFrame {

	private JFrame frame;
	private JTextField display;
	private double op1=0,op2=0;
	private String operacion="";
	private boolean nueva=true;
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
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		frame.setBounds(100, 100, 342, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		display = new JTextField();
		display.setBounds(47, 32, 241, 50);
		frame.getContentPane().add(display);
		display.setColumns(10);

		//1
		JButton number1 = new JButton("1");
		number1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"1");
			}
		});
		number1.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number1.setBounds(48, 224, 50, 50);
		frame.getContentPane().add(number1);

		//2
		JButton number2 = new JButton("2");
		number2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"2");
			}
		});
		number2.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number2.setBounds(109, 224, 50, 50);
		frame.getContentPane().add(number2);

		//3
		JButton number3 = new JButton("3");
		number3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(nueva){display.setText("");nueva=false;}
	                display.setText(display.getText()+"3");
			}
		});
		number3.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number3.setBounds(171, 224, 50, 50);
		frame.getContentPane().add(number3);

		//4
		JButton number4 = new JButton("4");
		number4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(nueva){display.setText("");nueva=false;}
	                display.setText(display.getText()+"4");
			}
		});
		number4.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number4.setBounds(47, 167, 50, 50);
		frame.getContentPane().add(number4);

		//5
		JButton number5 = new JButton("5");
		number5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"5");
			}
		});
		number5.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number5.setBounds(109, 167, 50, 50);
		frame.getContentPane().add(number5);

		//6
		JButton number6 = new JButton("6");
		number6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"6");
			}
		});
		number6.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number6.setBounds(171, 167, 50, 50);
		frame.getContentPane().add(number6);
			
		//7
		JButton number7 = new JButton("7");
		number7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"7");
			}
		});
		number7.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number7.setBounds(47, 106, 50, 50);
		frame.getContentPane().add(number7);
			
		//8
		JButton number8 = new JButton("8");
		number8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(nueva){display.setText("");nueva=false;}
	                display.setText(display.getText()+"8");
			}
		});
		number8.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number8.setBounds(109, 106, 50, 50);
		frame.getContentPane().add(number8);
		
		//9
		JButton number9 = new JButton("9");
		number9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(nueva){display.setText("");nueva=false;}
                display.setText(display.getText()+"9");
			}
		});
		number9.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number9.setBounds(171, 106, 50, 50);
		frame.getContentPane().add(number9);
		
		//0
		JButton number0 = new JButton("0");
		number0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(nueva){display.setText("");nueva=false;}
	                display.setText(display.getText()+"0");
			}
		});
		number0.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		number0.setBounds(109, 278, 50, 50);
		frame.getContentPane().add(number0);
		
		//Sumar
		JButton buttonPlus = new JButton("+");
		buttonPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					if(op1!=0)
						 op1=Modulo2.suma(op1, Double.parseDouble(display.getText()));
	                 else
	                     op1=Double.parseDouble(display.getText());
	                 operacion="suma";
	                 display.setText("");
				}catch(Exception err){}
			}
		});
		buttonPlus.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonPlus.setBounds(233, 106, 50, 50);
		frame.getContentPane().add(buttonPlus);
		
		//Restar
		JButton buttonMinus = new JButton("-");
		buttonMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
                    if(op1!=0)
                    	op1=Modulo2.resta(op1, Double.parseDouble(display.getText()));
                    else
                        op1=Double.parseDouble(display.getText());
                    operacion="resta";
                    display.setText("");
                }catch(Exception err){}
			}
		});
		buttonMinus.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonMinus.setBounds(233, 167, 50, 50);
		frame.getContentPane().add(buttonMinus);
		
		//Multiplica
		JButton buttonMultiply = new JButton("*");
		buttonMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
                    if(op1!=0)
                        op1=Modulo2.multiplicacion(op1, Double.parseDouble(display.getText()));
                    else
                        op1=Double.parseDouble(display.getText());
                    operacion="multiplicacion";
                    display.setText("");
                }catch(Exception err){}
			}
		});
		buttonMultiply.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonMultiply.setBounds(233, 224, 50, 50);
		frame.getContentPane().add(buttonMultiply);

		//Divide
		JButton buttonDivide = new JButton("/");
		buttonDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
	                    if(op1!=0)
	                    	op1=Modulo2.division(op1, Double.parseDouble(display.getText()));
	                    else
	                        op1=Double.parseDouble(display.getText());
	                    operacion="division";
	                    display.setText("");
	                }catch(Exception err){}
			}
		});
		buttonDivide.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonDivide.setBounds(233, 278, 50, 50);
		frame.getContentPane().add(buttonDivide);
		
		//Punto
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
			
		//Limpiar
		JButton buttonClear = new JButton("CE");
		buttonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				display.setText("");
                op1=op2=0;
                operacion="";
			}
		});
		buttonClear.setFont(new Font("Comic Sans MS", Font.BOLD, 13));
		buttonClear.setBounds(171, 278, 50, 50);
		frame.getContentPane().add(buttonClear);
		
		//Igual
		JButton buttonEqual = new JButton("=");
		buttonEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try{
	                    op2=Double.parseDouble(display.getText());
	                }catch(Exception err){}
	                if(operacion.equals("suma")){
	                    double res=Modulo2.suma(op1, op2);
	                    display.setText(String.valueOf(res));
	                    op1=op2=0;
	                    operacion="";
	                }else if(operacion.equals("resta")){
	                    double res=Modulo2.resta(op1, op2);
	                    display.setText(String.valueOf(res));
	                    op1=op2=0;
	                    operacion="";
	                }else if(operacion.equals("multiplicacion")){
	                    double res=Modulo2.multiplicacion(op1, op2);
	                    display.setText(String.valueOf(res));
	                    op1=op2=0;
	                    operacion="";
	                }else if(operacion.equals("division")){
	                    double res=Modulo2.division(op1, op2);
	                    display.setText(String.valueOf(res));
	                    op1=op2=0;
	                    operacion="";
	                }
	                nueva=true;
			}
		});
		buttonEqual.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
		buttonEqual.setBounds(171, 336, 112, 50);
		frame.getContentPane().add(buttonEqual);
		
		}
	
	}
