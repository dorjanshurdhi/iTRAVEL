package com.cindytech.itravel.controller;

import java.sql.SQLException;
import com.cindytech.itravel.model.Settings;
import com.cindytech.itravel.view.FirstSetup;
import com.cindytech.itravel.view.Login;

public class MainController {

	Settings settings = new Settings();
	public void checkFirstLogin() {
		try {
			String isFirstLogin = settings.isFirstLogin();
			if (isFirstLogin.equals("NO")) {
				new Login().setVisible(true);
			} else if(isFirstLogin.equals("YES")) {
				new FirstSetup().setVisible(true);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

