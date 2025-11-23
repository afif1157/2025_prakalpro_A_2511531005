package pekan8_2511531005;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;	

public class tugasAlproPekan8_2511531005 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texbil1;
	private JTextField texbil2;
	private JTextField texhasil;

	/**
	 * Launch the application.
	 */
	private void pesanperingatan(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesaneror(String pesan) {
		JOptionPane.showConfirmDialog(this, pesan, "kesalahan", JOptionPane.ERROR_MESSAGE);
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tugasAlproPekan8_2511531005 frame = new tugasAlproPekan8_2511531005();
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
	public tugasAlproPekan8_2511531005() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("OPERATOR ASSIGNMENT");
		lblNewLabel.setBounds(172, 10, 124, 26);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BIl 1");
		lblNewLabel_1.setBounds(38, 42, 44, 12);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("BIl 2");
		lblNewLabel_1_1.setBounds(38, 64, 44, 12);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Proses");
		lblNewLabel_1_2.setBounds(38, 89, 44, 12);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Hasil");
		lblNewLabel_1_3.setBounds(38, 111, 44, 12);
		contentPane.add(lblNewLabel_1_3);
		
		texbil1 = new JTextField();
		texbil1.setBounds(95, 39, 96, 18);
		contentPane.add(texbil1);
		texbil1.setColumns(10);
		
		texbil2 = new JTextField();
		texbil2.setColumns(10);
		texbil2.setBounds(95, 61, 96, 18);
		contentPane.add(texbil2);
		
		texhasil = new JTextField();
		texhasil.setEditable(false);
		texhasil.setColumns(10);
		texhasil.setBounds(95, 108, 96, 18);
		contentPane.add(texhasil);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"+=", "-=", "*=", "/=", "%="}));
		comboBox.setBounds(92, 85, 49, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Proses");
		btnNewButton.setBounds(193, 85, 84, 20);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if (texbil1.getText().trim().isEmpty()) {
					pesanperingatan("silahkan masukkan bilangan 1");
				}
				else if(texbil2.getText().trim().isEmpty()) {
					pesanperingatan("silahkan masukkan bilangan 2");
				}
				else {
					try {
						
						int a = Integer.parseInt(texbil1.getText());
						int b = Integer.parseInt(texbil2.getText());
						int c = comboBox.getSelectedIndex();
						if (c==0) {
							a+=b;
						}
						if(c==1) {
							a-=b; 
						}
						if(c==2) {
							a*=b;
						}
						if(c==3) {
							a/=b;
						}
						if(c==4) {
							a%=b;
						}
						hasil =a;
					}
					catch (NumberFormatException ex) {
						pesaneror("bilangan 1 dan billangan  2 harus angka");
				}
			}
				texhasil.setText(String.valueOf(hasil)); 
			}
			
		});
		
	}	

}
