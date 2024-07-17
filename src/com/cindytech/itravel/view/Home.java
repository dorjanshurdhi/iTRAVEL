package com.cindytech.itravel.view;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import com.cindytech.itravel.controller.HomeController;
import com.cindytech.itravel.controller.SessionController;
import com.cindytech.itravel.model.Company;
import com.cindytech.itravel.model.Session;
import com.cindytech.itravel.model.User;
import com.cindytech.itravel.utils.ColorLayout;
import com.cindytech.itravel.utils.ColorToggleButton;
import com.cindytech.itravel.utils.JpanelLoader;
import com.cindytech.itravel.utils.OraUtils;
import com.formdev.flatlaf.themes.FlatMacLightLaf;

public class Home extends javax.swing.JFrame {

	private static final long serialVersionUID = 6682143952417301686L;

	JpanelLoader jpload = new JpanelLoader();
	//PosController posController = new PosController();
	SessionController sessionController = new SessionController();
	HomeController homeController = new HomeController();
	Session currentSession;
	Company currentCompany;

	User user;
	int idUser;
	String roli;
	OraUtils oraUtils = new OraUtils();
	Timer timer = new Timer();

	ColorLayout colorLayout = new ColorLayout();
	Color bg = colorLayout.getBackgroundColor();
	Color foreground = colorLayout.getForegroundColor();
	Color headerColor = colorLayout.getHeaderColor();
	Color fg = new Color(255, 92, 51);

	//SOFTWARE VERSION
	static ResourceBundle config = ResourceBundle.getBundle("config");
	private static String version= config.getString("software.version");

	boolean maximized;
	String selectButton="";

