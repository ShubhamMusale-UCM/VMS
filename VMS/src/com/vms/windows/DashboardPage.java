package com.vms.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.regex.Pattern;

import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPopupMenu;
import java.awt.Component;
import javax.swing.JCheckBoxMenuItem;
import com.toedter.calendar.JDateChooser;
import com.vms.dbconnection.Oracon;

import java.awt.Label;
import java.awt.Panel;
import javax.swing.JScrollBar;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.border.BevelBorder;
import javax.swing.JTextArea;

public class DashboardPage extends JFrame {

	private JPanel contentPane;
	private JTextField mntextField;
	private JTextField semail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DashboardPage frame = new DashboardPage("");
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
	public DashboardPage(String email) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 30, 1320, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new LineBorder(new Color(255, 255, 255), 0, true));
		setUndecorated(true);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel shepanel = new JPanel();
		shepanel.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		shepanel.setBounds(218, 163, 457, 420);
		contentPane.add(shepanel);
		shepanel.setBackground(new Color(0, 191, 255));
		shepanel.setLayout(null);
		shepanel.setVisible(false);
		
		
		
		
		
		
		

		
		
//		
//		JPanel shepanel = new JPanel();
//		shepanel.setBounds(376, 164, 450, 400);
//		shepanel.setBackground(new Color(0, 191, 255));
//		contentPane.add(shepanel);
//		shepanel.setLayout(null);
//		shepanel.setVisible(false);
//		

		JLabel lblNewLabel_1 = new JLabel("Enter Your full details !!!");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_1.setBounds(176, 391, 223, 19);
		shepanel.add(lblNewLabel_1);
		lblNewLabel_1.setVisible(false);
		
		JDateChooser dt = new JDateChooser();
		dt.setBounds(202, 136, 197, 19);
		shepanel.add(dt);
		
		JLabel lblNewLabel_7_1_1 = new JLabel("Date");
		lblNewLabel_7_1_1.setFont(new Font("Arial", Font.BOLD, 16));
		lblNewLabel_7_1_1.setBounds(45, 133, 136, 22);
		shepanel.add(lblNewLabel_7_1_1);
		
		JComboBox st = new JComboBox();
		st.setModel(new DefaultComboBoxModel(new String[] {"Select", "MAHARASHTRA", "TELANGANA", "KARNATAKA"}));
		st.setBounds(202, 232, 197, 21);
		shepanel.add(st);
		
		JComboBox vt = new JComboBox();
		vt.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		vt.setForeground(Color.BLACK);
		vt.setModel(new DefaultComboBoxModel(new String[] {"Select", "COVAXIN", "COWIN"}));
		vt.setBounds(202, 93, 197, 21);
		shepanel.add(vt);
		
		JPanel vprofile = new JPanel();
		vprofile.setBounds(523, 170, 457, 509);
		contentPane.add(vprofile);
		vprofile.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		vprofile.setBackground(new Color(0, 191, 255));
		vprofile.setVisible(false);
		vprofile.setLayout(null);
		
		Label booklb = new Label("    Book your Slot");
		booklb.setBackground(new Color(0, 191, 255));
		booklb.setBounds(316, 428, 158, 28);
		contentPane.add(booklb);
		booklb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				shepanel.setVisible(true);
				booklb.setVisible(false);
				vprofile.setVisible(false);
			}
		});
		booklb.setFont(new Font("Perpetua Titling MT", Font.BOLD, 17));
		
				JComboBox vcent = new JComboBox();
				vcent.setModel(new DefaultComboBoxModel(new String[] {"Select", "CNS hospital", "CIVIL hospital", "NOBLE hospital"}));
				vcent.setBounds(202, 179, 197, 21);
				shepanel.add(vcent);
				
				ArrayList al = new ArrayList();
				
				JPanel stime = new JPanel();
				stime.setBorder(new LineBorder(new Color(0, 0, 0), 3));
				stime.setBackground(new Color(0, 191, 255));
				stime.setBounds(831, 163, 457, 420);
				contentPane.add(stime);
				stime.setLayout(null);
				stime.setVisible(false);
				
				JButton btnNewButton = new JButton("Book an Appointment");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					    if(mntextField.getText().trim().isEmpty()) {
				        	/* boolean b ;
				        b= Pattern.compile("^\\d{10}$").matcher(mntext.getText()).matches();
						if(b==false) {
							molb.setText("Enter Mobile Number !!!");
							monlb.setVisible(true);*/
					    	lblNewLabel_1.setText("Enter Full Details");
					    	lblNewLabel_1.setVisible(true);
						}else {
							boolean eid3;
							
							eid3= Pattern.compile("^$|[a-zA-Z0-9._-]+@[a-z]{5,7}+\\\\.+[a-z]{3}+").matcher(semail.getText()).matches();
							if (semail!=null) {
								if(eid3==false){
									lblNewLabel_1.setText("wrong input !!!");
									lblNewLabel_1.setVisible(true);	
								//	mnb = false;
								}
							}
							boolean mn;
							
							 mn= Pattern.compile("^$|[6-9][0-9]{9}").matcher(mntextField.getText()).matches();
							if (mntextField!=null) {
								if(mn==false){
									lblNewLabel_1.setText("wrong input !!!");
									lblNewLabel_1.setVisible(true);	
								//	mnb = false;
								}
								else {
								LoginPage lpg = new LoginPage();
							al.add(mntextField.getText());
							al.add(vt.getSelectedItem().toString());
							//al.add(dateChooser.getText());
							al.add(vcent.getSelectedItem().toString());
							al.add(st.getSelectedItem().toString());
								
								Oracon ora = new Oracon();
								int a =ora.insertIntoDBT(al);
								if(a ==1  ) {
									JOptionPane.showMessageDialog(null,"Successfully Submited.."+
								                                  "view your shedule");
									stime.setVisible(true);
									shepanel.setVisible(false);
									email em = new email();
									em.emailsend(email);
									
//						LoginPage lg = new LoginPage();
//						lpg.setVisible(true);
								}
								else {
									JOptionPane.showMessageDialog(null,"Not Submitted");
								}
								}
							
								
							booklb.setVisible(true);
								}
							}
						}
						
					}
				);
				btnNewButton.setBackground(new Color(154, 205, 50));
				btnNewButton.setBorder(new MatteBorder(3, 3, 3, 3, (Color) new Color(0, 0, 0)));
				btnNewButton.setFont(new Font("Elephant", Font.BOLD, 16));
				btnNewButton.setBounds(124, 303, 223, 35);
				shepanel.add(btnNewButton);
				
				
	
				
				JLabel lblNewLabel_7_2 = new JLabel("Vaccine Center");
				lblNewLabel_7_2.setFont(new Font("Arial", Font.BOLD, 16));
				lblNewLabel_7_2.setBounds(45, 176, 136, 22);
				shepanel.add(lblNewLabel_7_2);
				
				JLabel lblNewLabel_7_1 = new JLabel("Vaccine Choice");
				lblNewLabel_7_1.setFont(new Font("Arial", Font.BOLD, 16));
				lblNewLabel_7_1.setBounds(45, 90, 136, 22);
				shepanel.add(lblNewLabel_7_1);
				
				JLabel lblNewLabel_7 = new JLabel("Mobile no.");
				lblNewLabel_7.setFont(new Font("Arial", Font.BOLD, 16));
				lblNewLabel_7.setBounds(45, 58, 136, 22);
				shepanel.add(lblNewLabel_7);
				
				
				
				
				
				

				
				mntextField = new JTextField();
				mntextField.setBackground(new Color(240, 255, 255));
				mntextField.setBounds(202, 57, 197, 23);
				shepanel.add(mntextField);
				mntextField.setColumns(10);
				
				JLabel lblNewLabel_7_2_1 = new JLabel("State");
				lblNewLabel_7_2_1.setFont(new Font("Arial", Font.BOLD, 16));
				lblNewLabel_7_2_1.setBounds(45, 229, 136, 22);
				shepanel.add(lblNewLabel_7_2_1);
				
				JLabel lblNewLabel_8 = new JLabel("<<Back");
				lblNewLabel_8.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						shepanel.setVisible(false);
						booklb.setVisible(true);
					}
				});
				lblNewLabel_8.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 16));
				lblNewLabel_8.setBounds(10, 348, 85, 28);
				shepanel.add(lblNewLabel_8);
				
				JLabel lblsdwws = new JLabel("Email Id");
				lblsdwws.setFont(new Font("Arial", Font.BOLD, 16));
				lblsdwws.setBounds(45, 21, 136, 22);
				shepanel.add(lblsdwws);
				
				semail = new JTextField();
				semail.setBounds(202, 25, 197, 19);
				shepanel.add(semail);
				semail.setColumns(10);
		
		
		JLabel nlb = new JLabel("");
		nlb.setFont(new Font("Arial", Font.BOLD, 15));
		nlb.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		nlb.setBounds(161, 154, 272, 31);
		vprofile.add(nlb);
		
		JLabel mlb = new JLabel("");
		mlb.setFont(new Font("Arial", Font.BOLD, 15));
		mlb.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		mlb.setBounds(161, 214, 272, 31);
		vprofile.add(mlb);
		
		JTextArea adlb = new JTextArea();
		adlb.setFont(new Font("Arial", Font.BOLD, 15));
		adlb.setBackground(new Color(0, 191, 255));
		adlb.setBorder(new MatteBorder(1, 1, 2, 1, (Color) new Color(0, 0, 0)));
		adlb.setBounds(161, 278, 272, 74);
		vprofile.add(adlb);
		
		JLabel lblNewLabel_12 = new JLabel("Name                    :-");
		lblNewLabel_12.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_12.setBounds(10, 153, 141, 31);
		vprofile.add(lblNewLabel_12);
		
		JLabel lblNewLabel_12_1 = new JLabel("Mobile No.           :-");
		lblNewLabel_12_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_12_1.setBounds(10, 214, 141, 31);
		vprofile.add(lblNewLabel_12_1);
		
		JLabel lblNewLabel_12_2 = new JLabel("Address                :-");
		lblNewLabel_12_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_12_2.setBounds(10, 277, 141, 31);
		vprofile.add(lblNewLabel_12_2);
		

		
		
		
		JLabel back = new JLabel("<<BACK");
		back.setBounds(223, 370, 199, 30);
		vprofile.add(back);
		back.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
			}
		});
		back.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stime.setVisible(false);
				booklb.setVisible(true);
				vprofile.setVisible(false);

				//booklb.set
			}
		});
		back.setFont(new Font("Arial", Font.BOLD, 16));
		//lblNewLabel_10.get
		
		
		
		
		
		JLabel lblNewLabel_11 = new JLabel("vaccination choice        :-");
		lblNewLabel_11.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_11.setBounds(41, 87, 188, 24);
		stime.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("date                                 :-");
		lblNewLabel_11_1.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_11_1.setBounds(41, 140, 188, 24);
		stime.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_2 = new JLabel("Vaccination center        :-");
		lblNewLabel_11_2.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_11_2.setBounds(41, 190, 188, 24);
		stime.add(lblNewLabel_11_2);
		
		JLabel lblNewLabel_11_3 = new JLabel("state                                :-");
		lblNewLabel_11_3.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel_11_3.setBounds(41, 239, 188, 24);
		stime.add(lblNewLabel_11_3);
		stime.setVisible(false);
		
		JLabel vout = new JLabel("");
		vout.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		vout.setFont(new Font("Arial", Font.BOLD, 14));
		vout.setBounds(239, 87, 151, 24);
		stime.add(vout);
		vout.setVisible(false);
		
		JLabel mnout = new JLabel("");
		mnout.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		mnout.setFont(new Font("Arial", Font.BOLD, 14));
		mnout.setBounds(239, 36, 151, 23);
		stime.add(mnout);
		mnout.setVisible(false);
		
		JLabel daout = new JLabel("");
		daout.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		daout.setFont(new Font("Arial", Font.BOLD, 14));
		daout.setBounds(239, 140, 151, 24);
		stime.add(daout);
		daout.setVisible(false);
		
		JLabel vcout = new JLabel("");
		vcout.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		vcout.setFont(new Font("Arial", Font.BOLD, 14));
		vcout.setBounds(239, 190, 151, 24);
		stime.add(vcout);
		vcout.setVisible(false);
		
		JLabel sout = new JLabel("");
		sout.setBorder(new MatteBorder(0, 0, 2, 0, (Color) new Color(0, 0, 0)));
		sout.setFont(new Font("Arial", Font.BOLD, 14));
		sout.setBounds(239, 239, 151, 24);
		stime.add(sout);
		sout.setVisible(false);
		
		JButton details = new JButton("Get details");
		details.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				String mnin =mntextField.getText();
