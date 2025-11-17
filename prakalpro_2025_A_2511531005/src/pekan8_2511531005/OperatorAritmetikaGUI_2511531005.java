package pekan8_2511531005;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmetikaGUI_2511531005 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textbil1;
	private JTextField textbil2;
	private JTextField txthasil;
	
	private void pesanperingatan(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesaneror(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "kesalahan", JOptionPane.ERROR_MESSAGE);
	}
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmetikaGUI_2511531005 frame = new OperatorAritmetikaGUI_2511531005();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmetikaGUI_2511531005() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBilangan = new JLabel("Bilangan 1");
		lblBilangan.setBounds(21, 45, 87, 13);
		contentPane.add(lblBilangan);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ARITMETIKA");
		lblNewLabel.setBounds(182, 10, 121, 13);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		contentPane.add(lblNewLabel);
		
		JLabel lblBilangan_4 = new JLabel("Bilangan 2");
		lblBilangan_4.setBounds(21, 68, 87, 13);
		contentPane.add(lblBilangan_4);
		
		JLabel lblOpereator = new JLabel("Opereator");
		lblOpereator.setBounds(21, 107, 87, 13);
		contentPane.add(lblOpereator);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setBounds(21, 130, 87, 13);
		contentPane.add(lblHasil);
		
		textbil1 = new JTextField();
		textbil1.setHorizontalAlignment(SwingConstants.CENTER);
		textbil1.setBounds(92, 42, 96, 18);
		contentPane.add(textbil1);
		textbil1.setColumns(10);
		
		textbil2 = new JTextField();
		textbil2.setHorizontalAlignment(SwingConstants.CENTER);
		textbil2.setColumns(10);
		textbil2.setBounds(92, 68, 96, 18);
		contentPane.add(textbil2);
		
		JComboBox cboperator = new JComboBox();
		cboperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cboperator.setBounds(92, 103, 96, 20);
		contentPane.add(cboperator);
		
		txthasil = new JTextField();
		txthasil.setHorizontalAlignment(SwingConstants.CENTER);
		txthasil.setEditable(false);
		txthasil.setColumns(10);
		txthasil.setBounds(92, 130, 96, 18);
		contentPane.add(txthasil);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setBounds(198, 103, 105, 20);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
			
			int Hasil;
			
			public void actionPerformed(ActionEvent e) {
				if (textbil1.getText().trim().isEmpty()) {
					pesanperingatan("silahkan masukkan bilangan 1");
				}
				else if(textbil2.getText().trim().isEmpty()) {
					pesanperingatan("silahkan masukkan bilangan 2");
				}
				else {
					try {
						int a =Integer.parseInt(textbil1.getText());
						int b =Integer.parseInt(textbil2.getText());
						int c = cboperator.getSelectedIndex();
						if (c==0) {
							Hasil=a+b;
						}
						if (c==1) {
							Hasil=a-b;
						}
						if (c==2) {
							Hasil=a*b;
						}
						if ( c==3) {
							Hasil=a/b;
						}
						if (c==4) {
							Hasil=a%b;
						}
					}  
					catch (NumberFormatException ex) {
						pesaneror("bilangan 1 dan billangan  2 harus angka");
					}
	
				}
				txthasil.setText(String.valueOf(Hasil));
			}
		});
	}
}
