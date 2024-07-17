/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cindytech.itravel.view;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

import com.cindytech.itravel.utils.ColorLayout;

import java.awt.Dimension;
import java.awt.Font;

/**
 *
 * @author ShurdhiDo
 */
public class CompanyInfo extends javax.swing.JPanel {

	private static final long serialVersionUID = -6454853535622579718L;
	
	ColorLayout colorLayout = new ColorLayout();
	Color bg = colorLayout.getBackgroundColor();
	Color fg = new Color(255, 92, 51);

    public CompanyInfo() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(bg);
        lAdresa = new javax.swing.JLabel();
        lSubjekti = new javax.swing.JLabel();
        tfSubjekti = new javax.swing.JTextField();
        tfAdresa = new javax.swing.JTextField();
        lNipt = new javax.swing.JLabel();
        tfCel = new javax.swing.JTextField();
        tfCel.setFont(new Font("Arial", Font.BOLD, 12));
        tfNipt = new javax.swing.JTextField();
        tfNipt.setFont(new Font("Arial", Font.BOLD, 12));
        lCel = new javax.swing.JLabel();

        setBackground(bg);
        setMaximumSize(new java.awt.Dimension(391, 391));
        setMinimumSize(new java.awt.Dimension(391, 391));
        setPreferredSize(new Dimension(391, 391));

        lAdresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lAdresa.setForeground(new java.awt.Color(255, 255, 255));
        lAdresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lAdresa.setText("Adresa");
        lAdresa.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        lSubjekti.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lSubjekti.setForeground(new java.awt.Color(255, 255, 255));
        lSubjekti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lSubjekti.setText("Subjekti");
        lSubjekti.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tfSubjekti.setBackground(new java.awt.Color(255, 255, 255));
        tfSubjekti.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfSubjekti.setForeground(new java.awt.Color(51, 51, 51));
        tfSubjekti.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfAdresa.setBackground(new java.awt.Color(255, 255, 255));
        tfAdresa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        tfAdresa.setForeground(new java.awt.Color(51, 51, 51));
        tfAdresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lNipt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lNipt.setForeground(new java.awt.Color(255, 255, 255));
        lNipt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lNipt.setText("Nipt");
        lNipt.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        tfCel.setBackground(new java.awt.Color(255, 255, 255));
        tfCel.setForeground(new java.awt.Color(51, 51, 51));
        tfCel.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tfNipt.setBackground(new java.awt.Color(255, 255, 255));
        tfNipt.setForeground(new java.awt.Color(51, 51, 51));
        tfNipt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfNipt.setToolTipText("");

        lCel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lCel.setForeground(new java.awt.Color(255, 255, 255));
        lCel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lCel.setText("Cel");
        lCel.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(lNipt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(tfCel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(tfNipt, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(tfAdresa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(tfSubjekti, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(lCel, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(lAdresa, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
        				.addComponent(lSubjekti, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(lSubjekti, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(tfSubjekti, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lAdresa, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(2)
        			.addComponent(tfAdresa, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lNipt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(4)
        			.addComponent(tfNipt, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lCel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
        			.addGap(2)
        			.addComponent(tfCel, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap())
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(50)
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
        			.addGap(50))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(40)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(38, Short.MAX_VALUE))
        );
        this.setLayout(layout);
    }// </editor-fold>                        
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lAdresa;
    private javax.swing.JLabel lCel;
    private javax.swing.JLabel lNipt;
    private javax.swing.JLabel lSubjekti;
    private javax.swing.JTextField tfAdresa;
    private javax.swing.JTextField tfCel;
    private javax.swing.JTextField tfNipt;
    private javax.swing.JTextField tfSubjekti;
    // End of variables declaration     
    
    
	public javax.swing.JTextField getTfAdresa() {
		return tfAdresa;
	}

	public void setTfAdresa(javax.swing.JTextField tfAdresa) {
		this.tfAdresa = tfAdresa;
	}

	public javax.swing.JTextField getTfCel() {
		return tfCel;
	}

	public void setTfCel(javax.swing.JTextField tfCel) {
		this.tfCel = tfCel;
	}

	public javax.swing.JTextField getTfNipt() {
		return tfNipt;
	}

	public void setTfNipt(javax.swing.JTextField tfNipt) {
		this.tfNipt = tfNipt;
	}

	public javax.swing.JTextField getTfSubjekti() {
		return tfSubjekti;
	}

	public void setTfSubjekti(javax.swing.JTextField tfSubjekti) {
		this.tfSubjekti = tfSubjekti;
	}
}
