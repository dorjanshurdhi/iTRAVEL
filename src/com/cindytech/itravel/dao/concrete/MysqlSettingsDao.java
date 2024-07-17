package com.cindytech.itravel.dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cindytech.itravel.dao.interfaces.SettingsDao;
import com.cindytech.itravel.daoFactory.DaoFactory;
import com.cindytech.itravel.model.Printer;

public class MysqlSettingsDao implements SettingsDao{
	private static int first_row = 1;
	//PRINTER SETTINGS
	private static final String SET_PRINTER = "UPDATE settings SET printerName = ? WHERE id = 1";
	private static final String SET_PRINTER_AND_PAPER = "UPDATE settings SET printerName = ? , paperSize = ? WHERE id = 1";
	private static final String GET_PRINTER = "SELECT printerName FROM settings WHERE id = 1";  
	private static final String GET_PRINTER_AND_PAPER = "SELECT printerName, paperSize FROM settings WHERE id = 1";

	//BOARD SETTINGS
	private static final String CURRENT_MESSAGE = "SELECT message FROM settings WHERE id = 1";
	private static final String SET_NEW_MESSAGE = "UPDATE settings SET message = ? WHERE id = 1";
	private static final String GET_SCREEN = "SELECT screen FROM settings WHERE id = '"+first_row+"'";
	private static final String SET_SCREEN = "UPDATE settings SET screen = ? WHERE id = '"+first_row+"'";

	//NEW_DAY SETTINGS
	private static final String CHECK_DAY = "SELECT isNewDay FROM settings WHERE id = 1";
	private static final String SET_NEW_DAY = "UPDATE settings SET isNewDay = ? WHERE id = 1";

	//NEW_YEAR SETTINGS
	private static final String CHECK_YEAR = "SELECT isNewYear FROM settings WHERE id = 1";
	private static final String SET_NEW_YEAR = "UPDATE settings SET isNewYear = ? WHERE id = 1";

	//FIRST LOGIN SETTINGS
	private static final String FIRST_LOGIN = "SELECT firstLogin FROM settings WHERE id = 1";
	private static final String SET_FIRST_LOGIN = "UPDATE settings SET firstLogin = ? WHERE id = 1";
	
	//DISPLAY RATE AUTOMATIC
	private static final String IS_ACTIVATED_AUTOMATIC_OPEN_DISPLAY_RATE = "SELECT activateOpenDisplayRate FROM settings WHERE id = 1";
	private static final String ACTIVATE_AUTOMATIC_OPEN_DISPLAY_RATE = "UPDATE settings SET activateOpenDisplayRate = ? WHERE id = 1";
	
	//DISPLAY RATE THEME
	private static final String GET_THEME = "SELECT theme FROM settings WHERE id = 1";
	private static final String SET_THEME = "UPDATE settings SET theme = ? WHERE id = 1";