	public Home(Company company, User currentUser) {
		//FlatMacDarkLaf.setup();
		//FlatIntelliJLaf.setup();
		//FlatLightLaf.setup();
		//FlatLaf.registerCustomDefaultsSource("themes");
		//FlatLightLaf.registerCustomDefaultsSource("/themes/FlatLightLaf.properties");
		//FlatLightLaf.setup();

		setTitle("iTRAVEL 0.0.1");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Home.class.getResource("/icon/common/icon.png")));
		getContentPane().setBackground(new java.awt.Color(230, 230, 230));
		setBackground(bg);
		initComponents();
		setLocationRelativeTo(null);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);

		//String username = currentUser.getUsername();
		String name = currentUser.getEmri();
		roli = currentUser.getRole();
		user=currentUser;
		currentCompany=company;

		lAccount.setText("<html><center>Hello,<br><i><b><span style='color: #22cc00;'>"+name.toUpperCase()+"</span></b><i></center></html>");
		oraUtils.showTimeBoard(lData);
		currentSession=sessionController.startSession(currentUser);

		homeController.getCompanyInfo(currentCompany,lSubjekti, lAdresa, lNipt, lCel);
		homeController.showDateAndTime(lDate, lTime);

		homeController.logoUpload(lBackgroundImage);
		homeController.updateRate(currentUser, tbRate);

		if(user.getRole().equals("Perderues")) {

			tbUsers.setBackground(bg);
			tbUsers.setForeground(fg);
			tbUsers.setEnabled(false);

			tbSettings.setBackground(bg);
			tbSettings.setForeground(fg);
			tbSettings.setEnabled(false);
		}
		homeController.startProgramWithDelay(company);
		//TRIAL MODE
		/*try {
			checkValidity(tbPos,tbSales);
		} catch (SQLException e) {
			e.printStackTrace();
		}*/
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {
		//JPANEL
		buttonPanel = new javax.swing.JPanel();
		buttonPanel.setBackground(headerColor);
		buttonPanel.setBorder(new LineBorder(new Color(10, 7, 43), 1, true));

		panel_load = new javax.swing.JPanel();
		panel_load.setBackground(new java.awt.Color(255,255,255));
		panel_load.setBorder(new LineBorder(new Color(10, 7, 43), 1, true));

		headerPanel = new javax.swing.JPanel();
		headerPanel.setBackground(headerColor);
		headerPanel.setBorder(new LineBorder(new Color(10, 7, 43), 1, true));

		sessionPanel = new javax.swing.JPanel();
		sessionPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255), 1, true), "  Session Info  ", TitledBorder.CENTER, TitledBorder.BOTTOM, null, new Color(255, 255, 255)));
		sessionPanel.setBackground(new java.awt.Color(0, 0, 0));
		sessionPanel.setLayout(null);

		//JTOGLLEBUTTON
		home_bnt_grp = new javax.swing.ButtonGroup();
		tbPos = new ColorToggleButton();
		tbPos.setBackground(new java.awt.Color(255, 255, 255));
		tbRate = new ColorToggleButton();
		tbRate.setBackground(new java.awt.Color(255, 255, 255));
		tbSales = new ColorToggleButton();
		tbSales.setBackground(new java.awt.Color(255, 255, 255));
		tbStrongBox = new ColorToggleButton();
		tbStrongBox.setBackground(new java.awt.Color(255, 255, 255));
		tbUsers = new ColorToggleButton();
		tbUsers.setBackground(new java.awt.Color(255, 255, 255));
		tbSettings = new ColorToggleButton();
		tbSettings.setBackground(new java.awt.Color(255, 255, 255));
		tbStats = new ColorToggleButton();
		tbStats.setBackground(new java.awt.Color(255, 255, 255));
		tbReports = new ColorToggleButton();
		tbReports.setBackground(new java.awt.Color(255, 255, 255));
		tbExcel = new javax.swing.JButton();
		tbExcel.setBackground(new java.awt.Color(255, 255, 255));
		bDisplayRate = new javax.swing.JButton();
		tbReports.setBackground(new java.awt.Color(255, 255, 255));

		//JLABEL
		lAccount = new javax.swing.JLabel();
		lAccount.setBounds(3, 3, 130, 106);
		lAccount.setHorizontalAlignment(SwingConstants.CENTER);
		lAccount.setVerticalTextPosition(JLabel.BOTTOM);
		lAccount.setVerticalTextPosition(SwingConstants.BOTTOM);
		lAccount.setHorizontalTextPosition(SwingConstants.CENTER);
		lAccount.setFont(new java.awt.Font("Segoe Print", java.awt.Font.BOLD, 14));
		lAccount.setForeground(new java.awt.Color(255, 255, 255));
		lAccount.setIcon(new ImageIcon(Home.class.getResource("/icon/login2.png")));
		sessionPanel.add(lAccount);

		lDate = new javax.swing.JLabel();
		lDate.setBounds(275, 10, 147, 40);
		lDate.setIcon(new ImageIcon(Home.class.getResource("/icon/common/data.png")));
		lDate.setForeground(new java.awt.Color(255, 255, 255));
		lDate.setFont(new java.awt.Font("Lucida Console", java.awt.Font.BOLD, 16));
		sessionPanel.add(lDate);

		lTime = new javax.swing.JLabel();
		lTime.setBounds(275, 61, 147, 40);
		lTime.setIcon(new ImageIcon(Home.class.getResource("/icon/common/ora.png")));
		lTime.setForeground(new java.awt.Color(255, 255, 255));
		lTime.setFont(new java.awt.Font("Lucida Console", java.awt.Font.BOLD, 16));
		sessionPanel.add(lTime);

		lSubjekti = new javax.swing.JLabel();
		lSubjekti.setForeground(new java.awt.Color(255, 255, 255));
		lSubjekti.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));

		lAdresa = new javax.swing.JLabel();
		lAdresa.setForeground(new java.awt.Color(255, 255, 255));
		lAdresa.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));

		lNipt = new javax.swing.JLabel();
		lNipt.setForeground(new java.awt.Color(255, 255, 255));
		lNipt.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));

		lCel = new javax.swing.JLabel();
		lCel.setForeground(new java.awt.Color(255, 255, 255));
		lCel.setFont(new Font("Berlin Sans FB Demi", Font.BOLD, 18));

		lGiff = new javax.swing.JLabel();
		lGiff.setHorizontalAlignment(SwingConstants.RIGHT);
		lGiff.setIcon(new ImageIcon(Home.class.getResource("/icon/giff/borsa.gif")));

		lData = new javax.swing.JLabel("");
		lData.setForeground(new java.awt.Color(240, 199, 5));
		lData.setFont(new java.awt.Font("Segoe Script", java.awt.Font.BOLD, 45));
		lData.setHorizontalAlignment(SwingConstants.CENTER);

		lBackgroundImage = new javax.swing.JLabel();
		lBackgroundImage.setHorizontalAlignment(SwingConstants.CENTER);

		//setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		this.addWindowListener(new java.awt.event.WindowAdapter() {
			@Override
			public void windowClosing(java.awt.event.WindowEvent windowEvent) {
				sessionController.finishSession(currentSession);
				System.exit(0);
				System.gc();
			}
		});

		JButton logOut = new JButton();
		logOut.setBackground(Color.BLUE);
		logOut.setFont(new java.awt.Font("Arial", Font.BOLD, 11));
		//logOut.setText("LOG OUT");
		logOut.setText("<html> <b>NDRYSHO OPERATOR</b></html>");
		logOut.setHorizontalAlignment(SwingConstants.CENTER);
		logOut.setIcon(new ImageIcon(Home.class.getResource("/icon/change32.png")));
		logOut.setRolloverIcon(new ImageIcon(Home.class.getResource("/icon/change32.png")));
		logOut.setBounds(141, 32, 118, 40);
		logOut.setForeground(Color.WHITE);
		logOut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				logOut.setBackground(new Color(255,255,255));
				logOut.setText("");
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				logOut.setBackground(Color.BLUE);
				logOut.setText("<html><b>NDRYSHO OPERATOR</b></html>");
			}
		});

		sessionPanel.add(logOut);
		logOut.addMouseListener(new MouseAdapter()  {  
			public void mouseClicked(MouseEvent e)   {  

				sessionController.finishSession(currentSession);
				dispose();

				try {
					for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
						if ("Nimbus".equals(info.getName())) {
						    //javax.swing.UIManager.setLookAndFeel(info.getClassName());
							javax.swing.UIManager.setLookAndFeel( new FlatMacLightLaf());
        			        UIManager.put("TabbedPane.selectedBackground", new Color(0, 122, 255));
        			        UIManager.put("TabbedPane.selectedForeground", Color.WHITE);
        			        UIManager.put("TabbedPane.background", Color.WHITE);
        			        UIManager.put("TabbedPane.hoverColor", new Color(0, 122, 255));
        			        UIManager.put("TabbedPane.focusColor", new Color(0, 122, 255));
        			        UIManager.put("TabbedPane.contentAreaColor", Color.WHITE);
        			        UIManager.put("TabbedPane.tabAreaBackground", Color.WHITE);
        					break;  
						}
					}
				} catch (javax.swing.UnsupportedLookAndFeelException ex) {
					java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
				}

				java.awt.EventQueue.invokeLater(new Runnable() {
					public void run() {
						new Login().setVisible(true);
					}
				});

			}  
		}); 

		//JToggleButton
		home_bnt_grp.add(tbPos);
		tbPos.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbPos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/card-machine32.png"))); // NOI18N
		tbPos.setText("POS");
		tbPos.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbPos.setHorizontalTextPosition(SwingConstants.CENTER);
		tbPos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadPos(evt, panel_load, user, currentCompany, tbRate);
			}
		});

		home_bnt_grp.add(tbRate);
		tbRate.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbRate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/rate.png"))); // NOI18N
		tbRate.setText("Kursi i Dites");
		tbRate.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbRate.setHorizontalTextPosition(SwingConstants.CENTER);
		tbRate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadRate(evt, panel_load, user);
			}
		});

		home_bnt_grp.add(tbSales);
		tbSales.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbSales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/sales.png"))); // NOI18N
		tbSales.setText("Shitjet");
		tbSales.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbSales.setHorizontalTextPosition(SwingConstants.CENTER);
		tbSales.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {

				Loading frame = new Loading();
				frame.setVisible(true);

				Timer tfTimer = new Timer();
				TimerTask timerTask = new TimerTask() {

					@Override
					public void run() {
						homeController.loadSales(evt, panel_load, user, currentCompany);
						frame.setVisible(false);
						frame.dispose();
					}
				};

				tfTimer = new Timer();
				tfTimer.schedule(timerTask, 50);
			}
		});

		home_bnt_grp.add(tbStrongBox);
		tbStrongBox.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbStrongBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/deposit.png"))); // NOI18N
		tbStrongBox.setText("Arka");
		tbStrongBox.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbStrongBox.setHorizontalTextPosition(SwingConstants.CENTER);
		tbStrongBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadStrongBox(evt, panel_load, user);
			}
		});

		home_bnt_grp.add(tbUsers);
		tbUsers.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/users32.png"))); // NOI18N
		tbUsers.setText("Perdoruesit");
		tbUsers.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbUsers.setHorizontalTextPosition(SwingConstants.CENTER);
		tbUsers.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadUsers(evt, panel_load);
			}
		});

		home_bnt_grp.add(tbSettings);
		tbSettings.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/settings24.png"))); // NOI18N
		tbSettings.setText("Settings");
		tbSettings.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbSettings.setHorizontalTextPosition(SwingConstants.CENTER);
		tbSettings.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadSettingsView(evt, panel_load);
			}
		});

		home_bnt_grp.add(tbStats);
		tbStats.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15)); // NOI18N
		tbStats.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/home/statistika.png"))); // NOI18N
		tbStats.setText("Statistika");
		tbStats.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbStats.setHorizontalTextPosition(SwingConstants.CENTER);
		tbStats.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadStats(evt, panel_load);
			}
		});

		home_bnt_grp.add(tbReports);
		tbReports.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		tbReports.setIcon(new ImageIcon(Home.class.getResource("/icon/home/reports.png")));
		tbReports.setText("Raporte");
		tbReports.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbReports.setHorizontalTextPosition(SwingConstants.CENTER);
		tbReports.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.loadReports(evt, panel_load);
			}
		});

		//home_bnt_grp.add(tbExcel);
		tbExcel.setText("Excel");
		tbExcel.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		tbExcel.setIcon(new ImageIcon(Home.class.getResource("/icon/home/excel-3-32.png")));
		tbExcel.setVerticalTextPosition(SwingConstants.BOTTOM);
		tbExcel.setHorizontalTextPosition(SwingConstants.CENTER);
		tbExcel.setBackground(new java.awt.Color(255,255,255));
		tbExcel.setForeground(new java.awt.Color(23,43,77));
		tbExcel.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				tbExcel.setBackground(new java.awt.Color(44, 62, 80));
				tbExcel.setForeground(new java.awt.Color(255,255,255));
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				tbExcel.setBackground(new java.awt.Color(255,255,255));
				tbExcel.setForeground(new java.awt.Color(23,43,77));
			}
		});
		tbExcel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				homeController.openExcel();
			}
		});

		bDisplayRate.setText("Display rate");
		bDisplayRate.setFont(new java.awt.Font("Tahoma", java.awt.Font.BOLD, 15));
		bDisplayRate.setIcon(new ImageIcon(Home.class.getResource("/icon/home/dispaly-rate.png")));
		bDisplayRate.setVerticalTextPosition(SwingConstants.BOTTOM);
		bDisplayRate.setHorizontalTextPosition(SwingConstants.CENTER);
		bDisplayRate.setBackground(new java.awt.Color(255,255,255));
		bDisplayRate.setForeground(new java.awt.Color(23,43,77));
		bDisplayRate.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				bDisplayRate.setBackground(new java.awt.Color(44, 62, 80));
				bDisplayRate.setForeground(new java.awt.Color(255,255,255));
			}
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				bDisplayRate.setBackground(new java.awt.Color(255,255,255));
				bDisplayRate.setForeground(new java.awt.Color(23,43,77));
			}
		});
		bDisplayRate.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					homeController.OpenDisplayRate(currentCompany);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout gl_buttonPanel = new javax.swing.GroupLayout(buttonPanel);
		gl_buttonPanel.setHorizontalGroup(
				gl_buttonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanel.createSequentialGroup()
						.addContainerGap()
						.addGroup(gl_buttonPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(tbPos, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbRate, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbStrongBox, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbSales, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbUsers, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbSettings, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbStats, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbReports, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(tbExcel, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE)
								.addComponent(bDisplayRate, GroupLayout.PREFERRED_SIZE, 150, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		gl_buttonPanel.setVerticalGroup(
				gl_buttonPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_buttonPanel.createSequentialGroup()
						.addGap(8)
						.addComponent(tbPos, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbRate, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbStrongBox, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbSales, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbUsers, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbSettings, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbStats, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbReports, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(tbExcel, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(bDisplayRate, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		buttonPanel.setLayout(gl_buttonPanel);

		javax.swing.GroupLayout panel_loadLayout = new javax.swing.GroupLayout(panel_load);
		panel_loadLayout.setHorizontalGroup(
				panel_loadLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(lData, GroupLayout.DEFAULT_SIZE, 1132, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, panel_loadLayout.createSequentialGroup()
						.addGap(35)
						.addComponent(lBackgroundImage, GroupLayout.DEFAULT_SIZE, 1101, Short.MAX_VALUE)
						.addGap(25))
				);
		panel_loadLayout.setVerticalGroup(
				panel_loadLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(panel_loadLayout.createSequentialGroup()
						.addComponent(lData, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
						.addGap(25)
						.addComponent(lBackgroundImage, GroupLayout.PREFERRED_SIZE, 460, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(25, Short.MAX_VALUE))
				);
		panel_load.setLayout(panel_loadLayout);

		javax.swing.GroupLayout gl_headerPanel = new javax.swing.GroupLayout(headerPanel);
		gl_headerPanel.setHorizontalGroup(
				gl_headerPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_headerPanel.createSequentialGroup()
						.addComponent(sessionPanel, GroupLayout.PREFERRED_SIZE, 432, GroupLayout.PREFERRED_SIZE)
						.addGap(100)
						.addGroup(gl_headerPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lAdresa, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
								.addComponent(lSubjekti, GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
						.addPreferredGap(ComponentPlacement.RELATED)
						.addGroup(gl_headerPanel.createParallelGroup(Alignment.TRAILING)
								.addComponent(lCel, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
								.addComponent(lNipt, GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
						.addGap(18)
						.addComponent(lGiff))
				);
		gl_headerPanel.setVerticalGroup(
				gl_headerPanel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_headerPanel.createSequentialGroup()
						.addGap(5)
						.addGroup(gl_headerPanel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_headerPanel.createSequentialGroup()
										.addComponent(lNipt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
										.addComponent(lCel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_headerPanel.createSequentialGroup()
										.addComponent(lSubjekti, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
										.addGap(21)
										.addComponent(lAdresa, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)))
						.addGap(5))
				.addComponent(lGiff, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
				.addComponent(sessionPanel, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
				);
		headerPanel.setLayout(gl_headerPanel);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addGroup(layout.createParallelGroup(Alignment.LEADING)
								.addComponent(headerPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addGroup(layout.createSequentialGroup()
										.addComponent(buttonPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED)
										.addComponent(panel_load, GroupLayout.DEFAULT_SIZE, 1199, Short.MAX_VALUE)))
						.addContainerGap())
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap()
						.addComponent(headerPanel, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
						.addGap(8)
						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(buttonPanel, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE)
								.addComponent(panel_load, GroupLayout.PREFERRED_SIZE, 670, GroupLayout.PREFERRED_SIZE))
						.addContainerGap())
				);
		getContentPane().setLayout(layout);

		pack();
	}// </editor-fold>//GEN-END:initComponents


	// Variables declaration - do not modify//GEN-BEGIN:variables
	//JPANEL
	private javax.swing.JPanel buttonPanel;
	private javax.swing.JPanel headerPanel;
	private javax.swing.JPanel sessionPanel;
	private javax.swing.JPanel panel_load;
	//JTOGGLEBUTTON
	private javax.swing.ButtonGroup home_bnt_grp;
	private javax.swing.JToggleButton tbPos;
	private javax.swing.JToggleButton tbRate;
	private javax.swing.JToggleButton tbSales;
	private javax.swing.JToggleButton tbStrongBox;
	private javax.swing.JToggleButton tbUsers;
	private javax.swing.JToggleButton tbSettings;
	private javax.swing.JToggleButton tbStats;
	private javax.swing.JToggleButton tbReports;
	//JBUTTON
	private javax.swing.JButton tbExcel;
	private javax.swing.JButton bDisplayRate;
	//JLABEL
	private javax.swing.JLabel lBackgroundImage;
	private javax.swing.JLabel lData;
	private javax.swing.JLabel lAccount;
	private javax.swing.JLabel lSubjekti;
	private javax.swing.JLabel lAdresa;
	private javax.swing.JLabel lNipt;
	private javax.swing.JLabel lCel;
	private javax.swing.JLabel lDate;
	private javax.swing.JLabel lTime;
	private javax.swing.JLabel lGiff;
	
	// TRIAL MODE
	/*private String QUERY = "SELECT MAX( id_sale ) FROM sale";
	public int maxTrialSale() throws SQLException {

		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(QUERY);
		ResultSet rs= pstmt.executeQuery();
		int count = 0;
		while (rs.next()) {
			count = rs.getInt(1);
		}
		return count;
	}
	
	public void checkValidity(javax.swing.JToggleButton tbPos, javax.swing.JToggleButton tbSales) throws SQLException {
		int maxTrial = maxTrialSale();
		
		if ( maxTrial > 100000 ) {
			tbPos.setEnabled(false);
			tbSales.setEnabled(false);
			
			JLabel error = new JLabel();
			error.setFont(new Font("Calibri", Font.BOLD, 12));
			error.setForeground(Color.BLACK);
			error.setText("<html><b>KOHA E PROVES PERFUNDOI!</b></html>");
			JOptionPane.showMessageDialog(null, error, "AKTIVOZO SOFTWARE-IN!", JOptionPane.ERROR_MESSAGE);
			
		  }
	}*/
}
