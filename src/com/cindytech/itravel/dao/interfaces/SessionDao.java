package com.cindytech.itravel.dao.interfaces;

import java.sql.SQLException;
import java.util.List;
import com.cindytech.itravel.model.Session;


public interface SessionDao {

	Session insert(Session object) throws SQLException;
	List<Session> all() throws SQLException;
	int deleteAll() throws SQLException;
	int delete(Session user) throws SQLException;
	int deleteById(Integer iduser) throws SQLException;
}
