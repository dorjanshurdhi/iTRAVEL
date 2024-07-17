package com.cindytech.itravel.controller;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import com.cindytech.itravel.model.Company;
import com.cindytech.itravel.model.Settings;
import com.cindytech.itravel.model.User;
import com.cindytech.itravel.utils.JpanelLoader;
import com.cindytech.itravel.utils.OraUtils;
import com.cindytech.itravel.view.Home;
/*import com.cindytech.ivaluta.view.PosView;
 * import com.cindytech.ivaluta.view.DisplayRate;
import com.cindytech.ivaluta.view.RateView;
import com.cindytech.ivaluta.view.UsersView;
import com.cindytech.ivaluta.view.ReportsView;
import com.cindytech.ivaluta.view.SaleView;
import com.cindytech.ivaluta.view.SettingsView;
import com.cindytech.ivaluta.view.StatsView;
import com.cindytech.ivaluta.view.StrongBoxView;*/

public class HomeController {

	JpanelLoader jpload = new JpanelLoader();
	Company company = new Company();
	Timer timer = new Timer();
	Settings settings = new Settings();

	public void logoUpload(JLabel lBackgroundImage) {
		Random rand = new Random();
		int n = rand.nextInt(18);
		n += 1;
		String path = "/icon/walpaper/"+n+".jpg";
		lBackgroundImage.setIcon(new ImageIcon(Home.class.getResource(path)));
	}

