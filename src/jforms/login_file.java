package jforms;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JSeparator;
import javax.swing.JTree;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class login_file extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_file frame = new login_file();
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
	public login_file()throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLUE);
		panel.setBounds(10, 11, 414, 119);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblFacebook = new JLabel("FACEBOOK");
		lblFacebook.setForeground(Color.WHITE);
		lblFacebook.setBackground(Color.WHITE);
		lblFacebook.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblFacebook.setBounds(10, 27, 110, 20);
		panel.add(lblFacebook);
		
		JLabel lblNewLabel_1 = new JLabel("User name:");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(161, 11, 89, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setBounds(161, 47, 89, 14);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(264, 8, 140, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(262, 44, 142, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogIn = new JButton("Log In");
		btnLogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String name = textField.getText();
				String pwd = textField_1.getText();
				database obj = new database();
				try {
					obj.login(name, pwd);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnLogIn.setBounds(260, 84, 89, 23);
		panel.add(btnLogIn);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(10, 152, 65, 14);
		contentPane.add(lblUsername);
		
		JLabel lblDateOfBirth = new JLabel("Date of birth:");
		lblDateOfBirth.setBounds(10, 177, 77, 14);
		contentPane.add(lblDateOfBirth);
		
		JLabel lblNewLabel = new JLabel("Gender:");
		lblNewLabel.setBounds(10, 202, 58, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(161, 130, 46, 14);
		contentPane.add(label);
		
		textField_2 = new JTextField();
		textField_2.setBounds(97, 149, 135, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(97, 171, 135, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(10, 202, 46, 14);
		contentPane.add(label_1);
		
		JLabel lblPassword_1 = new JLabel("Password:");
		lblPassword_1.setBounds(237, 152, 55, 14);
		contentPane.add(lblPassword_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(301, 149, 123, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JRadioButton rdbtnMale = new JRadioButton("male");
		rdbtnMale.setBounds(91, 198, 58, 23);
		contentPane.add(rdbtnMale);
		
		JRadioButton rdbtnFemale = new JRadioButton("female");
		rdbtnFemale.setBounds(149, 198, 77, 23);
		contentPane.add(rdbtnFemale);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBounds(10, 227, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblByClickingSign = new JLabel("By clicking sign up, you can now use the facebook website!");
		lblByClickingSign.setBounds(109, 231, 315, 19);
		contentPane.add(lblByClickingSign);
	}
}
