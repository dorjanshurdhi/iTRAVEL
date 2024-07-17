package com.cindytech.itravel.model;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JTable;
import com.cindytech.itravel.dao.interfaces.*;
import com.cindytech.itravel.daoFactory.DaoFactory;

public class User {

	private Integer idUser;
	private String emri;
	private String mbiemri;
	private String username;
	private String password;
	private String role;
	private byte[] picture;
 
	//Costruttore vuoto
	public User() {}

	public User(String emri, String mbiemri, String username, String password, String role) {
		super();
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.username = username;
		this.password = password;
		this.role = role;
	}


	public Integer getId() {
		return idUser;
	}

	public void setId(Integer id) {
		this.idUser = id;
	}
	
	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getMbiemri() {
		return mbiemri;
	}

	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
	
	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", emri=" + emri + ", mbiemri=" + mbiemri + ", username=" + username
				+ ", password=" + password + ", role=" + role + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((emri == null) ? 0 : emri.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result + ((mbiemri == null) ? 0 : mbiemri.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((role == null) ? 0 : role.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof User))
			return false;
		User other = (User) obj;
		if (emri == null) {
			if (other.emri != null)
				return false;
		} else if (!emri.equals(other.emri))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (mbiemri == null) {
			if (other.mbiemri != null)
				return false;
		} else if (!mbiemri.equals(other.mbiemri))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (role == null) {
			if (other.role != null)
				return false;
		} else if (!role.equals(other.role))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	/*  Methods to work with the database **/

	/**
	 * Method to save the current user in the database
	 */
	public void save() throws SQLException{
		userDAO().insert(this);
	}
	
	/**
	 * Method to update the current user in the database
	 */
	public void update() throws SQLException{
		userDAO().update(this);
	}

	/**
	 * Method to delete the current user in the database
	 */
	public void delete() throws SQLException{
		userDAO().delete(this);
	}

	/**
	 * Method to find all users from the database
	 * @return users all users from the database
	 */
	public static List<User> all() throws SQLException {
		return userDAO().all();
	}

	/**
	 * Method to find one user by username
	 * @param login user's username
	 * @return user the user with the login given,
	 * 		   if the login doesn't exists, the method return null
	 */
	public static User findByUsername(String username) throws SQLException {
		return userDAO().findByPassword(username);
	}

	/**
	 * Method to find one user by login
	 * @param login user's login
	 * @return user the user with the login given,
	 * 		   if the login doesn't exists, the method return null
	 */
	public static User findByPassword(String password) throws SQLException {
		return userDAO().findByPassword(password);
	}

	/**
	 * Method to find on user by id
	 * @param id user's login
	 * @return user the user with the id given,
	 * 		   if the id doesn't exists, the method return null	
	 */
	public static User findById(Integer id) throws SQLException {
		return userDAO().findById(id);
	}

	/**
	 * Method to delete all users
	 * @return the numbers of users deleted
	 */
	public static int deleteAll() throws SQLException {
		return userDAO().deleteAll();
	}

	/* 
	 * Method to return the user DAO
	 * @return dao the user dao 
	 */
	private static UserDao userDAO(){
		DaoFactory dao = DaoFactory.getDatabase();
		return dao.getUserDao();
	}

	public int deleteByUserAndPass(String username, String paswword) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO().deleteByUserAndPass(username, password);

	}

	public int findByUsernameAndPassword(String username, String paswword) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO().findByUsernameAndPassword(username, password);

	}
	
	public boolean isPresent(String username, String paswword) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO().isPresent(username, password);

	}
	
	public boolean isAdmin(String username, String paswword) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO().isAdmin(username, password);

	}
	
	public int findId(String username, String paswword) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO().findId(username, password);
	}

	public static void deleteById(Integer id) {
		return;
		
	}
	
	public User getUserFromDB(String username, String password) throws SQLException {
		return userDAO().getUserFromDB(username, password);
	}
	
	public void refreshTable(JTable tableShowUsers) throws SQLException {
		 userDAO().refreshTable(tableShowUsers);
	}

}
