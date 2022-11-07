package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;

public class UserHomePage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserHomePage window = new UserHomePage();
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
	public UserHomePage() {
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
		
		JButton btnViewBalance = new JButton("View Balance");
		btnViewBalance.setBounds(138, 43, 169, 33);
		frame.getContentPane().add(btnViewBalance);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setBounds(138, 105, 169, 33);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setBounds(138, 162, 169, 33);
		frame.getContentPane().add(btnWithdraw);
	}

}
