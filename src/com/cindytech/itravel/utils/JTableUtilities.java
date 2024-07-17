package com.cindytech.itravel.utils;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class JTableUtilities { 

	public static void setCellsAlignmentBoard(JTable table, Color column1, Color column2, Color column3){

		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		TableModel tableModel = table.getModel();

		DefaultTableCellRenderer valutaRenderer = new DefaultTableCellRenderer();
		valutaRenderer.setForeground(column1);
		valutaRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		DefaultTableCellRenderer buyRenderer = new DefaultTableCellRenderer();
		buyRenderer.setForeground(column2);
		buyRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		
		DefaultTableCellRenderer sellRenderer = new DefaultTableCellRenderer();
		sellRenderer.setForeground(column3);
		sellRenderer.setHorizontalAlignment(SwingConstants.CENTER);


		/*Object[][] rates = {
				   { tableModel.getValueAt(0, 0), tableModel.getValueAt(0, 1), tableModel.getValueAt(0, 2)},
				   { tableModel.getValueAt(1, 0), tableModel.getValueAt(1, 1), tableModel.getValueAt(1, 2)},
				   { tableModel.getValueAt(2, 0), tableModel.getValueAt(2, 1), tableModel.getValueAt(2, 2)},
				   { tableModel.getValueAt(3, 0), tableModel.getValueAt(3, 1), tableModel.getValueAt(3, 2)},
				   { tableModel.getValueAt(4, 0), tableModel.getValueAt(4, 1), tableModel.getValueAt(4, 2)},
				   { tableModel.getValueAt(5, 0), tableModel.getValueAt(5, 1), tableModel.getValueAt(5, 2)},
				};

		System.out.println(Arrays.deepToString(rates).replace("],","\n").replace(",","\t| ").replaceAll("[\\[\\]]", " "));*/

		for (int rowIndex = 0; rowIndex < tableModel.getRowCount(); rowIndex++)
			for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);

				if (rowIndex ==1 && columnIndex == 1) {
					//table.getColumnModel().getColumn(columnIndex).setCellRenderer(buyRenderer);
					table.contains(rowIndex, columnIndex);

					//Component cell = new Component();
					//Component cell = ((Component) table.getModel()).getComponentAt(rowIndex, columnIndex);
					//cell.setForeground(Color.BLUE);
				}
				if (columnIndex == 0) {
					table.getColumnModel().getColumn(columnIndex).setCellRenderer(valutaRenderer);
				}
				if (columnIndex == 1) {
					table.getColumnModel().getColumn(columnIndex).setCellRenderer(sellRenderer);
				}
				if (columnIndex == 2) {
					table.getColumnModel().getColumn(columnIndex).setCellRenderer(sellRenderer);
				}
			}
	}

	public static void setCellsAlignmentPos(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		headerRenderer.setFont(new java.awt.Font("Arial", Font.BOLD, 12));
		//headerRenderer.setForeground(new Color(204, 204,0));

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){

			if (columnIndex == 5 ||  columnIndex == 7 || columnIndex == 9 ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 || columnIndex == 6 || columnIndex == 8) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}

		}

		// Defines table's column width.
		int[] columnsWidth = { 10, 50, 100, 50, 50, 40, 50, 50, 50, 50 };

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentRate(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 4 || columnIndex == 5) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 ||columnIndex == 3) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
		}

		int[] columnsWidth = { 100, 60, 50, 50, 40, 40 };
		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			/*for (int maxWidth : columnsMaxWidth) {
				column.setMaxWidth(maxWidth);
			}*/
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentSale(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer) table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();

		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 || columnIndex == 7 || columnIndex == 8 || columnIndex == 10 || columnIndex == 11 || columnIndex == 12) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
			if (columnIndex == 5 || columnIndex == 6 || columnIndex == 9) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
		}

		// Defines table's column width.
		int[] columnsWidth = {5, 80, 40, 35, 40, 40, 30, 35, 35, 60, 50, 100};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentSaleLineItem(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 ||  columnIndex == 3) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
			if (columnIndex == 2) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}

		}

		// Defines table's column width.
		int[] columnsWidth = {70, 60, 50, 30};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}
	
	public static void setCellsAlignmentIndivid(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 || columnIndex == 5 || columnIndex == 6 || columnIndex == 7 || columnIndex == 8) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
		}

		int[] columnsWidth = { 10, 40, 40, 50, 50, 80, 60, 30, 50 };
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			column.setPreferredWidth(width);
		}
	}
	
	public static void setCellsAlignmentBiznes(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 || columnIndex == 5 || columnIndex == 6 || columnIndex == 7) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
		}

		int[] columnsWidth = { 10, 30, 60, 50, 50, 80, 60 };
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			column.setPreferredWidth(width);
		}
	}


	public static void setCellsAlignmentUsers(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 4 || columnIndex == 5) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
		}

		int[] columnsWidth = { 10, 70, 70, 70, 110, 40 };
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentStrongBoxHistory(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 0 || columnIndex == 1 || columnIndex == 2 || columnIndex == 5 || columnIndex == 6) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
			if (columnIndex == 3 || columnIndex == 4 ) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
		}

		// Defines table's column width.
		int[] columnsWidth = {100, 30, 30, 60, 60, 100, 140};

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}

	public static void setCellsAlignmentShtimTerheqje(JTable table){

		DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
		rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
		centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		headerRenderer = (DefaultTableCellRenderer)table.getTableHeader().getDefaultRenderer();
		headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);

		TableModel tableModel = table.getModel();
		for (int columnIndex = 0; columnIndex < tableModel.getColumnCount(); columnIndex++){
			if (columnIndex == 1 || columnIndex == 2 || columnIndex == 3 || columnIndex == 6 || columnIndex == 4 || columnIndex == 5) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(rightRenderer);
			}
			if (columnIndex == 0) {
				table.getColumnModel().getColumn(columnIndex).setCellRenderer(centerRenderer);
			}
		}

		// Defines table's column width.
		int[] columnsWidth = { 30, 85, 85,85, 85, 85, 100 };

		// Configures table's column width.
		int i = 0;
		for (int width : columnsWidth) {
			TableColumn column = table.getColumnModel().getColumn(i++);
			column.setMinWidth(width);
			//column.setMaxWidth(width);
			column.setPreferredWidth(width);
		}
	}
}