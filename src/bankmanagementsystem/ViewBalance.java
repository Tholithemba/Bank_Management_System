package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;

public class ViewBalance {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBalance window = new ViewBalance();
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
	public ViewBalance() {
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
		
		JButton btnWithdraw_1 = new JButton("Deposit");
		btnWithdraw_1.setForeground(Color.WHITE);
		btnWithdraw_1.setBackground(Color.GREEN);
		btnWithdraw_1.setBounds(117, 65, 169, 33);
		frame.getContentPane().add(btnWithdraw_1);
		
		JButton btnWithdraw = new JButton("Cancel");
		btnWithdraw.setForeground(Color.WHITE);
		btnWithdraw.setBackground(Color.RED);
		btnWithdraw.setBounds(117, 202, 169, 33);
		frame.getContentPane().add(btnWithdraw);
		
		Label label_2_3 = new Label("07 November 2022");
		label_2_3.setBackground(new Color(0, 0, 128));
		label_2_3.setForeground(Color.WHITE);
		label_2_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_3.setBounds(0, 241, 148, 23);
		frame.getContentPane().add(label_2_3);
		
		Label label_1 = new Label("Available Balance");
		label_1.setBackground(new Color(0, 0, 128));
		label_1.setForeground(Color.WHITE);
		label_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1.setBounds(80, 29, 186, 30);
		frame.getContentPane().add(label_1);
		
		Label label_2 = new Label("customer fullname");
		label_2.setBackground(new Color(0, 0, 128));
		label_2.setForeground(Color.WHITE);
		label_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2.setBounds(10, 0, 148, 23);
		frame.getContentPane().add(label_2);
		
		Label label_2_1 = new Label("Account No.");
		label_2_1.setBackground(new Color(0, 0, 128));
		label_2_1.setForeground(Color.WHITE);
		label_2_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_1.setBounds(247, 0, 92, 23);
		frame.getContentPane().add(label_2_1);
		
		Label label_2_2 = new Label("123345678");
		label_2_2.setBackground(new Color(0, 0, 128));
		label_2_2.setForeground(Color.WHITE);
		label_2_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		label_2_2.setBounds(339, 0, 91, 23);
		frame.getContentPane().add(label_2_2);
		
		Label label_1_1 = new Label("0.00");
		label_1_1.setBackground(new Color(0, 0, 128));
		label_1_1.setForeground(Color.WHITE);
		label_1_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		label_1_1.setBounds(272, 29, 87, 30);
		frame.getContentPane().add(label_1_1);
		
		JButton btnWithdraw_1_1 = new JButton("Withdraw");
		btnWithdraw_1_1.setForeground(Color.WHITE);
		btnWithdraw_1_1.setBackground(Color.GREEN);
		btnWithdraw_1_1.setBounds(117, 157, 169, 33);
		frame.getContentPane().add(btnWithdraw_1_1);
		
		JButton btnWithdraw_1_2 = new JButton("Transfer");
		btnWithdraw_1_2.setForeground(Color.WHITE);
		btnWithdraw_1_2.setBackground(Color.GREEN);
		btnWithdraw_1_2.setBounds(117, 110, 169, 33);
		frame.getContentPane().add(btnWithdraw_1_2);
	}
}
