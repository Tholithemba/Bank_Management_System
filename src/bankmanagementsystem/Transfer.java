package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;

public class Transfer {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Transfer window = new Transfer();
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
	public Transfer() {
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
		
		
		JButton btnWithdraw_1 = new JButton("Transfer");
		btnWithdraw_1.setForeground(Color.WHITE);
		btnWithdraw_1.setBackground(Color.GREEN);
		btnWithdraw_1.setBounds(253, 176, 169, 33);
		frame.getContentPane().add(btnWithdraw_1);
		
		JButton btnWithdraw = new JButton("Cancel");
		btnWithdraw.setForeground(Color.WHITE);
		btnWithdraw.setBackground(Color.RED);
		btnWithdraw.setBounds(51, 176, 169, 33);
		frame.getContentPane().add(btnWithdraw);
		
		Label label_2_3 = new Label("07 November 2022");
		label_2_3.setForeground(Color.WHITE);
		label_2_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_3.setBounds(10, 241, 148, 23);
		frame.getContentPane().add(label_2_3);
		
		Label label_1 = new Label("Available Balance");
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setBounds(92, 39, 186, 30);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("customer fullname");
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2.setBounds(20, 0, 148, 23);
		frame.getContentPane().add(label_2);
		
		Label label_2_1 = new Label("Account No.");
		label_2_1.setForeground(Color.WHITE);
		label_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_1.setBounds(257, 0, 92, 23);
		frame.getContentPane().add(label_2_1);
		
		Label label_2_2 = new Label("123345678");
		label_2_2.setForeground(Color.WHITE);
		label_2_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_2.setBounds(349, 0, 91, 23);
		frame.getContentPane().add(label_2_2);
		
		Label label_1_1 = new Label("0.00");
		label_1_1.setForeground(Color.WHITE);
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1_1.setBounds(284, 39, 87, 30);
		frame.getContentPane().add(label_1_1);
		
		TextField textField = new TextField();
		textField.setBounds(140, 120, 148, 33);
		frame.getContentPane().add(textField);
		
		Label label = new Label("Transfer  Amount");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBounds(140, 84, 148, 30);
		frame.getContentPane().add(label);
		
		JButton btnWithdraw_1_1 = new JButton("R100");
		btnWithdraw_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnWithdraw_1_1.setForeground(Color.WHITE);
		btnWithdraw_1_1.setBackground(Color.GREEN);
		btnWithdraw_1_1.setBounds(10, 71, 81, 23);
		frame.getContentPane().add(btnWithdraw_1_1);
		
		JButton btnWithdraw_1_1_1 = new JButton("R200");
		btnWithdraw_1_1_1.setForeground(Color.WHITE);
		btnWithdraw_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnWithdraw_1_1_1.setBackground(Color.GREEN);
		btnWithdraw_1_1_1.setBounds(10, 106, 81, 23);
		frame.getContentPane().add(btnWithdraw_1_1_1);
		
		JButton btnWithdraw_1_1_2 = new JButton("R300");
		btnWithdraw_1_1_2.setForeground(Color.WHITE);
		btnWithdraw_1_1_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnWithdraw_1_1_2.setBackground(Color.GREEN);
		btnWithdraw_1_1_2.setBounds(10, 141, 81, 23);
		frame.getContentPane().add(btnWithdraw_1_1_2);
		
		JButton btnWithdraw_1_1_2_1 = new JButton("R2000");
		btnWithdraw_1_1_2_1.setForeground(Color.WHITE);
		btnWithdraw_1_1_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnWithdraw_1_1_2_1.setBackground(Color.GREEN);
		btnWithdraw_1_1_2_1.setBounds(349, 141, 81, 23);
		frame.getContentPane().add(btnWithdraw_1_1_2_1);
		
		JButton btnWithdraw_1_1_1_1 = new JButton("R1000");
		btnWithdraw_1_1_1_1.setForeground(Color.WHITE);
		btnWithdraw_1_1_1_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnWithdraw_1_1_1_1.setBackground(Color.GREEN);
		btnWithdraw_1_1_1_1.setBounds(349, 106, 81, 23);
		frame.getContentPane().add(btnWithdraw_1_1_1_1);
		
		JButton btnWithdraw_1_1_3 = new JButton("R500");
		btnWithdraw_1_1_3.setForeground(Color.WHITE);
		btnWithdraw_1_1_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		btnWithdraw_1_1_3.setBackground(Color.GREEN);
		btnWithdraw_1_1_3.setBounds(349, 71, 81, 23);
		frame.getContentPane().add(btnWithdraw_1_1_3);
	}
}
