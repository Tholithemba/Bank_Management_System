package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Label;

import java.awt.Font;
import java.awt.TextField;

public class Deposit {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Deposit window = new Deposit();
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
	public Deposit() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 0, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnDeposit = new JButton("Cancel");
		btnDeposit.setForeground(Color.WHITE);
		btnDeposit.setBackground(new Color(255, 0, 0));
		btnDeposit.setBounds(40, 178, 169, 33);
		frame.getContentPane().add(btnDeposit);
		
		Label label = new Label("Amount");
		label.setFont(new Font("Dialog", Font.PLAIN, 20));
		label.setForeground(Color.WHITE);
		label.setBounds(174, 91, 99, 30);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Available Balance");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setBounds(87, 42, 186, 30);
		frame.getContentPane().add(label_1);
		
		TextField textField = new TextField();
		textField.setBounds(150, 127, 148, 33);
		frame.getContentPane().add(textField);
		
		Label label_2 = new Label("customer fullname");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2.setBounds(10, 0, 148, 23);
		frame.getContentPane().add(label_2);
		
		Label label_2_1 = new Label("Account No.");
		label_2_1.setForeground(Color.WHITE);
		label_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_1.setBounds(247, 0, 92, 23);
		frame.getContentPane().add(label_2_1);
		
		Label label_2_2 = new Label("123345678");
		label_2_2.setForeground(Color.WHITE);
		label_2_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_2.setBounds(339, 0, 91, 23);
		frame.getContentPane().add(label_2_2);
		
		Label label_1_1 = new Label("0.00");
		label_1_1.setForeground(Color.WHITE);
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1_1.setBounds(279, 42, 87, 30);
		frame.getContentPane().add(label_1_1);
		
		Label label_2_3 = new Label("07 November 2022");
		label_2_3.setForeground(Color.WHITE);
		label_2_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_3.setBounds(10, 241, 148, 23);
		frame.getContentPane().add(label_2_3);
		
		JButton btnDeposit_1 = new JButton("Deposit");
		btnDeposit_1.setBackground(new Color(0, 255, 0));
		btnDeposit_1.setForeground(Color.WHITE);
		btnDeposit_1.setBounds(243, 178, 169, 33);
		frame.getContentPane().add(btnDeposit_1);
	}
}
