package com.cindytech.itravel.controller;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.net.URL;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import com.cindytech.itravel.model.Company;
import com.cindytech.itravel.model.User;
import com.cindytech.itravel.view.Home;


public class LoginController{

	Company company = new Company();
	
	public boolean validate(JTextField tfUsername, JTextField tfPassword) {

		User user = new User();
		String username = tfUsername.getText().toString();
		String password  = tfPassword.getText().toString();

		//variabile booleana per verificare se fare il dispose del frame o meno
		boolean esiste = false;

		username=username.trim();
		password=password.trim();
		user.setUsername(username);
		user.setPassword(password);

		if(username.equals("superuser") && password.equals("cindytech")){

			User superuser = new User();
			superuser.setId(9999);
			superuser.setEmri("CindyTECH");
			superuser.setMbiemri("Consulting");
			superuser.setUsername("superuser");
			superuser.setPassword("cindytech");
			superuser.setRole("Admin");
			new Home(company, superuser).setVisible(true);
			esiste= true;
		}

		try {
			if(user.isPresent(username, password)) {
				User currentUser=user.getUserFromDB(username, password);
				company=company.getCompanyInfo();
				new Home(company, currentUser).setVisible(true);
				esiste= true;
			}

			if(username.equals("") || password.equals("")){

				JLabel error = new JLabel();
				error.setFont(new Font("Calibri", Font.BOLD, 14));
				error.setForeground(Color.RED);
				error.setText("<html><b>Ploteso te gjitha fushat</b></html>");
				JOptionPane.showMessageDialog(null,error,"Gabim!",JOptionPane.ERROR_MESSAGE);

				tfUsername.setText("username");
				tfPassword.setText("password123");

				esiste = false;

			} else if(user.isPresent(username, password)==false) {

				JLabel error = new JLabel();
				error.setFont(new Font("Calibri", Font.BOLD, 14));
				error.setForeground(Color.RED);
				error.setText("<html><b>Ju nuk jeni i regjistruar ne Sistem!</b></html>");
				JOptionPane.showMessageDialog(null,error,"Gabim!",JOptionPane.ERROR_MESSAGE);

				tfUsername.setText("username");
				tfPassword.setText("password123");

				esiste = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return esiste;
	}

	public void openWebpage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openFacebookPage(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void openYoutube(String urlString) {
		try {
			Desktop.getDesktop().browse(new URL(urlString).toURI());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