//				mnout.setText(mnin);
//				SimpleDateFormat DateFor = new SimpleDateFormat("yyyy-MM-dd");
//				//String stringDate= DateFor.format(dt.getDate());
//				String stringDate= dt.getDate().toString();
//				daout.setText(stringDate);
				Oracon or = new Oracon();
				or.view(mntextField.getText());
				
				mnout.setText(or.mobile);
				mnout.setVisible(true);
				vout.setText(or.vchoice);
				vout.setVisible(true);
				vcout.setText(or.vcenter);
				vcout.setVisible(true);
				sout.setText(or.vstate);
				sout.setVisible(true);
				
				
//						ComboBoxModel vain = vt.getModel();
//						vaout.setModel(vain);
//						
			}
		});
		details.setBounds(169, 326, 85, 21);
		stime.add(details);
		
		JLabel lblNewLabel_9 = new JLabel("mobile no.                       :-");
		lblNewLabel_9.setBounds(41, 36, 188, 24);
		stime.add(lblNewLabel_9);
		lblNewLabel_9.setFont(new Font("Arial", Font.BOLD, 15));
		
		JLabel back_1 = new JLabel("<<BACK");
		back_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				stime.setVisible(false);
			}
		});
		back_1.setFont(new Font("Arial", Font.BOLD, 16));
		back_1.setBounds(239, 380, 199, 30);
		stime.add(back_1);
		
				
				
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon("D:\\Project Images\\Main\\COVID19vaccine1.png"));
		lblNewLabel_10.setBounds(274, 194, 239, 198);
		contentPane.add(lblNewLabel_10);
		
		JPanel menu = new JPanel();
		menu.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		menu.setBounds(22, 163, 186, 430);
		menu.setBackground(new Color(0, 191, 255));
		contentPane.add(menu);
		menu.setLayout(null);
		
		
		Oracon or = new Oracon();
		or.view1(email);
		
		JLabel uname = new JLabel(or.fname);
		uname.setFont(new Font("Arial", Font.BOLD, 15));
		uname.setBounds(1169, 88, 109, 35);
		contentPane.add(uname);
		
		
		Label label = new Label("View Profile");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vprofile.setVisible(true);
				
				
			
				nlb.setText(or.fname);
				nlb.setVisible(true);
				mlb.setText(or.mno);
				mlb.setVisible(true);
				adlb.setText(or.address);
				adlb.setVisible(true);
