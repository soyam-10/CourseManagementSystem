package coursework;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.Choice;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;

public class SignUpPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUpPage frame = new SignUpPage();
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
	public SignUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1080, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 96, 1068, 593);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel userModeIcon = new JLabel("");
		userModeIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\mode-portrait.png"));
		userModeIcon.setBounds(385, 39, 32, 32);
		panel_1.add(userModeIcon);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Student", "Instructor", "Admin"}));
		comboBox.setToolTipText("Select User Mode");
		comboBox.setMaximumRowCount(3);
		comboBox.setFont(new Font("Garamond", Font.PLAIN, 24));
		comboBox.setBounds(434, 42, 178, 29);
		panel_1.add(comboBox);
		
		JLabel userModeLabel = new JLabel("select user mode");
		userModeLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		userModeLabel.setBounds(430, 10, 192, 25);
		panel_1.add(userModeLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		usernameLabel.setBounds(185, 110, 192, 25);
		panel_1.add(usernameLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Garamond", Font.PLAIN, 24));
		textField.setColumns(10);
		textField.setBounds(185, 136, 437, 32);
		panel_1.add(textField);
		
		JLabel userIcon = new JLabel("");
		userIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\user.png"));
		userIcon.setBounds(143, 133, 32, 32);
		panel_1.add(userIcon);
		
		JLabel emailIcon = new JLabel("");
		emailIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\envelope.png"));
		emailIcon.setBounds(143, 201, 32, 32);
		panel_1.add(emailIcon);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Garamond", Font.PLAIN, 24));
		textField_1.setColumns(10);
		textField_1.setBounds(185, 204, 437, 32);
		panel_1.add(textField_1);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		emailLabel.setBounds(185, 178, 192, 25);
		panel_1.add(emailLabel);
		
		JLabel lblEnterPassword = new JLabel("Password");
		lblEnterPassword.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblEnterPassword.setBounds(185, 250, 192, 25);
		panel_1.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Garamond", Font.PLAIN, 24));
		passwordField.setBounds(185, 273, 437, 32);
		panel_1.add(passwordField);
		
		JLabel phoneIcon_1 = new JLabel("");
		phoneIcon_1.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\lock.png"));
		phoneIcon_1.setBounds(143, 273, 32, 32);
		panel_1.add(phoneIcon_1);
		
		JLabel phoneIcon_1_1 = new JLabel("");
		phoneIcon_1_1.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\lock.png"));
		phoneIcon_1_1.setBounds(143, 338, 32, 32);
		panel_1.add(phoneIcon_1_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblConfirmPassword.setBounds(185, 315, 192, 25);
		panel_1.add(lblConfirmPassword);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setFont(new Font("Garamond", Font.PLAIN, 24));
		passwordField_1.setBounds(185, 338, 437, 32);
		panel_1.add(passwordField_1);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.setForeground(Color.WHITE);
		signUpBtn.setFont(new Font("Garamond", Font.BOLD, 26));
		signUpBtn.setBackground(new Color(134, 85, 236));
		signUpBtn.setBounds(385, 437, 308, 36);
		panel_1.add(signUpBtn);
		
		JLabel infoLabel = new JLabel("Already a member?");
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		infoLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		infoLabel.setBounds(385, 483, 308, 36);
		panel_1.add(infoLabel);
		
		JButton logInBtn = new JButton("Log In");
		logInBtn.setForeground(Color.WHITE);
		logInBtn.setFont(new Font("Garamond", Font.BOLD, 26));
		logInBtn.setBackground(new Color(134, 85, 236));
		logInBtn.setBounds(385, 529, 311, 36);
		panel_1.add(logInBtn);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(255, 255, 255));
		headerPanel.setBounds(0, 0, 1066, 94);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel headerLabel = new JLabel("Sign Up");
		headerLabel.setForeground(Color.DARK_GRAY);
		headerLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerLabel.setBounds(352, 30, 305, 43);
		headerPanel.add(headerLabel);
	}
}
