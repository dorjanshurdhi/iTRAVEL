package com.cindytech.itravel.view;

import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import com.cindytech.itravel.controller.HomeController;
//import com.cindytech.itravel.controller.StrongBoxController;
import com.cindytech.itravel.controller.FirstSetupController;
import com.cindytech.itravel.model.Company;
import com.cindytech.itravel.model.Settings;
import com.cindytech.itravel.model.User;
import com.cindytech.itravel.utils.ColorLayout;
import com.cindytech.itravel.utils.JpanelLoader;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import java.awt.Font;

/**
 *
 * @author Dorjan Shurdhi
 */
public class FirstSetup extends javax.swing.JFrame {

	private static final long serialVersionUID = 4946032016174712209L;

	HomeController homeController = new HomeController();
	FirstSetupController firstSetupController = new FirstSetupController();
	JpanelLoader jpload = new JpanelLoader();
	Company company = new Company();
	CompanyInfo companyInfo = new CompanyInfo();
	FirstUser firstUser = new FirstUser();
	//FirstBoxMoney firstBoxMoney = new FirstBoxMoney();
	//StrongBoxController strongboxController = new StrongBoxController();
	Settings settings = new Settings();
	int i = 1;
	
	ColorLayout colorLayout = new ColorLayout();
	Color bg = colorLayout.getBackgroundColor();
	Color fg = new Color(255, 92, 51);

	public FirstSetup() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(FirstSetup.class.getResource("/icon/login.png")));
		//getContentPane().setBackground(new Color(60, 63, 65));
		initComponents();
		jpload.jPanelLoader(panelLoad, companyInfo);
		setLocationRelativeTo(null);

	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	private void initComponents() {

		mainPanel = new javax.swing.JPanel();
		mainPanel.setBackground(bg);
		panelLoad = new javax.swing.JPanel();
		lHeader = new javax.swing.JLabel();
		
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		mainPanel.setPreferredSize(new java.awt.Dimension(400, 460));

		panelLoad.setBackground(new java.awt.Color(255, 255, 255));
		panelLoad.setMaximumSize(new java.awt.Dimension(350, 375));
		panelLoad.setMinimumSize(new java.awt.Dimension(350, 375));
		panelLoad.setPreferredSize(new java.awt.Dimension(350, 375));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(panelLoad);
		panelLoad.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 391, Short.MAX_VALUE)
				);
		jPanel3Layout.setVerticalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 391, Short.MAX_VALUE)
				);

		lHeader.setFont(new Font("Arial", Font.BOLD, 16)); // NOI18N
		lHeader.setForeground(new java.awt.Color(255, 255, 255));
		lHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		lHeader.setText("    Fut te Dhenat e Biznesit!");
		lHeader.setIcon(new ImageIcon(FirstSetup.class.getResource("/icon/settings/settings.png")));
		lHeader.setBackground(new java.awt.Color(51, 51, 51));


		bSave = new JButton("VAZHDO");
		bSave.setFont(new Font("Arial", Font.BOLD, 12));
		bSave.setBackground(Color.GREEN);
		bSave.setForeground(Color.WHITE);

		bSave.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				
				//ADD COMPANY INFO
				if (i==1) {
					homeController.insertCompanyInfo(companyInfo.getTfSubjekti(), companyInfo.getTfAdresa(), companyInfo.getTfNipt(), companyInfo.getTfCel());
					JpanelLoader jpload = new JpanelLoader();
					jpload.jPanelLoader(panelLoad, firstUser);	
					lHeader.setText("  Krijo Accountin tend Personal!");
					lHeader.setIcon(new ImageIcon(FirstSetup.class.getResource("/icon/home/account.png")));
					
				} 

				//ADD FIRST STRONGBOX MONEY
				if (i==2) {
					JpanelLoader jpload = new JpanelLoader();
					//jpload.jPanelLoader(panelLoad, firstBoxMoney);	
					lHeader.setText("  Vendos Gjendjen e Arkes!");
					lHeader.setIcon(new ImageIcon(FirstSetup.class.getResource("/icon/home/account.png")));
				
				}
				
				if (i==3) {
					dispose();
					User currentUser=firstSetupController.insertFirstUser(firstUser.getTfEmri(), firstUser.getTfMbiemri(), firstUser.getTfUsername(), firstUser.getTfPassword());
					//strongboxController.addFirstAmount(currentUser.getUsername(), firstBoxMoney.getTfAmount());
					String isFirstLogin="NO";
					
					try {
				        
						settings.resetFirstLogin(isFirstLogin);
						company=company.getCompanyInfo();
						new Home(company, currentUser).setVisible(true);
					} catch (SQLException e) {
						e.printStackTrace();
					}
					
				}
				i++;

			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(mainPanel);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(lHeader, GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(jPanel2Layout.createSequentialGroup()
							.addComponent(panelLoad, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
							.addContainerGap())
						.addGroup(Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
							.addGap(150)
							.addComponent(bSave, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
							.addGap(150))))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lHeader, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(panelLoad, GroupLayout.PREFERRED_SIZE, 436, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(bSave, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		mainPanel.setLayout(jPanel2Layout);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(Alignment.LEADING)
				.addComponent(mainPanel, GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
				);
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
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FirstSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FirstSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FirstSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FirstSetup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FirstSetup().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify                     
	private javax.swing.JLabel lHeader;
	private javax.swing.JPanel mainPanel;
	private javax.swing.JPanel panelLoad;
	private JButton bSave;
	// End of variables declaration                   
}
