package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Login {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField pwdPassword;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 785, 414);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBankManagementSystem = new JLabel("Bank Management System");
		lblBankManagementSystem.setForeground(Color.WHITE);
		lblBankManagementSystem.setBackground(Color.WHITE);
		lblBankManagementSystem.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblBankManagementSystem.setBounds(216, 26, 357, 44);
		frame.getContentPane().add(lblBankManagementSystem);
		
		txtUsername = new JTextField();
		txtUsername.setText("username");
		txtUsername.setBounds(271, 121, 211, 37);
		frame.getContentPane().add(txtUsername);
		txtUsername.setColumns(10);
		
		pwdPassword = new JPasswordField();
		pwdPassword.setText("password");
		pwdPassword.setBounds(271, 200, 211, 37);
		frame.getContentPane().add(pwdPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBackground(new Color(124, 252, 0));
		btnLogin.setForeground(new Color(255, 255, 255));
		btnLogin.setFont(new Font("Dialog", Font.BOLD, 16));
		btnLogin.setBounds(271, 291, 186, 25);
		frame.getContentPane().add(btnLogin);
	}
}
