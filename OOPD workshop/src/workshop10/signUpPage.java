package workshop10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Cursor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class signUpPage extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputEmail;
	private JPasswordField inputPassword;

	/**
	 * Launch the application.
	 */
	static final String DB_URL = "jdbc:mysql://localhost:3307/OOPDw10";
    static final String USERNAME = "root";
    static final String PASSWORD = "SOYAM@mysql@10";
    
	public static void main(String[] args) {
		/**
		 * connecting to database
		 */
		try{
            
            System.out.print("Connecting to database....");
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            Statement stmt = connection.createStatement();
            
            System.out.println();

            
            if(connection!=null) {
                System.out.println("Database connected successfully!");
            }
            
        }catch(SQLException exc) {
            System.out.println("Something went wrong while connecting to the database.");
            System.out.println(exc);
        }

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signUpPage frame = new signUpPage();
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
	

	public signUpPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 930, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel headPanel = new JPanel();
		headPanel.setBackground(new Color(128, 128, 128));
		headPanel.setBounds(10, 10, 906, 77);
		contentPane.add(headPanel);
		headPanel.setLayout(null);
		
		JLabel headLabel = new JLabel("Sign Up");
		headLabel.setForeground(new Color(255, 255, 0));
		headLabel.setHorizontalAlignment(SwingConstants.CENTER);
		headLabel.setFont(new Font("Times New Roman", Font.BOLD, 35));
		headLabel.setBounds(258, 10, 387, 57);
		headPanel.add(headLabel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setBounds(10, 97, 906, 382);
		contentPane.add(mainPanel);
		mainPanel.setLayout(null);
		
		inputEmail = new JTextField();
		inputEmail.setFont(new Font("Dialog", Font.BOLD, 17));
		inputEmail.setBounds(415, 80, 311, 27);
		mainPanel.add(inputEmail);
		inputEmail.setColumns(10);
		
		inputPassword = new JPasswordField();
		inputPassword.setFont(new Font("Dialog", Font.BOLD, 17));
		inputPassword.setBounds(415, 143, 308, 27);
		mainPanel.add(inputPassword);
		
		JLabel emailLabel = new JLabel("Email");
		emailLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		emailLabel.setBounds(257, 80, 118, 27);
		mainPanel.add(emailLabel);
		
		JLabel passwordLabel = new JLabel("Password");
		passwordLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		passwordLabel.setBounds(257, 134, 148, 36);
		mainPanel.add(passwordLabel);
		
		JButton newAccBtn = new JButton("Create Account");
		newAccBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = inputEmail.getText();
                char[] passwordChars = inputPassword.getPassword();
                String password = new String(passwordChars);

                if (createAccount(email, password)) {
                    JOptionPane.showMessageDialog(signUpPage.this, "Account created successfully!");
                } else {
                    JOptionPane.showMessageDialog(signUpPage.this, "Error creating account");
                }

                // Clear fields after account creation
                inputEmail.setText("");
                inputPassword.setText("");
            }
        });
		
		
		
		newAccBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		newAccBtn.setFont(new Font("Tahoma", Font.BOLD, 25));
		newAccBtn.setBounds(308, 284, 311, 36);
		mainPanel.add(newAccBtn);
		
		JButton signInBtn = new JButton("Sign In");
		signInBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = inputEmail.getText();
                char[] passwordChars = inputPassword.getPassword();
                String password = new String(passwordChars);

                if (validateLogin(email, password)) {
                    JOptionPane.showMessageDialog(signUpPage.this, "Logged in successfully!");
                } else {
                    JOptionPane.showMessageDialog(signUpPage.this, "Invalid credentials");
                }

                // Clear fields after attempting login
                inputEmail.setText("");
                inputPassword.setText("");
            }
        });
		signInBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		signInBtn.setFont(new Font("Tahoma", Font.BOLD, 25));
		signInBtn.setBounds(308, 194, 308, 36);
		mainPanel.add(signInBtn);
		
		JLabel newMemberLabel = new JLabel("Not a member?");
		newMemberLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		newMemberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		newMemberLabel.setBounds(308, 238, 308, 36);
		mainPanel.add(newMemberLabel);
	}
	
	private boolean createAccount(String email, String password) {
		try {
			Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
			
			String query = "INSERT INTO Users (email, password) VALUES (?, ?)";
			try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
				preparedStatement.setString(1, email);
				preparedStatement.setString(2, password);
				
				int rowsAffected = preparedStatement.executeUpdate();
				return rowsAffected > 0;
			}
		} catch (SQLException exc) {
			exc.printStackTrace();
			return false;
		}
	}
	private boolean validateLogin(String email, String password) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);

            String query = "SELECT * FROM Users WHERE email=? AND password=?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, password);

                ResultSet resultSet = preparedStatement.executeQuery();
                return resultSet.next(); // If there's a result, credentials are valid
            }
        } catch (SQLException exc) {
            exc.printStackTrace();
            return false;
        }
    }
}
