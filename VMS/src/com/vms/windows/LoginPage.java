package com.vms.windows;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.border.MatteBorder;

import com.vms.dbconnection.Oracon;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField usertext;
	private JTextField passwordtext;

	/**
	 * Launch the application.
	 */
	public int op=0;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 800, 566);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("HOME");
		btnBack.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		
		JLabel icidpass = new JLabel("Incorrect username or password");
		icidpass.setForeground(Color.RED);
		icidpass.setVisible(false);
		icidpass.setBounds(289, 351, 209, 13);
		contentPane.add(icidpass);
		
		JLabel plb = new JLabel("");
		plb.setForeground(Color.RED);
		plb.setFont(new Font("Arial", Font.PLAIN, 12));
		plb.setBounds(386, 331, 112, 13);
		contentPane.add(plb);
		
		JLabel ulb = new JLabel("");
		ulb.setFont(new Font("Arial", Font.PLAIN, 12));
		ulb.setForeground(new Color(255, 0, 0));
		ulb.setBounds(386, 262, 112, 13);
		contentPane.add(ulb);
		btnBack.setForeground(new Color(240, 255, 255));
		btnBack.setBackground(new Color(30, 144, 255));
		btnBack.setFont(new Font("Arial", Font.BOLD, 14));
		btnBack.setBounds(339, 420, 85, 21);
		contentPane.add(btnBack);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener(
				) {
			public void actionPerformed(ActionEvent e) {
				
				if(usertext.getText().trim().isEmpty()&&passwordtext.getText().trim().isEmpty()) {
					ulb.setText("Enter Username !!!");
					plb.setText("Enter Password !!!");
					ulb.setVisible(true);
					plb.setVisible(true);
					
				}
				else if(usertext.getText().trim().isEmpty()) {
					ulb.setText("Enter Username !!!");
					ulb.setVisible(true);
					plb.setVisible(false);
				}
				else if(passwordtext.getText().trim().isEmpty()) {
					plb.setText("Enter Password !!!");
					plb.setVisible(true);
					ulb.setVisible(false);
				}
				else {
					ulb.setVisible(false);
					plb.setVisible(false);
					op =+1;
				}
			boolean b;
				Oracon db = new Oracon();
				b = db.login(usertext.getText() , passwordtext.getText());
				
				
				if(b==false) {
				icidpass.setVisible(true);
					
				}//else if(b==true){
				//	icidpass.setVisible(true);
				
				
				//if(op  != 0) {
				//	ArrayList al =new ArrayList();
				
					
					if(b ==true) {
					
						
						JOptionPane.showMessageDialog(null,"Successfully login");
						//DashboardPage dp = new DashboardPage();
						//dp.setVisible(true);
						setVisible(false);
						icidpass.setVisible(false);
						
					}
					else {
						JOptionPane.showMessageDialog(null,"Not Submitted");
					}
					//}
			//	else {
						//JOptionPane.showMessageDialog(null,"Not ok" );
					//}
				//}
				
//				DashboardPage dp = new DashboardPage();
//				dp.setVisible(true);
//				setVisible(false);
		/*	HomePage hm = new HomePage();
			setVisible(false);
hm.setVisible(true); */
				

			}
		});
		btnNewButton.setForeground(new Color(240, 255, 255));
		btnNewButton.setBackground(new Color(30, 144, 255));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(339, 374, 85, 21);
		contentPane.add(btnNewButton);
		
		usertext = new JTextField();
		usertext.setBounds(386, 241, 112, 19);
		contentPane.add(usertext);
		usertext.setColumns(10);
		
		passwordtext = new JTextField();
		passwordtext.setColumns(10);
		passwordtext.setBounds(386, 308, 112, 19);
		contentPane.add(passwordtext);
		
		JLabel passlbl2 = new JLabel("Password");
		passlbl2.setFont(new Font("Arial", Font.BOLD, 14));
		passlbl2.setBounds(267, 307, 106, 22);
		contentPane.add(passlbl2);
		
		JLabel userlbl1 = new JLabel("Username");
		userlbl1.setFont(new Font("Arial", Font.BOLD, 14));
		userlbl1.setBounds(270, 238, 106, 22);
		contentPane.add(userlbl1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\Downloads\\dp-modified (1).png"));
		lblNewLabel_2.setBounds(330, 64, 136, 123);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		lblNewLabel_1.setIcon(new ImageIcon("D:\\Project Images\\white34.png"));
		lblNewLabel_1.setBounds(222, 41, 337, 455);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBorder(new MatteBorder(4, 4, 4, 4, (Color) new Color(0, 0, 0)));
		lblNewLabel.setBounds(0, 0, 800, 566);
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\Downloads\\blue.png"));
		contentPane.add(lblNewLabel);
	}
}
