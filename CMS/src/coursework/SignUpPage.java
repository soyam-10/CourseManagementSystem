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

public class SignUpPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputPhone;
	private JTextField inputEmail;
	private JTextField inputUsername;
	private JPasswordField passwordField;

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
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.setBounds(0, 0, 1066, 94);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel headerLabel = new JLabel("Sign Up");
		headerLabel.setForeground(Color.DARK_GRAY);
		headerLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerLabel.setBounds(357, 10, 305, 54);
		headerPanel.add(headerLabel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(0, 97, 1066, 586);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		JLabel userModeIcon = new JLabel("");
		userModeIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\mode-portrait.png"));
		userModeIcon.setBounds(399, 355, 32, 32);
		mainPanel.add(userModeIcon);
		
		
		Choice userMode = new Choice();
		userMode.add("Student");
		userMode.add("Instructor");
		userMode.add("Admin");
		userMode.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
			}
		});
		userMode.setForeground(Color.DARK_GRAY);
		userMode.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userMode.setBounds(437, 357, 199, 30);
		mainPanel.add(userMode);
		
		inputPhone = new JTextField();
		inputPhone.setColumns(10);
		inputPhone.setBounds(415, 201, 242, 32);
		mainPanel.add(inputPhone);
		
		JLabel phoneIcon = new JLabel("");
		phoneIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\circle-phone-flip.png"));
		phoneIcon.setBounds(373, 198, 32, 32);
		mainPanel.add(phoneIcon);
		
		JLabel emailIcon = new JLabel("");
		emailIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\envelope.png"));
		emailIcon.setBounds(373, 116, 32, 32);
		mainPanel.add(emailIcon);
		
		inputEmail = new JTextField();
		inputEmail.setColumns(10);
		inputEmail.setBounds(415, 119, 242, 32);
		mainPanel.add(inputEmail);
		
		inputUsername = new JTextField();
		inputUsername.setColumns(10);
		inputUsername.setBounds(415, 36, 242, 32);
		mainPanel.add(inputUsername);
		
		JLabel userIcon = new JLabel("");
		userIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\user.png"));
		userIcon.setBounds(373, 33, 32, 32);
		mainPanel.add(userIcon);
		
		JLabel usernameLabel = new JLabel("Enter username");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		usernameLabel.setBounds(415, 10, 192, 25);
		mainPanel.add(usernameLabel);
		
		JLabel emailLabel = new JLabel("Enter email");
		emailLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		emailLabel.setBounds(415, 93, 192, 25);
		mainPanel.add(emailLabel);
		
		JLabel phoneLabel = new JLabel("Enter phone number");
		phoneLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		phoneLabel.setBounds(415, 175, 192, 25);
		mainPanel.add(phoneLabel);
		
		JLabel userModeLabel = new JLabel("select user mode");
		userModeLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		userModeLabel.setBounds(444, 326, 192, 25);
		mainPanel.add(userModeLabel);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.setFont(new Font("Tahoma", Font.BOLD, 25));
		signUpBtn.setBounds(373, 410, 308, 36);
		mainPanel.add(signUpBtn);
		
		JLabel infoLabel = new JLabel("Already a member?");
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		infoLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		infoLabel.setBounds(373, 456, 308, 36);
		mainPanel.add(infoLabel);
		
		JButton logInBtn = new JButton("Log In");
		logInBtn.setFont(new Font("Tahoma", Font.BOLD, 25));
		logInBtn.setBounds(373, 502, 311, 36);
		mainPanel.add(logInBtn);
		
		JLabel phoneIcon_1 = new JLabel("");
		phoneIcon_1.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\src\\Icons\\lock.png"));
		phoneIcon_1.setBounds(373, 284, 32, 32);
		mainPanel.add(phoneIcon_1);
		
		JLabel lblEnterPassword = new JLabel("Enter password");
		lblEnterPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEnterPassword.setBounds(415, 261, 192, 25);
		mainPanel.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(415, 284, 242, 32);
		mainPanel.add(passwordField);
	}
}
