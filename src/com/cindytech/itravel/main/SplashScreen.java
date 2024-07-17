package com.cindytech.itravel.main;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Toolkit;
import java.text.ParseException;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import com.cindytech.itravel.utils.ColorLayout;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.Dimension;
/**
 *
 * @author ShurdhiDo
 */
public class SplashScreen extends javax.swing.JFrame {

	private static final long serialVersionUID = 6296460579852059661L;
	/**
     * Creates new form SplashScreen
     */
	
	ColorLayout colorLayout = new ColorLayout();
	java.awt.Color bg = colorLayout.getBackgroundColor();
	java.awt.Color fg = colorLayout.getForegroundColor();
	java.awt.Color blue = colorLayout.getBlueColor();
	
    public SplashScreen() {
    	initComponents();
    	setResizable(false);
    	setIconImage(Toolkit.getDefaultToolkit().getImage(SplashScreen.class.getResource("/icon/splashscreen/loading.png")));
    	setLocationRelativeTo(null);
    	FlatMacLightLaf.setup();
       
    }

                         
    private void initComponents() {

    	//FRAME
    	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        
    	//JPANEL
        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBorder(new LineBorder(bg, 5));
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        
        //JPROGRESSBAR
        loadingProgress = new javax.swing.JProgressBar();
        loadingProgress.setEnabled(false);
        loadingProgress.setForeground(new java.awt.Color(0, 169, 160));
        loadingProgress.setBackground(new java.awt.Color(244,245,247));
        loadingProgress.setMaximumSize(new java.awt.Dimension(500, 5));
        loadingProgress.setMinimumSize(new java.awt.Dimension(500, 5));
        loadingProgress.setPreferredSize(new Dimension(500, 5));
       
        //JLABEL
        lComment = new javax.swing.JLabel();
        lComment.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lComment.setForeground(new java.awt.Color(0, 0, 0));
        lComment.setText("Loading ...");
        
        lLogo = new javax.swing.JLabel();
        lLogo.setIcon(new ImageIcon(SplashScreen.class.getResource("/icon/giff/world-travel-512.gif")));
        lLogo.setFont(new java.awt.Font("Script MT Bold", java.awt.Font.BOLD, 34));
        lLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        
        loadingNumber = new javax.swing.JLabel();
        loadingNumber.setHorizontalAlignment(SwingConstants.CENTER);
        loadingNumber.setFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 20)); // NOI18N
        loadingNumber.setForeground(new java.awt.Color(0, 0, 0));
        loadingNumber.setText("99");
        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(loadingProgress, GroupLayout.PREFERRED_SIZE, 440, Short.MAX_VALUE)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addComponent(lComment, GroupLayout.PREFERRED_SIZE, 367, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(loadingNumber, GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE))
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lLogo, GroupLayout.PREFERRED_SIZE, 420, Short.MAX_VALUE)
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lLogo, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lComment, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
        				.addComponent(loadingNumber, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
        			.addComponent(loadingProgress, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     * @throws ParseException 
     */
    public static void main(String args[]) throws ParseException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel settings code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

        try {
        	 UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        	//UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        	 //UIManager.setLookAndFeel( new FlatMacLightLaf() );
        	 //FlatMacLightLaf.setup();    
        } catch (UnsupportedLookAndFeelException e) {
    	    e.printStackTrace();
    	}

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lLogo;
    javax.swing.JLabel lComment;
    javax.swing.JLabel loadingNumber;
    javax.swing.JProgressBar loadingProgress;
    // End of variables declaration                   
}