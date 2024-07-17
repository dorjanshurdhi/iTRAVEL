package com.cindytech.itravel.dao.interfaces;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import com.cindytech.itravel.model.User;

public interface UserDao {
	
	User insert(User object) throws SQLException;
	User update(User object) throws SQLException;
	List<User> all() throws SQLException;
	int deleteAll() throws SQLException;
	int delete(User user) throws SQLException;
	int deleteById(Integer iduser) throws SQLException;
	int deleteByUserAndPass(String username, String password) throws SQLException;
	int findByUsernameAndPassword(String username, String password) throws SQLException;
	int findId(String username, String password) throws SQLException;
	boolean isPresent(String username, String password) throws SQLException;
	boolean isAdmin(String username, String password) throws SQLException;
	User getUserFromDB(String username, String password) throws SQLException;
	User findByUsername(String username) throws SQLException;
	User findByPassword(String password) throws SQLException;
	User findById(Integer id) throws SQLException;
	void refreshTable(JTable tableShowUsers) throws SQLException;

}