package com.cindytech.itravel.model;


import java.sql.SQLException;

import com.cindytech.itravel.dao.interfaces.SettingsDao;
import com.cindytech.itravel.daoFactory.DaoFactory;

public class Settings {

	public Settings() {}

	//GET DAO FACTORY
	private static SettingsDao settingsDAO(){
		DaoFactory dao = DaoFactory.getDatabase();
		return dao.getSettingsDao();
	}

	//PRINTER METHOD
	public void savePrinter(String printerName) throws SQLException {
		settingsDAO().savePrinter(printerName);
	}

	public void savePrinterAndPaper(Printer printer) throws SQLException {
		settingsDAO().savePrinterAndPaper(printer);
	}

	public String getCurrentPrinter() throws SQLException {
		return settingsDAO().getCurrentPrinter();
	}

	public Printer getCurrentPrinterAndPaper() throws SQLException {
		return settingsDAO().getCurrentPrinterAndPaper();
	}

	//IS_NEW_DAY CHECK
	public void resetDay(String today) throws SQLException {
		settingsDAO().resetDay(today);
	}

	public String  isNewDay() throws SQLException {
		return settingsDAO().isNewDay();
	}

	//IS_NEW_YEAR CHECK
	public void resetYear(String today) throws SQLException {
		settingsDAO().resetYear(today);
	}

	public String  isNewYear() throws SQLException {
		return settingsDAO().isNewYear();
	}

	//BOARD MESSAGE
	public void updateMessage(String new_message) throws SQLException {
		settingsDAO().updateMessage(new_message);
	}

	public String currentMessage() throws SQLException {
		return settingsDAO().currentMessage();
	}

	//BOARD SCREEN
	public void setScreen(int screen) throws SQLException {
		settingsDAO().setScreen(screen);
	}

	public int getScreen() throws SQLException {
		return settingsDAO().getScreen();
	}

	//FIRST LOGIN
	public String isFirstLogin() throws SQLException {
		return settingsDAO().isFirstLogin();
	}

	public void resetFirstLogin(String noFirstLogin) throws SQLException {
		settingsDAO().resetFirsLogin(noFirstLogin);
	}

	//ACTIVATED OPEN MONITOR
	public String isActivatedOpenDisplayRate() throws SQLException {
		return settingsDAO().isActivatedOpenDisplayRate();
	}

	public void activateDispalyRate(String openDisplayRate) throws SQLException {
		settingsDAO().activateDispalyRate(openDisplayRate);
	}
	
	//DISPLAY THEME
	public String getTheme() throws SQLException {
		return settingsDAO().getTheme();
	}

	public void setTheme(String theme) throws SQLException {
		settingsDAO().setTheme(theme);
	}

}