	@Override
	public void savePrinter(String printerName) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_PRINTER);
		pst.setString(1, printerName);
		pst.execute();

		pst.close();
		c.close();
	}

	@Override
	public void savePrinterAndPaper(Printer printer) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_PRINTER_AND_PAPER);
		pst.setString(1, printer.getPrinterName());
		pst.setString(2, printer.getPaperSize());
		pst.execute();

		pst.close();
		c.close();
	}


	@Override
	public String getCurrentPrinter() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt;
		String printerName = null ;
		try {
			pstmt = c.prepareStatement(GET_PRINTER);

			ResultSet zrs= pstmt.executeQuery();

			while (zrs.next()) {
				// Get the values from the current row...
				printerName = zrs.getString(1);
			}

			pstmt.close();
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//tfDbPrinter.setText(printerName);
		return printerName;
	}


	@Override
	public Printer getCurrentPrinterAndPaper() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt;
		Printer printer = new Printer() ;
		try {
			pstmt = c.prepareStatement(GET_PRINTER_AND_PAPER);
			ResultSet zrs= pstmt.executeQuery();
			while (zrs.next()) {
				// Get the values from the current row...
				printer.setPrinterName(zrs.getString(1));
				printer.setPaperSize(zrs.getString(2));
			}
			pstmt.close();
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return printer;
	}

	@Override
	public void updateMessage(String new_message) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_NEW_MESSAGE);
		pst.setString(1, new_message);
		pst.execute();

		pst.close();
		c.close();
	}

	@Override
	public String currentMessage() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(CURRENT_MESSAGE);

		String message = null ;

		ResultSet zrs= pstmt.executeQuery();

		while (zrs.next()) {
			// Get the values from the current row...
			message = zrs.getString(1);
		}

		pstmt.close();
		c.close();

		return message;
	}

	@Override
	public String isNewDay() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(CHECK_DAY);

		String newDay = null ;

		ResultSet zrs= pstmt.executeQuery();

		while (zrs.next()) {
			// Get the values from the current row...
			newDay = zrs.getString(1);
		}

		pstmt.close();
		c.close();

		return newDay;
	}

	@Override
	public void resetDay(String today) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_NEW_DAY);
		pst.setString(1, today);
		pst.execute();

		pst.close();
		c.close();
	}

	@Override
	public String isNewYear() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(CHECK_YEAR);

		String newYear = null ;

		ResultSet zrs= pstmt.executeQuery();

		while (zrs.next()) {
			// Get the values from the current row...
			newYear = zrs.getString(1);
		}

		pstmt.close();
		c.close();

		return newYear;
	}

	@Override
	public void resetYear(String year) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_NEW_YEAR);
		pst.setString(1, year);
		pst.execute();

		pst.close();
		c.close();
	}

	@Override
	public String isFirstLogin() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(FIRST_LOGIN);
		String isfirstLogin = null ;
		ResultSet zrs= pstmt.executeQuery();
		while (zrs.next()) {
			// Get the values from the current row...
			isfirstLogin = zrs.getString(1);
		}
		pstmt.close();
		c.close();

		return isfirstLogin;
	}

	@Override
	public void resetFirsLogin(String noFirsLogin) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_FIRST_LOGIN);
		pst.setString(1, noFirsLogin);
		pst.execute();

		pst.close();
		c.close();

	}

	@Override
	public void setScreen(int screen) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_SCREEN);
		pst.setInt(1, screen);
		pst.execute();

		pst.close();
		c.close();
		
	}

	@Override
	public int getScreen() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(GET_SCREEN);
		int screen = 0;
		ResultSet zrs= pstmt.executeQuery();
		while (zrs.next()) {
			// Get the values from the current row...
			screen = zrs.getInt(1);
		}
		pstmt.close();
		c.close();
		return screen;
	}

	@Override
	public String isActivatedOpenDisplayRate() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(IS_ACTIVATED_AUTOMATIC_OPEN_DISPLAY_RATE);
		String isActivatedOpenDisplayRate = null ;
		ResultSet zrs= pstmt.executeQuery();
		while (zrs.next()) {
			// Get the values from the current row...
			isActivatedOpenDisplayRate = zrs.getString(1);
		}
		pstmt.close();
		c.close();

		return isActivatedOpenDisplayRate;
	}

	@Override
	public void activateDispalyRate(String openDisplayRate) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(ACTIVATE_AUTOMATIC_OPEN_DISPLAY_RATE);
		pst.setString(1, openDisplayRate);
		pst.execute();

		pst.close();
		c.close();
		
	}

	@Override
	public String getTheme() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(GET_THEME);
		String theme = null ;
		ResultSet zrs= pstmt.executeQuery();
		while (zrs.next()) {
			// Get the values from the current row...
			theme = zrs.getString(1);
		}
		pstmt.close();
		c.close();

		return theme;
	}

	@Override
	public void setTheme(String theme) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		PreparedStatement pst;
		pst = (PreparedStatement) c.prepareStatement(SET_THEME);
		pst.setString(1, theme);
		pst.execute();

		pst.close();
		c.close();
	}
}
