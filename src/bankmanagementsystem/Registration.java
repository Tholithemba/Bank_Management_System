package bankmanagementsystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;

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
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setBounds(10, 99, 148, 19);
		frame.getContentPane().add(textField);
		
		Label label = new Label(" Amount");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Dialog", Font.PLAIN, 14));
		label.setBounds(10, 82, 99, 11);
		frame.getContentPane().add(label);
	}

}