//				sout.setText(or.vstate);
//				sout.setVisible(true);
			}
		});
		label.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		label.setBounds(10, 10, 131, 28);
		menu.add(label);
		
		Label label_2 = new Label("<<Sign out");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				LoginPage lg = new LoginPage();
				lg.setVisible(true);
				setVisible(false);
			}
		});
		label_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		label_2.setBounds(10, 392, 115, 28);
		menu.add(label_2);
		
		Label label_1_1 = new Label("Shedule vaccine");
		label_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			shepanel.setVisible(true);
			}
		});
		label_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 15));
		label_1_1.setBounds(10, 60, 166, 28);
		menu.add(label_1_1);
		menu.setVisible(false);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setBounds(232, 8, 139, 127);
		lblNewLabel_6.setIcon(new ImageIcon("D:\\Project Images\\Main\\icon2.png"));
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_5_1 = new JLabel("\" Every Indian is making it possible.\"\r\n");
		lblNewLabel_5_1.setBounds(425, 52, 522, 49);
		lblNewLabel_5_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		contentPane.add(lblNewLabel_5_1);
		
//		JList list = new JList();
//		list.setBounds(324, 328, -255, -132);
//		((String) list).addElement("book");
//		contentPane.add(list);
		
		JLabel lblNewLabel_5 = new JLabel("\"India is set to defeat Covid-19. \"");
		lblNewLabel_5.setBounds(450, 8, 418, 49);
		lblNewLabel_5.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 28));
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(22, 143, 1266, 17);
		lblNewLabel_2.setBorder(new MatteBorder(4, 0, 0, 0, (Color) new Color(0, 0, 0)));
		contentPane.add(lblNewLabel_2);
		
		JLabel menuline = new JLabel("New label");
		menuline.setBounds(29, 111, 20, 24);
		menuline.addMouseListener(new MouseAdapter() {
			//@Overridewhile
			public void mouseClicked(MouseEvent e) {
				boolean pa= menu.isVisible();
				//if(pa = false) {
					menu.setVisible(true);
					//panel1.setVisible(false);
				//}
				//else {
				//	panel1.setVisible(true);
			//	}
				
			}
		});
		menuline.setIcon(new ImageIcon("D:\\Project Images\\3 line .png"));
		contentPane.add(menuline);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(1125, 88, 35, 35);
		lblNewLabel_3.setIcon(new ImageIcon("D:\\Project Images\\profile.png"));
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBounds(720, 105, 91, 28);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_13 = new JLabel("");
		lblNewLabel_13.setIcon(new ImageIcon("C:\\Users\\adars_uxgctsa\\OneDrive\\Pictures\\blue cmain.jpg"));
		lblNewLabel_13.setBounds(0, 0, 1400, 750);
		contentPane.add(lblNewLabel_13);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		lblNewLabel.setBounds(-28, -20, 1447, 972);
		lblNewLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu.setVisible(false);
			}
		});
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setIcon(null);
		contentPane.add(lblNewLabel);
		
		
		
		
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
