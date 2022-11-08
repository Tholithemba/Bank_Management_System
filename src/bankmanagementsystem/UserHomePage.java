package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
		btnViewBalance.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				//ViewBalance new =  ViewBalance();
			}
		});
		btnViewBalance.setFont(new Font("Dialog", Font.BOLD, 20));
		btnViewBalance.setForeground(Color.WHITE);
		btnViewBalance.setBackground(Color.GREEN);
		btnViewBalance.setBounds(122, 41, 198, 33);
		frame.getContentPane().add(btnViewBalance);
		
		JButton btnDeposit = new JButton("Deposit");
		btnDeposit.setFont(new Font("Dialog", Font.BOLD, 20));
		btnDeposit.setForeground(Color.WHITE);
		btnDeposit.setBackground(Color.GREEN);
		btnDeposit.setBounds(122, 86, 198, 33);
		frame.getContentPane().add(btnDeposit);
		
		JButton btnWithdraw = new JButton("Withdraw");
		btnWithdraw.setFont(new Font("Dialog", Font.BOLD, 20));
		btnWithdraw.setForeground(Color.WHITE);
		btnWithdraw.setBackground(Color.GREEN);
		btnWithdraw.setBounds(122, 176, 198, 33);
		frame.getContentPane().add(btnWithdraw);
		
		JButton btnTransfer = new JButton("Transfer");
		btnTransfer.setForeground(Color.WHITE);
		btnTransfer.setFont(new Font("Dialog", Font.BOLD, 20));
		btnTransfer.setBackground(Color.GREEN);
		btnTransfer.setBounds(122, 131, 198, 33);
		frame.getContentPane().add(btnTransfer);
	}

}
