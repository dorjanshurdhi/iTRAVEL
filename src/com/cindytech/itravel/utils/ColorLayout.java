package com.cindytech.itravel.utils;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

import com.cindytech.itravel.model.Settings;

public class ColorLayout {

	Settings settings = new Settings();

	public ColorLayout() {}

	//COLORI
	Color BLACK = new Color(0, 0, 0);
	Color WHITE = new Color(255, 255, 255);
	Color RED = new Color(255, 0, 0);
	Color DARK_GREY = Color.DARK_GRAY;

	//Background
	Color backgroundPanel = new Color(23,43,77);
	Color foregroundPanel = new Color(157, 173, 189);
	Color headerColor = new Color(30, 39, 46);

	//MAC BLUE
	//Color backgroundPanel = new Color(0, 61, 153);
	//Color foregroundPanel = new Color(157, 173, 189);
	//Color headerColor = new Color(30, 39, 46);

	public Color getBackgroundColor() {
		return backgroundPanel;
	}

	public Color getForegroundColor() {
		return Color.WHITE;
	}

	public Color getBlueColor() {
		return Color.BLUE;
	}

	public Color getHeaderColor() {
		return headerColor ;
	}


	//PRINT BUTTON
	public Color getBackgroundPrintButtonColor() {
		return new Color(0, 61, 153);
	}
	public Color getForegroundPrintButtonColor() {
		return new Color(255, 255, 255);
	}

	/*
	 * public void setDisplayRateColor(JTable rateTable, JPanel tablePanel, JPanel
	 * framePanel, JPanel panelTitle, JPanel movingTextpanel, JLabel lData) { String
	 * tema = "LIGHT"; try { tema = settings.getTheme(); } catch (SQLException e) {
	 * e.printStackTrace(); }
	 * 
	 * if (rateTable != null && rateTable.getModel().getRowCount() > 0) { if
	 * (tema.equals("DARK")) { //BLACK
	 * //rateTable.getTableHeader().setBackground(headerColor); //HEADER
	 * JTableHeader header = rateTable.getTableHeader(); Font customFont35 = new
	 * Font("Arial", Font.BOLD, 35); Color headerColor = new java.awt.Color(0, 2,
	 * 97); int center = SwingConstants.CENTER; int preferredHeaderHeight = 60;
	 * header.setDefaultRenderer(new CustomHeader(customFont35, WHITE, BLACK,
	 * center, preferredHeaderHeight, Color.GREEN)); header.setForeground(WHITE);
	 * header.setBackground(BLACK);
	 * 
	 * CustomTableCellRenderer column0 = new CustomTableCellRenderer(0,
	 * customFont35, WHITE, center); CustomTableCellRenderer column1 = new
	 * CustomTableCellRenderer(1, customFont35, WHITE, center);
	 * CustomTableCellRenderer column2 = new CustomTableCellRenderer(2,
	 * customFont35, WHITE, center);
	 * rateTable.getColumnModel().getColumn(0).setCellRenderer(column0);
	 * rateTable.getColumnModel().getColumn(1).setCellRenderer(column1);
	 * rateTable.getColumnModel().getColumn(2).setCellRenderer(column2);
	 * rateTable.setBackground(BLACK); rateTable.setGridColor(Color.DARK_GRAY);
	 * tablePanel.setBorder(new LineBorder(WHITE));
	 * JTableUtilities.setCellsAlignmentBoard(rateTable, WHITE, WHITE, WHITE);
	 * 
	 * tablePanel.setForeground(WHITE); tablePanel.setBackground(BLACK);
	 * 
	 * framePanel.setForeground(WHITE); framePanel.setBackground(BLACK);
	 * 
	 * panelTitle.setBackground(headerColor); movingTextpanel.setBackground(BLACK);
	 * 
	 * lData.setForeground(WHITE); } else { if (!tema.equals("DARK")) { //BLACK
	 * //rateTable.getTableHeader().setBackground(headerColor); //HEADER
	 * JTableHeader header = rateTable.getTableHeader(); Font customFont35 = new
	 * Font("Arial", Font.BOLD, 35); //Color headerColor = new java.awt.Color(0, 2,
	 * 97); int center = SwingConstants.CENTER; int preferredHeaderHeight = 60;
	 * header.setDefaultRenderer(new CustomHeader(customFont35, DARK_GREY, WHITE,
	 * center, preferredHeaderHeight, RED)); header.setForeground(BLACK);
	 * header.setBackground(WHITE);
	 * 
	 * CustomTableCellRenderer column0 = new CustomTableCellRenderer(0,
	 * customFont35, WHITE, center); CustomTableCellRenderer column1 = new
	 * CustomTableCellRenderer(1, customFont35, WHITE, center);
	 * CustomTableCellRenderer column2 = new CustomTableCellRenderer(2,
	 * customFont35, WHITE, center);
	 * rateTable.getColumnModel().getColumn(0).setCellRenderer(column0);
	 * rateTable.getColumnModel().getColumn(1).setCellRenderer(column1);
	 * rateTable.getColumnModel().getColumn(2).setCellRenderer(column2);
	 * rateTable.setBackground(WHITE); rateTable.setGridColor(Color.LIGHT_GRAY);
	 * tablePanel.setBorder(new LineBorder(WHITE));
	 * JTableUtilities.setCellsAlignmentBoard(rateTable, DARK_GREY, RED, RED);
	 * 
	 * tablePanel.setForeground(BLACK); tablePanel.setBackground(WHITE);
	 * 
	 * framePanel.setForeground(BLACK); framePanel.setBackground(WHITE);
	 * 
	 * panelTitle.setBackground(RED); movingTextpanel.setBackground(WHITE);
	 * 
	 * lData.setForeground(Color.DARK_GRAY); } // Force repaint of components
	 * rateTable.repaint(); tablePanel.repaint(); framePanel.repaint();
	 * panelTitle.repaint(); movingTextpanel.repaint(); lData.repaint(); } }else {
	 * System.out.println("La rateTable è vuota o null."); } }
	 */
}

class CustomHeader extends DefaultTableCellRenderer {

	private static final long serialVersionUID = 1L;
	private Font customFont;
	private Color textColor;
	private Color backgroundColor;
	private int textAlignment;
	private int preferredHeight;
	private Color gridColor;

	public CustomHeader(Font customFont, Color textColor, Color backgroundColor, int textAlignment, int preferredHeight, Color gridColor) {
		this.customFont = customFont;
		this.textColor = textColor;
		this.backgroundColor = backgroundColor;
		this.textAlignment = textAlignment;
		this.preferredHeight = preferredHeight;
		this.gridColor = gridColor;
	}

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {

		Component headerComponent = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
		headerComponent.setFont(customFont);
		headerComponent.setForeground(textColor);
		headerComponent.setBackground(backgroundColor);
		((JLabel) headerComponent).setHorizontalAlignment(textAlignment);
		table.getTableHeader().setPreferredSize(new Dimension(table.getTableHeader().getWidth(), preferredHeight));
		super.setBorder(BorderFactory.createMatteBorder(0, 0, 5, 0, gridColor));
		return headerComponent;
	}
}

