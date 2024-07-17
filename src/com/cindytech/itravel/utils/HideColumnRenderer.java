package com.cindytech.itravel.utils;

import java.awt.Component;

import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.*;

public class HideColumnRenderer extends DefaultTableCellRenderer {
	
	private static final long serialVersionUID = 1L;

	 @Override
	    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
	        Component renderer = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
	        
	        // Nascondi il contenuto della colonna
	        setText("***********");
	        
	        // Imposta l'allineamento al centro
	        setHorizontalAlignment(SwingConstants.CENTER);
	        setFont(new java.awt.Font("Arial", 1, 20));
	        
	        return renderer;
	    }
}

