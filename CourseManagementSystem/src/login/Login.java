package login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import java.awt.Cursor;
import java.awt.Rectangle;

public class Login {

	private JFrame frame;
	private JTextField inputEmail;
	private JPasswordField passwordField;

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
		frame.setBounds(100, 100, 1058, 704);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 1024, 647);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel headPanel = new JPanel();
		headPanel.setForeground(new Color(126, 126, 126));
		headPanel.setBackground(new Color(165, 202, 100));
		headPanel.setBounds(10, 10, 1004, 109);
		panel.add(headPanel);
		headPanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Herald College Kathmandu");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 48));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 10, 984, 89);
		headPanel.add(lblNewLabel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBackground(new Color(165, 202, 100));
		mainPanel.setBounds(10, 129, 1004, 518);
		panel.add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel emailLabel = new JLabel("Email ");
		emailLabel.setFont(new Font("Times New Roman", Font.BOLD, 30));
		emailLabel.setForeground(new Color(255, 255, 255));
		emailLabel.setBounds(283, 99, 86, 44);
		mainPanel.add(emailLabel);
		
		inputEmail = new JTextField();
		inputEmail.setToolTipText("");
		inputEmail.setFont(new Font("Times New Roman", Font.BOLD, 23));
		inputEmail.setBounds(414, 99, 255, 44);
		mainPanel.add(inputEmail);
		inputEmail.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(414, 191, 255, 44);
		mainPanel.add(passwordField);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblNewLabel_1.setBounds(283, 191, 131, 44);
		mainPanel.add(lblNewLabel_1);
		
		JButton logInBtn = new JButton("Log In");
		logInBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logInBtn.setBackground(new Color(132, 193, 108));
		logInBtn.setForeground(new Color(0, 0, 0));
		logInBtn.setFont(new Font("Times New Roman", Font.BOLD, 25));
		logInBtn.setBounds(361, 271, 180, 39);
		mainPanel.add(logInBtn);
		
		JLabel lblNewLabel_2 = new JLabel("Log in to your account");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel_2.setBounds(273, 50, 313, 39);
		mainPanel.add(lblNewLabel_2);
	}
}
