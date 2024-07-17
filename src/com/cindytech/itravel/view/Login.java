package com.cindytech.itravel.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import com.cindytech.itravel.controller.LoginController;
import com.cindytech.itravel.utils.ColorLayout;
import com.cindytech.itravel.utils.OraUtils;
/**
 *
 * @author ShurdhiDo
 */
public class Login extends javax.swing.JFrame {

	private static final long serialVersionUID = 471133671091107536L;
	LoginController controller = new LoginController();
	OraUtils oraUtils = new OraUtils();
	ColorLayout colorLayout = new ColorLayout();
	java.awt.Color bg = colorLayout.getBackgroundColor();
	java.awt.Color fg = colorLayout.getForegroundColor();
	java.awt.Color blue = colorLayout.getBlueColor();

	public Login() {
		initComponents();
		setLocationRelativeTo(null);
		oraUtils.showDate(lData);
		oraUtils.showTime(lOra);
	}
                     
	private void initComponents() {

		//FRAME
		setUndecorated(true);
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Login");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/icon/common/icon.png")));
		setResizable(false);
		//setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		//getContentPane().setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		setBackground(new java.awt.Color(230, 230, 230));
		getContentPane().setBackground(new java.awt.Color(230, 230, 230));

		//JPANEL
		panelLogin = new javax.swing.JPanel();
		//panelLogin.setForeground(Color.DARK_GRAY);
		//panelLogin.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(64, 64, 64), new Color(64, 64, 64)), "  Powered by CindyTECH    ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(255, 255, 255)));
		panelLogin.setBorder(new LineBorder(bg, 5)); // NOI18N
		panelLogin.setForeground(new java.awt.Color(255, 255, 255));
		panelLogin.setFont(new java.awt.Font("Franklin Gothic Medium", java.awt.Font.ITALIC, 12)); // NOI18N
		panelLogin.setBackground(new java.awt.Color(255, 255, 255));
		//panelLogin.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		
		panelPassword = new javax.swing.JPanel();
		panelPassword.setBounds(40, 180, 220, 47);
		panelPassword.setBackground(new java.awt.Color(255, 255, 255));
		panelPassword.setForeground(new java.awt.Color(255, 255, 255));
		panelPassword.setBorder(new LineBorder(new java.awt.Color(255, 204, 0)));

		panel = new javax.swing.JPanel();
		panel.setBorder(new LineBorder(Color.GRAY, 1, true));
		panel.setBackground(bg);
		//panel.setBackground(new Color(1.0f, 1.0f, 1.0f, 0.0f));
		panel.setLayout(null);
		
		panelUsername = new javax.swing.JPanel();
		panelUsername.setBounds(40, 120, 220, 47);
		panelUsername.setForeground(new java.awt.Color(255, 255, 255));
		panelUsername.setBorder(new LineBorder(new java.awt.Color(255, 204, 0)));
		panelUsername.setBackground(new java.awt.Color(255, 255, 255));

		//JLABEL
		lData = new javax.swing.JLabel();
		lData.setHorizontalAlignment(SwingConstants.LEFT);
		lData.setFont(new java.awt.Font("Lucida Console", java.awt.Font.BOLD, 16)); // NOI18N
		lData.setForeground(new java.awt.Color(51, 51, 51));
		lData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/common/data.png"))); // NOI18N

		lOra = new javax.swing.JLabel();
		lOra.setHorizontalAlignment(SwingConstants.RIGHT);
		lOra.setFont(new java.awt.Font("Lucida Console", java.awt.Font.BOLD, 16)); // NOI18N
		lOra.setForeground(new java.awt.Color(51, 51, 51));
		lOra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/common/ora.png")));

		/*lLogo.addMouseListener(new MouseAdapter() {
		@Override
		public void mouseClicked(MouseEvent arg0) {
			LoginControllerOLD.openWebpage("https://cindyconsulting.tech");
		}
		});*/

		lStoftwareName = new javax.swing.JLabel("iTRAVEL");
		lStoftwareName.setForeground(new java.awt.Color(240, 199, 5));
		lStoftwareName.setFont(new java.awt.Font("Viner Hand ITC", java.awt.Font.BOLD, 30));
		lStoftwareName.setHorizontalAlignment(SwingConstants.CENTER);
		/*final Random r=new Random();
        Timer t=new Timer(500,new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Color c=new Color(r.nextInt(256),r.nextInt(256),r.nextInt(256),r.nextInt(256));
                lStoftwareName.setForeground(c);
            }
        });
        t.start();*/

		lAuthor = new javax.swing.JLabel("Developed by CindyTECH ©");
		lAuthor.setBackground(new java.awt.Color(255, 255, 255));
		lAuthor.setHorizontalAlignment(SwingConstants.CENTER);
		lAuthor.setForeground(new java.awt.Color(0, 0, 0));
		lAuthor.setFont(new java.awt.Font("Comic Sans MS", java.awt.Font.PLAIN, 14));
		
		lAcountIcon = new javax.swing.JLabel();
		lAcountIcon.setHorizontalAlignment(SwingConstants.CENTER);
		lAcountIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/locksmith.png")));
		lAcountIcon.setBounds(40, 20, 220, 78);
		
		lUser = new javax.swing.JLabel("");
		lUser.setHorizontalAlignment(SwingConstants.RIGHT);
		lUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/user.png")));

		
		lLock = new javax.swing.JLabel("");
		lLock.setHorizontalAlignment(SwingConstants.LEFT);
		lLock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/lock.png")));	
		
		//JCHECKBOX
		lEye = new javax.swing.JCheckBox();
		lEye.setBackground(Color.WHITE);
		//lEye.setBackground(new java.awt.Color(255, 255, 255));
		//lEye.setForeground(new java.awt.Color(255, 255, 255));
		lEye.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/hide.png"))); // NOI18N
		lEye.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					tfPassword.setEchoChar((char) 0);
					lEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/eye24.png")));	
				} else {
					tfPassword.setEchoChar('●');
					lEye.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/hide.png")));	
				}
			}
		});
		
		//LAYOUT
		FlowLayout flowLayout = (FlowLayout) panelPassword.getLayout();
		flowLayout.setAlignment(FlowLayout.LEADING);
		
		
		//JTEXTFIELD
		tfUsername = new javax.swing.JTextField();
		tfUsername.setBackground(new java.awt.Color(255, 255, 255));
		tfUsername.setFont(new java.awt.Font("Century Gothic", java.awt.Font.BOLD, 13)); // NOI18N
		tfUsername.setForeground(new Color(51, 51, 51));
		tfUsername.setText("username");
		tfUsername.setBorder(null);
		tfUsername.setSelectionColor(new java.awt.Color(23,43,77));
		tfUsername.setCaretColor(new java.awt.Color(23,43,77));
		tfUsername.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfUsername.setText("");
			}
		});
		
		tfPassword = new javax.swing.JPasswordField();
		tfPassword.setBackground(new java.awt.Color(255, 255, 255));
		tfPassword.setFont(new java.awt.Font("Century Gothic", java.awt.Font.BOLD, 13)); // NOI18N
		tfPassword.setForeground(new Color(51, 51, 51));
		tfPassword.setPreferredSize(new Dimension(145, 35));
		tfPassword.setText("password123");
		tfPassword.setBorder(null);
		tfPassword.setSelectionColor(new java.awt.Color(23,43,77));
		tfPassword.setCaretColor(new java.awt.Color(23,43,77));
		tfPassword.setFocusable(true);
		tfPassword.requestFocus();
		tfPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tfPassword.setText("");
				tfPassword.setEchoChar('●');
			}
		});
		tfPassword.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_ENTER) {
					if (controller.validate(tfUsername, tfPassword)==true){
						dispose();
					}
				}
			}
		});
	

		//JBUTTON
		bLogin = new javax.swing.JButton();
		bLogin.setText("LOGIN");
		bLogin.setBounds(88, 245, 120, 40);
		bLogin.setBackground(new java.awt.Color(0, 122, 255));
		bLogin.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
		bLogin.setForeground(new java.awt.Color(255,255,255));
		bLogin.setMaximumSize(new java.awt.Dimension(150, 40));
		bLogin.setMinimumSize(new java.awt.Dimension(120, 40));
		bLogin.setPreferredSize(new java.awt.Dimension(120, 40));;
		bLogin.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/user_login.png"))); // NOI18N
		bLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/user_login.png")));
		bLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
		bLogin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				bLogin.setBackground(new Color(255,255,255));
				bLogin.setText("");
			}
			public void mouseExited(java.awt.event.MouseEvent evt) {
				bLogin.setBackground(new java.awt.Color(0, 122, 255));
				bLogin.setForeground(new java.awt.Color(255,255,255));	
				bLogin.setText("Login");
			}
		});


		bLogin.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				if (controller.validate(tfUsername, tfPassword)==true){
					dispose();
				}
			}
		});
		
		bExit = new javax.swing.JButton();
		bExit.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/xblack25.png"))); // NOI18N
		bExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/xred25.png")));
		bExit.setBorder(javax.swing.BorderFactory.createLineBorder(Color.WHITE));
		bExit.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				System.exit(0);
				System.gc();
			}
		});

		bFacebook = new javax.swing.JButton();
		bFacebook.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/fb.png")));
		bFacebook.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/facebook_black.png"))); // NOI18N
		bFacebook.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controller.openFacebookPage("https://www.facebook.com/Cindytechnology");
			}
		});

		bYoutube = new javax.swing.JButton();
		bYoutube.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/youtube.png")));
		bYoutube.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/youtub_black.png"))); // NOI18N
		bYoutube.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controller.openYoutube("https://www.youtube.com/channel/UC75aMosskLbeVTIerkXpxwA");
			}
		});

		bWebsite = new javax.swing.JButton();
		bWebsite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/web.png")));
		bWebsite.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/login/web_black.png"))); // NOI18N
		bWebsite.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controller.openWebpage("https://cindyconsulting.tech");
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(panelLogin);
		jPanel1Layout.setHorizontalGroup(
			jPanel1Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGap(70)
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
						.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING, false)
							.addGroup(jPanel1Layout.createSequentialGroup()
								.addComponent(lData, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lOra, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lStoftwareName, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(1)
									.addComponent(bFacebook, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bWebsite, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(bYoutube, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
									.addGap(32)
									.addComponent(lAuthor)))))
					.addGap(53)
					.addComponent(bExit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
		);
		jPanel1Layout.setVerticalGroup(
			jPanel1Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel1Layout.createSequentialGroup()
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addComponent(lOra, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addComponent(lData, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
							.addComponent(lStoftwareName)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(44)
									.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(bYoutube, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
										.addComponent(bWebsite, Alignment.TRAILING, 0, 0, Short.MAX_VALUE)
										.addComponent(bFacebook, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 24, Short.MAX_VALUE)))
								.addGroup(jPanel1Layout.createSequentialGroup()
									.addGap(41)
									.addComponent(lAuthor, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))))
						.addComponent(bExit, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);

		javax.swing.GroupLayout gl_panelUsername = new javax.swing.GroupLayout(panelUsername);
		gl_panelUsername.setHorizontalGroup(
				gl_panelUsername.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelUsername.createSequentialGroup()
						.addGap(4)
						.addComponent(lUser)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tfUsername, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
						.addContainerGap())
				);
		gl_panelUsername.setVerticalGroup(
				gl_panelUsername.createParallelGroup(Alignment.TRAILING)
				.addComponent(tfUsername, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
				.addComponent(lUser, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addComponent(panelLogin, GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addComponent(panelLogin, GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
				);
		
		//ADD COMPONENT TO PANEL
		panelLogin.setLayout(jPanel1Layout);
		panelUsername.setLayout(gl_panelUsername);
		panelPassword.add(lLock);
		panelPassword.add(tfPassword);
		panelPassword.add(lEye);
		panel.add(panelUsername);
		panel.add(lAcountIcon);
		panel.add(bLogin);
		panel.add(panelPassword);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>                        
                                             
	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel settings code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
		 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		//FlatMacLightLaf.setup();

			//try {
				//UIManager.setLookAndFeel( new FlatMacLightLaf());
				//UIManager.setLookAndFeel( new FlatMacDarkLaf());
			//} catch (UnsupportedLookAndFeelException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();
			//}


		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Login().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify   

	//JPANEL
	private javax.swing.JPanel panelLogin;
	private javax.swing.JPanel panelPassword;
	private javax.swing.JPanel panelUsername;
	private javax.swing.JPanel panel;

	//JLABEL
	private javax.swing.JLabel lData;
	private javax.swing.JLabel lOra;
	private javax.swing.JLabel lUser;
	private javax.swing.JLabel lLock;
	private javax.swing.JLabel lAcountIcon;
	private javax.swing.JLabel lStoftwareName;
	private javax.swing.JLabel lAuthor;

	//JBUTTON
	private javax.swing.JButton bLogin;
	private javax.swing.JButton bExit;
	private javax.swing.JButton bFacebook;
	private javax.swing.JButton bYoutube;
	private javax.swing.JButton bWebsite;

	//JCHECKBOX
	private javax.swing.JCheckBox lEye;

	//JTEXTFIELD
	private javax.swing.JPasswordField tfPassword;
	private javax.swing.JTextField tfUsername;

	// End of variables declaration 
}