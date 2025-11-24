package pekan9_2511531005;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JLabel;

public class calculator_2511531005 {

	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator_2511531005 window = new calculator_2511531005();
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
	public calculator_2511531005() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 225, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 10, 186, 40);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnhapus = new JButton("\uF0E7");
		btnhapus.setFont(new Font("wingdings", Font.PLAIN, 10));
		btnhapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if (textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnhapus.setBounds(10, 60, 48, 40);
		frame.getContentPane().add(btnhapus);
		
		JButton btnc = new JButton("c");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnc.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnc.setBounds(59, 60, 39, 40);
		frame.getContentPane().add(btnc);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn00.setBounds(103, 60, 48, 40);
		frame.getContentPane().add(btn00);
		
		JButton btnplus_25111531005 = new JButton("+");
		btnplus_25111531005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnplus_25111531005.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnplus_25111531005.setBounds(157, 60, 43, 40);
		frame.getContentPane().add(btnplus_25111531005);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn7.setBounds(10, 110, 43, 40);
		frame.getContentPane().add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn4.setBounds(10, 160, 43, 40);
		frame.getContentPane().add(btn4);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn1.setBounds(10, 210, 43, 40);
		frame.getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn0.setBounds(10, 260, 43, 40);
		frame.getContentPane().add(btn0);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});  
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn8.setBounds(59, 110, 43, 40);
		frame.getContentPane().add(btn8);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn5.setBounds(59, 160, 43, 40);
		frame.getContentPane().add(btn5);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn2.setBounds(59, 210, 43, 40);
		frame.getContentPane().add(btn2);
		
		JButton btndot = new JButton(".");
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String number = textField.getText()+btndot.getText();
			textField.setText(number);
			}
		});
		btndot.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btndot.setBounds(59, 260, 43, 40);
		frame.getContentPane().add(btndot);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn9.setBounds(108, 110, 43, 40);
		frame.getContentPane().add(btn9);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn6.setBounds(108, 160, 43, 40);
		frame.getContentPane().add(btn6);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btn3.setBounds(108, 210, 43, 40);
		frame.getContentPane().add(btn3);
		
		JButton btnequals_2511531005 = new JButton("=");
		btnequals_2511531005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation == "+") {
				result=first+second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}
				else if(operation == "-")
				{
				result=first-second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}
				else if(operation == "*")
				{
				result=first*second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}
				else if(operation == "/")
				{
				result=first/second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}
				else if(operation == "%")
				{
				result=first%second;
				answer=String.format("%.2f", result);
				textField.setText(answer);
				}
			}
		});
		btnequals_2511531005.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnequals_2511531005.setBounds(108, 260, 43, 40);
		frame.getContentPane().add(btnequals_2511531005);
		
		JButton btnsub_2511531005 = new JButton("-");
		btnsub_2511531005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub_2511531005.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnsub_2511531005.setBounds(157, 110, 43, 40);
		frame.getContentPane().add(btnsub_2511531005);
		
		JButton btnmul_2511531005 = new JButton("*");
		btnmul_2511531005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul_2511531005.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnmul_2511531005.setBounds(157, 160, 43, 40);
		frame.getContentPane().add(btnmul_2511531005);
		
		JButton btndiv_2511531005 = new JButton("/");
		btndiv_2511531005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {first=Double.parseDouble(textField.getText());
			textField.setText("");
			operation="/";
			}
		});
		btndiv_2511531005.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btndiv_2511531005.setBounds(157, 210, 43, 40);
		frame.getContentPane().add(btndiv_2511531005);
		
		JButton btnmod_2511531005 = new JButton("%");
		btnmod_2511531005.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnmod_2511531005.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnmod_2511531005.setBounds(157, 260, 48, 40);
		frame.getContentPane().add(btnmod_2511531005);
	}
}
