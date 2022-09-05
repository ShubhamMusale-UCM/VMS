package com.vms.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import javax.swing.UIManager;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;
import com.toedter.calendar.JDateChooser;
import com.vms.dbconnection.Oracon;

public class RegistrationPage extends JFrame {

	private JPanel contentPane;
	private JTextField fntext;
	private JTextField lntext;
	private JTextField mntext;
	private JTextField eitext;
	private JTextField pwtext;
	private JTextField cptext;
boolean b = false;
boolean fnb = false;
boolean lnb = false;
boolean mnb = false;
boolean eib = false;
boolean adb = false;
boolean cpb = false;
boolean pwb = false;
int op = 0;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistrationPage frame = new RegistrationPage();
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
	public RegistrationPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 100, 800, 566);
		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnNewButton_1 = new JButton("Home");
		btnNewButton_1.setBounds(620, 495, 105, 27);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton_1.setForeground(new Color(240, 255, 255));
		btnNewButton_1.setBackground(new Color(148, 0, 211));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage hp = new HomePage();
				hp.setVisible(true);
				setVisible(false);
			}
		});
		contentPane.setLayout(null);
		
		JLabel mcn = new JLabel("");
		mcn.setFont(new Font("Arial", Font.PLAIN, 14));
		mcn.setForeground(new Color(255, 0, 0));
		mcn.setBounds(615, 250, 99, 19);
		mcn.setVisible(false);
		
		JLabel dolb = new JLabel("");
		dolb.setBounds(568, 361, 29, 19);
		contentPane.add(dolb);
		
		JLabel adlb = new JLabel("");
		adlb.setForeground(Color.RED);
		adlb.setFont(new Font("Tahoma", Font.BOLD, 20));
		adlb.setBounds(568, 334, 29, 19);
		contentPane.add(adlb);
	
		contentPane.add(mcn);
		
		
		
		JDateChooser dodate = new JDateChooser();
		dodate.setBackground(new Color(153, 50, 204));
		dodate.setBounds(602, 361, 136, 19);
		contentPane.add(dodate);
		
		JLabel lblNewLabel_3_5_1 = new JLabel("DOB                              :-");
		lblNewLabel_3_5_1.setFont(new Font("Arial", Font.BOLD, 14));
		lblNewLabel_3_5_1.setBounds(397, 363, 183, 21);
		contentPane.add(lblNewLabel_3_5_1);
		
		JLabel colb = new JLabel("");
		colb.setVisible(false);
		colb.setForeground(new Color(255, 0, 0));
		colb.setBounds(602, 461, 112, 13);
		contentPane.add(colb);
		
		JLabel palb = new JLabel("");
		palb.setForeground(new Color(255, 0, 0));
		palb.setVisible(false);
		palb.setBounds(602, 415, 112, 13);
		contentPane.add(palb);
		
		JLabel emlb = new JLabel("");
		emlb.setVisible(false);
		emlb.setForeground(new Color(255, 0, 0));
		emlb.setBounds(602, 300, 112, 17);
		contentPane.add(emlb);
		
		JLabel molb = new JLabel("");
		molb.setVisible(false);
		molb.setForeground(new Color(255, 0, 0));
		molb.setBounds(602, 256, 112, 13);
		contentPane.add(molb);
		
		JLabel lalb = new JLabel("");
		lalb.setForeground(new Color(255, 0, 0));
		lalb.setVisible(false);
		lalb.setBounds(602, 208, 112, 13);
		contentPane.add(lalb);
		
		JLabel filb = new JLabel("");
		filb.setForeground(new Color(255, 0, 0));
		filb.setVisible(false);
		filb.setBackground(new Color(240, 255, 255));
		filb.setBounds(602, 164, 112, 13);
		
		contentPane.add(filb);
		
		JTextArea adtext = new JTextArea();
		adtext.setBorder(new LineBorder(new Color(112, 128, 144)));
		adtext.setBackground(new Color(230, 230, 250));
		adtext.setBounds(602, 329, 136, 24);
		contentPane.add(adtext);
		
		JLabel lblNewLabel_5 = new JLabel("Registration");
		lblNewLabel_5.setBounds(541, 76, 173, 27);
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 22));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_4 = new JLabel("New User");
		lblNewLabel_4.setBounds(552, 46, 173, 27);
		lblNewLabel_4.setFont(new Font("Arial", Font.BOLD, 22));
		contentPane.add(lblNewLabel_4);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.setBounds(440, 495, 105, 27);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(240, 248, 255));
		btnNewButton.setBackground(new Color(148, 0, 211));
		ArrayList al = new ArrayList();
		//mntext= isEmpty();
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				filb.setVisible(false);
				lalb.setVisible(false);
				molb.setVisible(false);
				emlb.setVisible(false);
				palb.setVisible(false);
				mcn.setVisible(false);
				mcn.setVisible(false);
				colb.setVisible(false);
				 b = false;
				  fnb = false;
				  lnb = false;
				  mnb = false;
				  eib = false;
				  adb = false;
				  cpb = false;
				  pwb = false;

				if (fntext.getText().trim().isEmpty()&&lntext.getText().trim().isEmpty()&&mntext.getText().trim().isEmpty()&&eitext.getText().trim().isEmpty()&&pwtext.getText().trim().isEmpty()&&cptext.getText().trim().isEmpty()&&adtext.getText().trim().isEmpty())
				{
					filb.setText("Enter First Name !!!");
					lalb.setText("Enter Last Name !!!");
					molb.setText("Enter Mobile Number !!!");
					emlb.setText("Enter Email ID !!!");
					palb.setText("Enter Password !!!");
					colb.setText("Confirm Password !!!");
					adlb.setText("  *");
					filb.setVisible(true);
					lalb.setVisible(true);
					molb.setVisible(true);
					emlb.setVisible(true);
					palb.setVisible(true);
					colb.setVisible(true);
					adlb.setVisible(true);
					//dolb.setVisible(true);
					//mcn.setVisible(true);
					//mcn.setVisible(false);
					
				}
				 if (fntext.getText().trim().isEmpty())
				{
					filb.setText("Enter First Name !!!");
					filb.setVisible(true);
					
				}
				 else {
					 boolean fn ;
						
					 fn= Pattern.compile("^$|(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$").matcher(fntext.getText()).matches();
					if (fntext!=null) {
						if(fn==false){
							filb.setText("wrong input !!!");
							filb.setVisible(true);	
							fnb = false;
						}	
						else {
							al.add(fntext.getText());
							op = op+1;
							fnb = true;
						}
					}				
					
					
				 }
				if(lntext.getText().trim().isEmpty())
				{
					lalb.setText("Enter Last Name !!!");
				 
					lalb.setVisible(true);
				
				}else {
					boolean ln ;
					
					 ln= Pattern.compile("^$|(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$").matcher(lntext.getText()).matches();
					if (lntext!=null) {
						if(ln==false){
							lalb.setText("wrong input !!!");
							lalb.setVisible(true);
							lnb = false;
						}	
						else {
							al.add(lntext.getText());
							lnb = true;
							op = op+1;
						}
					}
					
				}
		        if(mntext.getText().trim().isEmpty()) {
		        	/* boolean b ;
		        b= Pattern.compile("^\\d{10}$").matcher(mntext.getText()).matches();
				if(b==false) {
					molb.setText("Enter Mobile Number !!!");
					monlb.setVisible(true);*/
		        	molb.setText("Enter Mobile Number !!!");
		        	molb.setVisible(true);
				}else {
					boolean mn ;
					
					
					 mn= Pattern.compile("^$|[6-9][0-9]{9}").matcher(mntext.getText()).matches();
					if (mntext!=null) {
						if(mn==false){
							molb.setText("wrong input !!!");
							molb.setVisible(true);	
							mnb = false;
						}
						else {
							al.add(mntext.getText());
							mnb = true;
							op = op+1;
						}
					}
				}
				
				
				if(eitext.getText().trim().isEmpty())
				{
					emlb.setText("Enter Email ID !!!");
					
					emlb.setVisible(true);
				}else {
				boolean ei ;
				
				ei= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\.+[a-z]{3}+").matcher(eitext.getText()).matches();
				if (eitext!=null) {
					if(ei==false){
						emlb.setText("wrong input !!!");
						emlb.setVisible(true);	
						eib = false;					
					}
					else {
						al.add(eitext.getText());
						eib = true;
						b = true ;
						op = op+1;
					}
				}
				}
				
				if(adtext.getText().trim().isEmpty())
				{
					adlb.setText(" *");
					adlb.setVisible(true);
				}else {
					
					if(adtext!=null) {
						al.add(adtext.getText());
						adb = true;
						op = op+1;
					}
				}
				if(pwtext.getText().trim().isEmpty())
				{
					palb.setText("Enter Password !!!");
				
					palb.setVisible(true);
					
				}
				else {
					if(pwtext!=null) {
						al.add(pwtext.getText());
						pwb = true ;
						op = op+1;
					}
					
				}
				
				
				int c = 0;
				
				if(cptext.getText().trim().isEmpty())
				{
					colb.setText("Confirm Password !!!");
					
					colb.setVisible(true);
				}else {
					if(!cptext.getText().equals(pwtext.getText()))
					{
						colb.setText("wrong input");
						colb.setVisible(true);
						c = 1;
						cpb = false;
						
					}
					else {
						al.add(cptext.getText());
						cpb = true;
						op = op+1;
						
					}
				
					
				}
				
		if(op  != 0) {
				
				Oracon ora = new Oracon();
				int a =ora.insertIntoDB(al);
				if(a ==1  ) {
					JOptionPane.showMessageDialog(null,"Successfully Submited.."+
				                                  "login please");
				LoginPage lpg = new LoginPage();
				lpg.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(null,"Not Submitted");
				}
				}
				else {
					JOptionPane.showMessageDialog(null,"Not ok");
				}
			
				
				}			
		});
		
		contentPane.add(btnNewButton);
		
		cptext = new JTextField();
		cptext.setBackground(new Color(230, 230, 250));
		cptext.setBounds(602, 438, 136, 19);
		cptext.setColumns(10);
		contentPane.add(cptext);
		
		pwtext = new JTextField();
		pwtext.setBackground(new Color(230, 230, 250));
		pwtext.setBounds(602, 393, 136, 19);
		pwtext.setColumns(10);
		contentPane.add(pwtext);
		
		eitext = new JTextField();
		eitext.setBackground(new Color(230, 230, 250));
		eitext.setBounds(602, 279, 136, 19);
		eitext.setColumns(10);
		contentPane.add(eitext);
		
		mntext = new JTextField();
		mntext.setBackground(new Color(230, 230, 250));
		mntext.setBounds(602, 231, 136, 19);
		mntext.setColumns(10);
		contentPane.add(mntext);
		mntext.setText("");
		
		lntext = new JTextField();
		lntext.setBackground(new Color(230, 230, 250));
		lntext.setBounds(602, 187, 136, 19);
		lntext.setColumns(10);
		contentPane.add(lntext);
		
		fntext = new JTextField();
		fntext.setBackground(new Color(230, 230, 250));
		fntext.setBounds(602, 139, 136, 19);
		contentPane.add(fntext);
		fntext.setColumns(10);
		
		JLabel lblNewLabel_3_7 = new JLabel("Confirm Password      :-");
		lblNewLabel_3_7.setBounds(397, 436, 183, 21);
		lblNewLabel_3_7.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_6 = new JLabel("Password                     :-");
		lblNewLabel_3_6.setBounds(397, 389, 183, 21);
		lblNewLabel_3_6.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_5 = new JLabel("Address                        :-");
		lblNewLabel_3_5.setBounds(397, 323, 183, 21);
		lblNewLabel_3_5.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_4 = new JLabel("Email ID                        :-");
		lblNewLabel_3_4.setBounds(397, 277, 183, 21);
		lblNewLabel_3_4.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_3 = new JLabel("Mobiler Number          :-");
		lblNewLabel_3_3.setBounds(397, 229, 183, 21);
		lblNewLabel_3_3.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Last Name                    :-");
		lblNewLabel_3_1.setBounds(397, 185, 183, 21);
		lblNewLabel_3_1.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3 = new JLabel("First Name                   :-");
		lblNewLabel_3.setBounds(397, 137, 183, 21);
		lblNewLabel_3.setFont(new Font("Arial", Font.BOLD, 14));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(0, 0, 0)));
		lblNewLabel_2.setBounds(361, 20, 439, 525);
		lblNewLabel_2.setIcon(new ImageIcon("D:\\Project Images\\white2.jpg"));
		contentPane.add(lblNewLabel_2);
					   	//1
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(120, 114, 99, 27);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(0, 0, 800, 566);
		lblNewLabel.setIcon(new ImageIcon("D:\\Project Images\\reges.jpg"));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2_1 = new JLabel("New label");
		lblNewLabel_2_1.setBounds(361, 20, 439, 525); 
		contentPane.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("New label");
		lblNewLabel_3_2.setBounds(440, 219, 45, 13);
		contentPane.add(lblNewLabel_3_2);
	}
}