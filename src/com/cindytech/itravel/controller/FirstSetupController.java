package com.cindytech.itravel.controller;

import java.sql.SQLException;
import javax.swing.JTextField;
import com.cindytech.itravel.model.User;

public class FirstSetupController {

	public User insertFirstUser(JTextField tfName, JTextField tfSurname, JTextField tfUsername, JTextField tfPassword) {

		String name = tfName.getText().toString();
		String surname = tfSurname.getText().toString();
		String username = tfUsername.getText().toString();
		String password = tfPassword.getText().toString();
		String role = "Admin";

		User user = new User();
		user.setEmri(name);
		user.setMbiemri(surname);
		user.setUsername(username);
		user.setPassword(password);
		user.setRole(role);
		try {
			user.save();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