	public void insertCompanyInfo(JTextField tfName, JTextField tfAdrress, JTextField tfVat, JTextField tfPhone) {

		String companyName = tfName.getText().toString();
		String companyAddress = tfAdrress.getText().toString();
		String companyVat = tfVat.getText().toString();
		String companyPhone = tfPhone.getText().toString();

		Company company = new Company(companyName, companyAddress, companyVat, companyPhone);
		try {
			company.save();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void getCompanyInfo(Company currentCompany, JLabel companyName, JLabel companyAddress, JLabel companyVat, JLabel companyPhone) {

		companyName.setText("Subjekti: " +currentCompany.getCompanyName());
		companyAddress.setText("Adresa: " +currentCompany.getCompanyAddress());
		companyVat.setText("NIPT: " +currentCompany.getCompanyVat());
		companyPhone.setText("CEL:  " +currentCompany.getCompanyPhone());
	}

	public void showDateAndTime (JLabel lDate, JLabel lTime) {
		OraUtils oraUtils = new OraUtils();
		oraUtils.showDate(lDate);
		oraUtils.showTime(lTime);
	}

	public void OpenDisplayRate(Company company) throws SQLException{
		/*
		 * SettingsController controller = new SettingsController(); int screen =
		 * controller.getScreen();
		 * 
		 * GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		 * GraphicsDevice[] devices = ge.getScreenDevices();
		 * 
		 * if (screen >= 0 && screen < devices.length) { GraphicsDevice monitor =
		 * devices[screen];
		 * 
		 * DisplayRate.getObj(company).setVisible(true);
		 * DisplayRate.getObj(company).setLocation(monitor.getDefaultConfiguration().
		 * getBounds().getLocation());
		 * DisplayRate.getObj(company).setExtendedState(JFrame.MAXIMIZED_BOTH);
		 * DisplayRate.getObj(company).setVisible(true); } else { JLabel error = new
		 * JLabel(); error.setFont(new Font("Calibri", Font.BOLD, 12));
		 * error.setForeground(Color.BLACK); error.
		 * setText("<html><b>Ekrani i perzgjedhur per shfaqjen e kursit eshte i fikur!</b></html>"
		 * ); JOptionPane.showMessageDialog(null, error, "KUJDES!",
		 * JOptionPane.ERROR_MESSAGE); }
		 */
	}

	public void startProgramWithDelay(Company company)  {
		/*
		 * String isActivated; try { isActivated =
		 * settings.isActivatedOpenDisplayRate(); if (isActivated.equals("YES")) {
		 * ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
		 * scheduler.schedule(new Runnable() {
		 * 
		 * @Override public void run() { try { OpenDisplayRate(company); } catch
		 * (SQLException e) { e.printStackTrace(); } } }, 3, TimeUnit.SECONDS); } }
		 * catch (SQLException e1) { e1.printStackTrace(); }
		 */
	}

	public void loadPos(java.awt.event.ActionEvent evt, JPanel panel_load, User user, Company company, JToggleButton tbRate) {
		/*
		 * PosView pw = new PosView(user, company, tbRate, panel_load);
		 * jpload.jPanelLoader(panel_load, pw);
		 */
	}

	public void loadRate(java.awt.event.ActionEvent evt, JPanel panel_load, User user) {
		/*
		 * RateView rv = new RateView(user); jpload.jPanelLoader(panel_load, rv);
		 */
	}

	public void loadSales(java.awt.event.ActionEvent evt, JPanel panel_load, User user,  Company company) {

		/*
		 * SaleView sv = new SaleView(user, company); jpload.jPanelLoader(panel_load,
		 * sv);
		 */
	}

	public void loadSettingsView(java.awt.event.ActionEvent evt, JPanel panel_load) {

		/*
		 * SettingsView sv = new SettingsView(company); jpload.jPanelLoader(panel_load,
		 * sv);
		 */
	}


	public void loadStrongBox(java.awt.event.ActionEvent evt, JPanel panel_load, User user) {
		/*
		 * StrongBoxView sbv = new StrongBoxView(user); jpload.jPanelLoader(panel_load,
		 * sbv);
		 */
	}

	/*public void loadStatistika(java.awt.event.ActionEvent evt, JPanel panel_load) {
		StatsView stat  = new StatsView();
		jpload.jPanelLoader(panel_load, stat);
	}*/

	public void loadUsers(java.awt.event.ActionEvent evt, JPanel panel_load) {
		/*
		 * UsersView rw = new UsersView(); jpload.jPanelLoader(panel_load, rw);
		 */
	}

	public void loadStats(java.awt.event.ActionEvent evt, JPanel panel_load) {
		/*
		 * StatsView sw = new StatsView(); jpload.jPanelLoader(panel_load, sw);
		 */
	}

	public void loadReports(java.awt.event.ActionEvent evt, JPanel panel_load) {
		/*
		 * ReportsView rw = new ReportsView(); jpload.jPanelLoader(panel_load, rw);
		 */
	}

	public void openExcel() {
		/*
		 * String path = System.getProperty("user.dir"); String fullPath
		 * =path+"\\resource\\excel\\ivaluta.xlsx"; File file = new File(fullPath); try
		 * { Desktop.getDesktop().open(file); } catch (IOException e1) {
		 * e1.printStackTrace(); }
		 */
	}

	public void updateRate(User user, JToggleButton tbRate) {
		/*
		 * TimerTask timerTask = new TimerTask() {
		 * 
		 * @Override public void run() { vendosKursin(user, tbRate); } };
		 * timer.cancel(); timer = new Timer(); timer.schedule(timerTask, 3000);
		 */
	}

	public void vendosKursin(User user, JToggleButton tbRate) {
		/*
		 * Settings sett = new Settings(); String pattern = "dd-MM-yyyy";
		 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern); String
		 * today = simpleDateFormat.format(new Date()); try { String
		 * oldDay=sett.isNewDay(); if (!today.equals(oldDay)) { JLabel info = new
		 * JLabel();
		 * info.setText("<html><b>Doni te vendosni kursin per sot?</b></html>"); int
		 * responseClear = JOptionPane.showConfirmDialog(null, info, "INFO",
		 * JOptionPane.YES_NO_OPTION,JOptionPane.INFORMATION_MESSAGE); if (responseClear
		 * == JOptionPane.NO_OPTION) { } if (responseClear == JOptionPane.YES_OPTION) {
		 * tbRate.doClick(); } } sett.resetDay(today); } catch (SQLException e) {
		 * e.printStackTrace(); }
		 */
	}
}
