
package com.cindytech.itravel.view;

import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.cindytech.itravel.utils.ColorLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

/**
 *
 * @author ShurdhiDo
 */
public class FirstUser extends javax.swing.JPanel {

	private static final long serialVersionUID = -2698322056706431401L;
	
	ColorLayout colorLayout = new ColorLayout();
	Color bg = colorLayout.getBackgroundColor();
	Color fg = new Color(255, 92, 51);
	
	public FirstUser() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(bg);
        lMbiemri = new javax.swing.JLabel();
        lEmri = new javax.swing.JLabel();
        tfEmri = new javax.swing.JTextField();
        tfMbiemri = new javax.swing.JTextField();
        lUsername = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        tfPassword.setFont(new Font("Arial", Font.BOLD, 12));
        tfUsername = new javax.swing.JTextField();
        tfUsername.setFont(new Font("Arial", Font.BOLD, 12));
        lPassword = new javax.swing.JLabel();

        setBackground(bg);
        setMaximumSize(new java.awt.Dimension(391, 391));
        setMinimumSize(new java.awt.Dimension(391, 391));
        setPreferredSize(new Dimension(391, 366));

        lMbiemri.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lMbiemri.setForeground(new java.awt.Color(255, 255, 255));
        lMbiemri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lMbiemri.setText("Mbiemri");
        lMbiemri.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lEmri.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lEmri.setForeground(new java.awt.Color(255, 255, 255));
        lEmri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lEmri.setText("Emri");
        lEmri.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tfEmri.setBackground(new java.awt.Color(255, 255, 255));
        tfEmri.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfEmri.setForeground(new java.awt.Color(51, 51, 51));
        tfEmri.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfMbiemri.setBackground(new java.awt.Color(255, 255, 255));
        tfMbiemri.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfMbiemri.setForeground(new java.awt.Color(51, 51, 51));
        tfMbiemri.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lUsername.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lUsername.setForeground(new java.awt.Color(255, 255, 255));
        lUsername.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lUsername.setText("Username");
        lUsername.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tfPassword.setBackground(new java.awt.Color(255, 255, 255));
        tfPassword.setForeground(new java.awt.Color(51, 51, 51));
        tfPassword.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfUsername.setBackground(new java.awt.Color(255, 255, 255));
        tfUsername.setForeground(new java.awt.Color(51, 51, 51));
        tfUsername.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfUsername.setToolTipText("");

        lPassword.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lPassword.setForeground(new java.awt.Color(255, 255, 255));
        lPassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lPassword.setText("Password");
        lPassword.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lPassword, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(tfMbiemri, 271, 271, 271)
        				.addComponent(tfUsername, 271, 271, 271)
        				.addComponent(tfPassword, 271, 271, 271)
        				.addComponent(tfEmri, 271, 271, 271)
        				.addComponent(lMbiemri, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(lUsername, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(lEmri, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lEmri, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tfEmri, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lMbiemri, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(2)
        			.addComponent(tfMbiemri, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lUsername, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(4)
        			.addComponent(tfUsername, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lPassword, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(2)
        			.addComponent(tfPassword, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addGap(20))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        			.addGap(50))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 322, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(67, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>                        
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lEmri;
    private javax.swing.JLabel lMbiemri;
    private javax.swing.JLabel lPassword;
    private javax.swing.JLabel lUsername;
    private javax.swing.JTextField tfEmri;
    private javax.swing.JTextField tfMbiemri;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration                   
	public javax.swing.JTextField getTfEmri() {
		return tfEmri;
	}

	public void setTfEmri(javax.swing.JTextField tfEmri) {
		this.tfEmri = tfEmri;
	}

	public javax.swing.JTextField getTfMbiemri() {
		return tfMbiemri;
	}

	public void setTfMbiemri(javax.swing.JTextField tfMbiemri) {
		this.tfMbiemri = tfMbiemri;
	}

	public javax.swing.JTextField getTfPassword() {
		return tfPassword;
	}

	public void setTfPassword(javax.swing.JTextField tfPassword) {
		this.tfPassword = tfPassword;
	}

	public javax.swing.JTextField getTfUsername() {
		return tfUsername;
	}

	public void setTfUsername(javax.swing.JTextField tfUsername) {
		this.tfUsername = tfUsername;
	}
}
