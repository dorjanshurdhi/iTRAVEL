package com.cindytech.itravel.daoFactory;

import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Base64;
import java.util.ResourceBundle;
import com.cindytech.itravel.dao.concrete.MysqlCompanyDao;
import com.cindytech.itravel.dao.concrete.MysqlSessionDao;
import com.cindytech.itravel.dao.concrete.MysqlSettingsDao;
import com.cindytech.itravel.dao.concrete.MysqlUserDao;
import com.cindytech.itravel.dao.interfaces.CompanyDao;
import com.cindytech.itravel.dao.interfaces.SessionDao;
import com.cindytech.itravel.dao.interfaces.SettingsDao;
import com.cindytech.itravel.dao.interfaces.UserDao;
import com.cindytech.itravel.controller.LoginController;
import com.cindytech.itravel.utils.SingleInstanceChecker;

public class Mysql extends DaoFactory {
	
	//GET 'config.properties' FILE
	static ResourceBundle config = ResourceBundle.getBundle("config");
	
	private static String driver = config.getString("driver.db");
	private static String url = config.getString("url.db");
	private static String database = config.getString("database.db");
	
	//GET ENCODED USER FROM 'config.properties' FILE AND DECODE IT
	private static String encodedUser = config.getString("user.db");
	private static byte[] decodedUser = Base64.getDecoder().decode(encodedUser);
	private static String user = new String(decodedUser, StandardCharsets.UTF_8);
	
	//GET ENCODED PASSWORD FROM 'config.properties' FILE AND DECODE IT
	private static String encodedPassword = config.getString("pwd.db");
	private static byte[] decodedPassword = Base64.getDecoder().decode(encodedPassword);
	private static String password = new String(decodedPassword, StandardCharsets.UTF_8);
	
	LoginController loginController = new LoginController();
	
	@SuppressWarnings("deprecation")
	public Connection openConnection() {   
		try {
			Class.forName(driver).newInstance();
			Connection connection = DriverManager.getConnection(url + database, user, password);
			return connection;
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println("MySQL Service maybe is not running!");
			SingleInstanceChecker.releaseLock();
		} catch (Exception ex){
			System.err.println("Il DataBase non sta rispondendo!");
			SingleInstanceChecker.releaseLock();
		}
		return null;
	}

	@Override
	public UserDao getUserDao() {
		return new MysqlUserDao();
	}
	
	@Override
	public SettingsDao getSettingsDao() {
		return new MysqlSettingsDao();
	}
	
	@Override
	public SessionDao getSessionDao() {
		return new MysqlSessionDao();
	}
	
	@Override
	public CompanyDao getCompanyDao() {
		return new MysqlCompanyDao();
	}

}