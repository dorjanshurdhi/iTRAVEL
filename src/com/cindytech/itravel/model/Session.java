package com.cindytech.itravel.model;

import java.sql.SQLException;
import com.cindytech.itravel.dao.interfaces.SessionDao;
import com.cindytech.itravel.daoFactory.DaoFactory;

public class Session {
	
	private int id_session;
	private int id_user;
	private String username;
	private String start_session;
	private String finishSession;

	public Session() {};
	
	public Session(int id_session, int id_user, String username, String start_session, String finishSession) {
		super();
		this.id_session = id_session;
		this.id_user = id_user;
		this.username = username;
		this.start_session = start_session;
		this.finishSession = finishSession;
	}

	public int getId_session() {
		return id_session;
	}

	public void setId_session(int id_session) {
		this.id_session = id_session;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStart_session() {
		return start_session;
	}

	public void setStart_session(String start_session) {
		this.start_session = start_session;
	}

	public String getFinishSession() {
		return finishSession;
	}

	public void setFinishSession(String finishSession) {
		this.finishSession = finishSession;
	}
	
	
	//DAO METHODS
	private static SessionDao sessionDAO(){
		DaoFactory dao = DaoFactory.getDatabase();
		return dao.getSessionDao();
	}
	
	//INSERT SESSION
	public Session insert(Session session) throws SQLException {
		return sessionDAO().insert(session);
	}
	
	//SAVE SESSION
	public void save() throws SQLException{
		sessionDAO().insert(this);
	}
}
