package com.cindytech.itravel.utils;

public class ColorToggleButton extends javax.swing.JToggleButton {

	private static final long serialVersionUID = 1L;

	public void paintComponent(java.awt.Graphics g) {

		java.awt.Color bg, text;
		if(isSelected()) {
			bg = new java.awt.Color(0, 122, 255);
			text = new java.awt.Color(255, 255, 255);
		} else {
			bg = new java.awt.Color(255, 255, 255);
			text = new java.awt.Color(44, 62, 80);
		}

		setBackground(bg);
		setForeground(text);
		super.paintComponent(g);
	}
}
