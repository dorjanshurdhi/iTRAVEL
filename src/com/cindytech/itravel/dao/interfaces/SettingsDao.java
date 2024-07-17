package com.cindytech.itravel.dao.interfaces;

import java.sql.SQLException;
import com.cindytech.itravel.model.Printer;

public interface SettingsDao {

	//PRINTER
	void savePrinter(String printerName) throws SQLException;
	void savePrinterAndPaper(Printer printer) throws SQLException;
	String getCurrentPrinter() throws SQLException;
	Printer getCurrentPrinterAndPaper() throws SQLException;
	
	//MESSAGE
	void setScreen( int screen) throws SQLException;
	int getScreen() throws SQLException;
	
	//SCREEN
	void updateMessage( String new_message) throws SQLException;
	String currentMessage() throws SQLException;
	
	//IS NEW DAY
	String isNewDay() throws SQLException;
	void resetDay(String today) throws SQLException;
	
	//IS NEW YEAR
	String isNewYear() throws SQLException;
	void resetYear(String newYear) throws SQLException;
	
	//IS FIRST LOGIN
	String isFirstLogin() throws SQLException;
	void resetFirsLogin(String noFirsLogin) throws SQLException;
	
	//ACTIVATE AUTOMATIC OPEN DISPLAY RATE
	String isActivatedOpenDisplayRate() throws SQLException;
	void activateDispalyRate(String openDisplayRate) throws SQLException;
	
	//SELECT THEME

	String getTheme() throws SQLException;
	void setTheme(String theme) throws SQLException;
	
	
}
