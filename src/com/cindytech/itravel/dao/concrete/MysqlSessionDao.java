package com.cindytech.itravel.dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import com.cindytech.itravel.dao.interfaces.SessionDao;
import com.cindytech.itravel.daoFactory.DaoFactory;
import com.cindytech.itravel.model.Session;

public class MysqlSessionDao implements SessionDao{

	private static final String
	INSERT = "INSERT INTO session (id_user, username, start_session, finish_session) VALUES (?, ?, ?, ?)";

	//private static final String
	//ALL = "SELECT * FROM users";
	
		
	@Override
	public Session insert(Session session) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

		pstmt.setInt(1, session.getId_user());
		pstmt.setString(2, session.getUsername());
		pstmt.setString(3, session.getStart_session());
		pstmt.setString(4, session.getFinishSession());
		pstmt.executeUpdate();
		ResultSet rset = pstmt.getGeneratedKeys();
		rset.next();
		Integer idGenerated = rset.getInt(1);
		session.setId_session(idGenerated);
		pstmt.close();
		c.close();

		return session;
	}

	@Override
	public List<Session> all() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAll() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Session user) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteById(Integer iduser) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
