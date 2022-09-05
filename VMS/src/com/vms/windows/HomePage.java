package com.vms.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.MatteBorder;

public class HomePage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
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
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 800, 600);
		contentPane = new JPanel();
		setUndecorated(true);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\Downloads\\orgtp (1).jpg"));
		lblNewLabel_5.setBounds(404, 85, 201, 162);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4_1 = new JLabel("Already have Account ? login");
		lblNewLabel_4_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4_1.setBounds(428, 286, 173, 40);
		contentPane.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4 = new JLabel("New User ? Register Here");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_4.setBounds(428, 381, 173, 40);
		contentPane.add(lblNewLabel_4);
		
		JButton btnRegister = new JButton("REGISTER PAGE");
		btnRegister.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		btnRegister.setBorderPainted(false);
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RegistrationPage rp = new RegistrationPage();
				rp.setVisible(true);;
				setVisible(false);
			}
		});
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnRegister.setBackground(new Color(102, 205, 170));
		btnRegister.setBounds(428, 421, 177, 40);
		contentPane.add(btnRegister);
		
		JButton btnNewButton = new JButton("LOGIN PAGE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginPage lp = new LoginPage();
				lp.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBackground(new Color(102, 205, 170));
		btnNewButton.setBounds(428, 325, 177, 40);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\Downloads\\download (1).png"));
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(304, 56, 420, 490);
		contentPane.add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBounds(77, 56, 227, 490);
		panel.setBackground(new Color(0, 255, 127));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_7 = new JLabel("Vaccinate For A Covid Free World !");
		lblNewLabel_7.setFont(new Font("Tw Cen MT Condensed", Font.BOLD, 17));
		lblNewLabel_7.setBounds(10, 36, 207, 33);
		panel.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6 = new JLabel("#ThisIsOurShot");
		lblNewLabel_6.setFont(new Font("PMingLiU-ExtB", Font.BOLD, 29));
		lblNewLabel_6.setBounds(10, 10, 207, 33);
		panel.add(lblNewLabel_6);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\Downloads\\photo-1579546928937-641f7ac9bced.jpg"));
		lblNewLabel_2.setBounds(0, 0, 227, 490);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		//lblNewLabel_1.setBounds(138, 11,);
		panel.add(lblNewLabel_1);
		contentPane.add(panel);
		
		JLabel label = new JLabel("New label");
		label.setBounds(79, 68, 45, 13);
		panel.add(label);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 800, 600);
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\Downloads\\0436b98309bf07065a2a2da8ad7e1335.png"));
		contentPane.add(lblNewLabel);
	}
}
