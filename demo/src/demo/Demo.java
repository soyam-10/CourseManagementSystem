package demo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Demo extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputName;
	private JTextField inputAge;
	JLabel lblStatus;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo frame = new Demo();
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
	public Demo() {
		setTitle("Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 671);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblName.setBounds(95, 180, 76, 47);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAge.setBounds(95, 264, 76, 47);
		contentPane.add(lblAge);
		
		inputName = new JTextField();
		inputName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		inputName.setBounds(181, 188, 175, 39);
		contentPane.add(inputName);
		inputName.setColumns(10);
		
		inputAge = new JTextField();
		inputAge.setColumns(10);
		inputAge.setBounds(181, 272, 175, 39);
		contentPane.add(inputAge);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = inputName.getText();
				int age = Integer.parseInt(inputAge.getText());
				if(age>=18) {
					lblStatus.setText(name +",you are Eligible to Vote");
				}
				else {
					lblStatus.setText(name +",you are Not eligible to Vote");
				}
			}
		});
		btnSubmit.setForeground(new Color(0, 0, 0));
		btnSubmit.setBackground(new Color(0, 128, 64));
		btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSubmit.setBounds(154, 352, 175, 39);
		contentPane.add(btnSubmit);
		
		lblStatus = new JLabel("");
		lblStatus.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblStatus.setBounds(95, 460, 365, 105);
		contentPane.add(lblStatus);
	}
}
