package tutorial10;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Tutorial10 {

	private JFrame frame;
	private JPanel panel;
	private JLabel num1Label;
	private JLabel num2Label;
	private JTextField num1Input;
	private JTextField num2Input;
	JLabel resultLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tutorial10 window = new Tutorial10();
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
	public Tutorial10() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 622, 551);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(Color.LIGHT_GRAY);
		headerPanel.setBounds(60, 10, 490, 60);
		frame.getContentPane().add(headerPanel);
		
		JLabel headerText = new JLabel("Calculator by Soyam");
		headerText.setForeground(new Color(153, 255, 0));
		headerText.setFont(new Font("Tahoma", Font.BOLD, 35));
		headerPanel.add(headerText);
		
		panel = new JPanel();
		panel.setBounds(60, 98, 490, 271);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		num1Label = new JLabel("First number");
		num1Label.setBounds(10, 26, 142, 25);
		num1Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		panel.add(num1Label);
		
		num2Label = new JLabel("Second number");
		num2Label.setFont(new Font("Tahoma", Font.BOLD, 20));
		num2Label.setBounds(308, 26, 172, 25);
		panel.add(num2Label);
		
		num1Input = new JTextField();
		num1Input.setFont(new Font("Tahoma", Font.BOLD, 19));
		num1Input.setBounds(20, 61, 132, 37);
		panel.add(num1Input);
		num1Input.setColumns(10);
		
		num2Input = new JTextField();
		num2Input.setFont(new Font("Tahoma", Font.BOLD, 19));
		num2Input.setColumns(10);
		num2Input.setBounds(318, 61, 132, 37);
		panel.add(num2Input);
		
		JButton sumBtn = new JButton("+");
		sumBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(num1Input.getText());
				int num2 = Integer.parseInt(num2Input.getText());
				int sum = num1+num2;
				resultLabel.setText("Result: "+sum);
			}
		});
		sumBtn.setBackground(new Color(153, 204, 153));
		sumBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		sumBtn.setBounds(66, 120, 70, 37);
		panel.add(sumBtn);
		
		JButton differenceBtn = new JButton("-");
		differenceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(num1Input.getText());
				int num2 = Integer.parseInt(num2Input.getText());
				int difference = num1-num2;
				resultLabel.setText("Result: "+difference);
			}
		});
		differenceBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		differenceBtn.setBackground(new Color(153, 204, 153));
		differenceBtn.setBounds(155, 120, 70, 37);
		panel.add(differenceBtn);
		
		JButton productBtn = new JButton("*");
		productBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num1 = Integer.parseInt(num1Input.getText());
				int num2 = Integer.parseInt(num2Input.getText());
				int product = num1*num2;
				resultLabel.setText("Result: "+product);
			}
		});
		productBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		productBtn.setBackground(new Color(153, 204, 153));
		productBtn.setBounds(235, 120, 70, 37);
		panel.add(productBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1 = Integer.parseInt(num1Input.getText());
				float num2 = Integer.parseInt(num2Input.getText());
				float division = num1/num2;
				resultLabel.setText("Result: "+division);
			}
		});
		divideBtn.setFont(new Font("Tahoma", Font.BOLD, 20));
		divideBtn.setBackground(new Color(153, 204, 153));
		divideBtn.setBounds(317, 120, 70, 37);
		panel.add(divideBtn);
		
		resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		resultLabel.setBounds(179, 200, 172, 47);
		panel.add(resultLabel);
	}
}
