package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.awt.Panel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Registration {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registration window = new Registration();
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
	public Registration() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 706, 359);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(10, 59, 148, 19);
		frame.getContentPane().add(textField);
		
		Label label = new Label(" Fullname");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setBounds(10, 42, 99, 11);
		frame.getContentPane().add(label);
		
		TextField textField_1 = new TextField();
		textField_1.setBounds(10, 114, 148, 19);
		frame.getContentPane().add(textField_1);
		
		Label label_1 = new Label("Lastname");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_1.setBounds(10, 97, 99, 11);
		frame.getContentPane().add(label_1);
		
		TextField textField_2 = new TextField();
		textField_2.setBounds(10, 171, 148, 19);
		frame.getContentPane().add(textField_2);
		
		Label label_2 = new Label("ID NO./Passport");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2.setBounds(10, 154, 99, 11);
		frame.getContentPane().add(label_2);
		
		TextField textField_2_1 = new TextField();
		textField_2_1.setBounds(10, 228, 148, 19);
		frame.getContentPane().add(textField_2_1);
		
		Label label_2_1 = new Label("Mobile number");
		label_2_1.setForeground(Color.WHITE);
		label_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_1.setBounds(10, 211, 118, 11);
		frame.getContentPane().add(label_2_1);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(433, 22, 238, 264);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		TextField textField_3 = new TextField();
		textField_3.setBounds(49, 61, 148, 19);
		panel.add(textField_3);
		
		Label label_3 = new Label("Street");
		label_3.setForeground(Color.WHITE);
		label_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_3.setBounds(49, 44, 99, 11);
		panel.add(label_3);
		
		TextField textField_4 = new TextField();
		textField_4.setBounds(49, 125, 148, 19);
		panel.add(textField_4);
		
		Label label_4 = new Label("City");
		label_4.setForeground(Color.WHITE);
		label_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_4.setBounds(49, 108, 99, 11);
		panel.add(label_4);
		
		TextField textField_5 = new TextField();
		textField_5.setBounds(49, 189, 148, 19);
		panel.add(textField_5);
		
		Label label_5 = new Label("Postal code");
		label_5.setForeground(Color.WHITE);
		label_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_5.setBounds(49, 172, 99, 11);
		panel.add(label_5);
		
		JButton btnWithdraw = new JButton("Cancel");
		btnWithdraw.setForeground(Color.WHITE);
		btnWithdraw.setBackground(Color.RED);
		btnWithdraw.setBounds(47, 278, 169, 33);
		frame.getContentPane().add(btnWithdraw);
		
		JButton btnWithdraw_1 = new JButton("Create Account");
		btnWithdraw_1.setForeground(Color.WHITE);
		btnWithdraw_1.setBackground(Color.GREEN);
		btnWithdraw_1.setBounds(252, 278, 169, 33);
		frame.getContentPane().add(btnWithdraw_1);
		
		TextField textField_6 = new TextField();
		textField_6.setBounds(216, 59, 148, 19);
		frame.getContentPane().add(textField_6);
		
		Label label_6 = new Label("Email Address");
		label_6.setForeground(Color.WHITE);
		label_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_6.setBounds(216, 42, 99, 11);
		frame.getContentPane().add(label_6);
		
		Label label_7 = new Label("Gender");
		label_7.setForeground(Color.WHITE);
		label_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_7.setBounds(216, 97, 99, 11);
		frame.getContentPane().add(label_7);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "Female", "Male"}));
		comboBox.setBounds(216, 109, 148, 24);
		frame.getContentPane().add(comboBox);
	}
}
