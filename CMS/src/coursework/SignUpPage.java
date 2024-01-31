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
	private JTextField inputUsername;
	private JTextField inputEmail;
	private JPasswordField inputPassword;
	private JPasswordField inputConfirmPassword;
	private JLabel leftIcon;

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
		panel_1.setBounds(420, 96, 648, 593);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel userModeIcon = new JLabel("");
		userModeIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\mode-portrait.png"));
		userModeIcon.setBounds(72, 76, 32, 32);
		panel_1.add(userModeIcon);
		
		JComboBox inputUserMode = new JComboBox();
		inputUserMode.setForeground(new Color(28, 157, 13));
		inputUserMode.setModel(new DefaultComboBoxModel(new String[] {"Student", "Instructor", "Admin"}));
		inputUserMode.setToolTipText("Select User Mode");
		inputUserMode.setMaximumRowCount(3);
		inputUserMode.setFont(new Font("Garamond", Font.PLAIN, 24));
		inputUserMode.setBounds(121, 79, 178, 29);
		panel_1.add(inputUserMode);
		
		JLabel userModeLabel = new JLabel("select user mode");
		userModeLabel.setForeground(new Color(28, 157, 13));
		userModeLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		userModeLabel.setBounds(117, 47, 192, 25);
		panel_1.add(userModeLabel);
		
		JLabel usernameLabel = new JLabel("Username");
		usernameLabel.setForeground(new Color(28, 157, 13));
		usernameLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		usernameLabel.setBounds(114, 118, 192, 25);
		panel_1.add(usernameLabel);
		
		inputUsername = new JTextField();
		inputUsername.setForeground(new Color(28, 157, 13));
		inputUsername.setFont(new Font("Garamond", Font.PLAIN, 24));
		inputUsername.setColumns(10);
		inputUsername.setBounds(114, 144, 437, 32);
		panel_1.add(inputUsername);
		
		JLabel userIcon = new JLabel("");
		userIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\user.png"));
		userIcon.setBounds(72, 141, 32, 32);
		panel_1.add(userIcon);
		
		JLabel emailIcon = new JLabel("");
		emailIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\envelope.png"));
		emailIcon.setBounds(72, 209, 32, 32);
		panel_1.add(emailIcon);
		
		inputEmail = new JTextField();
		inputEmail.setForeground(new Color(28, 157, 13));
		inputEmail.setFont(new Font("Garamond", Font.PLAIN, 24));
		inputEmail.setColumns(10);
		inputEmail.setBounds(114, 212, 437, 32);
		panel_1.add(inputEmail);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setForeground(new Color(28, 157, 13));
		emailLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		emailLabel.setBounds(114, 186, 192, 25);
		panel_1.add(emailLabel);
		
		JLabel lblEnterPassword = new JLabel("Password");
		lblEnterPassword.setForeground(new Color(28, 157, 13));
		lblEnterPassword.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblEnterPassword.setBounds(114, 258, 192, 25);
		panel_1.add(lblEnterPassword);
		
		inputPassword = new JPasswordField();
		inputPassword.setForeground(new Color(28, 157, 13));
		inputPassword.setFont(new Font("Garamond", Font.PLAIN, 24));
		inputPassword.setBounds(114, 281, 437, 32);
		panel_1.add(inputPassword);
		
		JLabel phoneIcon_1 = new JLabel("");
		phoneIcon_1.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\lock.png"));
		phoneIcon_1.setBounds(72, 281, 32, 32);
		panel_1.add(phoneIcon_1);
		
		JLabel phoneIcon_1_1 = new JLabel("");
		phoneIcon_1_1.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\lock.png"));
		phoneIcon_1_1.setBounds(72, 346, 32, 32);
		panel_1.add(phoneIcon_1_1);
		
		JLabel lblConfirmPassword = new JLabel("Confirm password");
		lblConfirmPassword.setForeground(new Color(28, 157, 13));
		lblConfirmPassword.setFont(new Font("Garamond", Font.PLAIN, 24));
		lblConfirmPassword.setBounds(114, 323, 192, 25);
		panel_1.add(lblConfirmPassword);
		
		inputConfirmPassword = new JPasswordField();
		inputConfirmPassword.setForeground(new Color(28, 157, 13));
		inputConfirmPassword.setFont(new Font("Garamond", Font.PLAIN, 24));
		inputConfirmPassword.setBounds(114, 346, 437, 32);
		panel_1.add(inputConfirmPassword);
		
		JButton signUpBtn = new JButton("Sign Up");
		signUpBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		signUpBtn.setForeground(Color.WHITE);
		signUpBtn.setFont(new Font("Garamond", Font.BOLD, 26));
		signUpBtn.setBackground(new Color(134, 85, 236));
		signUpBtn.setBounds(254, 397, 155, 36);
		panel_1.add(signUpBtn);
		
		JLabel infoLabel = new JLabel("Already a member?");
		infoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		infoLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		infoLabel.setBounds(237, 443, 192, 36);
		panel_1.add(infoLabel);
		
		JButton logInBtn = new JButton("Log In");
		logInBtn.setForeground(Color.WHITE);
		logInBtn.setFont(new Font("Garamond", Font.BOLD, 26));
		logInBtn.setBackground(new Color(134, 85, 236));
		logInBtn.setBounds(254, 481, 155, 36);
		panel_1.add(logInBtn);
		
		JComboBox inputCourse = new JComboBox();
		inputCourse.setForeground(new Color(28, 157, 13));
		inputCourse.setModel(new DefaultComboBoxModel(new String[] {"BCS hons", "BMBA", "IBM"}));
		inputCourse.setToolTipText("Select User Mode");
		inputCourse.setMaximumRowCount(3);
		inputCourse.setFont(new Font("Garamond", Font.PLAIN, 24));
		inputCourse.setBounds(370, 79, 178, 29);
		panel_1.add(inputCourse);
		
		JLabel userModeIcon_1 = new JLabel("");
		userModeIcon_1.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\e-learning.png"));
		userModeIcon_1.setBounds(321, 76, 32, 32);
		panel_1.add(userModeIcon_1);
		
		JLabel courseLabel = new JLabel("select course");
		courseLabel.setForeground(new Color(28, 157, 13));
		courseLabel.setFont(new Font("Garamond", Font.PLAIN, 24));
		courseLabel.setBounds(366, 47, 192, 25);
		panel_1.add(courseLabel);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(255, 255, 255));
		headerPanel.setBounds(0, 0, 1066, 94);
		contentPane.add(headerPanel);
		headerPanel.setLayout(null);
		
		JLabel headerLabel = new JLabel("Sign Up");
		headerLabel.setForeground(Color.DARK_GRAY);
		headerLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		headerLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headerLabel.setBounds(386, 30, 173, 43);
		headerPanel.add(headerLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 96, 419, 593);
		contentPane.add(panel);
		panel.setLayout(null);
		
		leftIcon = new JLabel("");
		leftIcon.setIcon(new ImageIcon("C:\\Users\\Acer\\eclipse-workspace\\CMS\\icons\\CMS.jpg"));
		leftIcon.setBounds(0, 0, 419, 593);
		panel.add(leftIcon);
	}
}
