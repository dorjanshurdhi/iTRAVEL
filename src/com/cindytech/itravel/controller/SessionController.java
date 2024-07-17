package com.cindytech.itravel.controller;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.cindytech.itravel.model.Session;
import com.cindytech.itravel.model.User;

public class SessionController {

	Session session = new Session();

	public Session startSession(User user) {
		Session currentSession = new Session();
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		currentSession.setId_user(user.getId());
		currentSession.setUsername(user.getUsername());
		currentSession.setStart_session(timeStamp);

		return currentSession;
	}

	public void finishSession(Session currentSession) {
		String finishSession = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		currentSession.setFinishSession(finishSession);
		try {
			currentSession.save();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
