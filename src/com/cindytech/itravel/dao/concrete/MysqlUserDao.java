package com.cindytech.itravel.dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import com.cindytech.itravel.model.User;
import com.cindytech.itravel.utils.HideColumnRenderer;
import com.cindytech.itravel.utils.JTableUtilities;
import com.cindytech.itravel.dao.interfaces.UserDao;
import com.cindytech.itravel.daoFactory.DaoFactory;

/**
 * The class UserDao has the responsibility 
 * of access the user's data
 * 
 * @author Dorjan Shurdhi
 * @version 2021.01.28
 */
public class MysqlUserDao implements UserDao {

	private static final String
	INSERT = "INSERT INTO users (emri, mbiemri, username, password, role, image) VALUES (?, ?, ?, ?, ?, ?)";

	private static final String
	UPDATE= "UPDATE users SET emri = ?, mbiemri = ?, username = ?, password = ?, role = ? WHERE id = ?";

	private static final String
	ALL = "SELECT * FROM users";

	private static final String 
	FIND_BY_USERNAME = "SELECT * FROM users WHERE username = ?";

	private static final String 
	FIND_BY_PASSWORD = "SELECT * FROM users WHERE password = ?";

	private static final String 
	FIND_BY_USERNAME_PASSWORD = "SELECT * FROM users WHERE username = ? AND password = ?";

	private static final String 
	FIND_ID = "SELECT id FROM users WHERE username = ? AND password = ?"; 

	private static final String
	FIND_BY_ID = "SELECT * FROM users WHERE id = ?";

	private static final String 
	DELETE = "DELETE FROM users where id = ?";

	private static final String 
	DELETE_USERNAME_PASSWORD = "DELETE FROM users where username = ? AND password = ?";

	private static final String 
	DELETE_ALL = "DELETE FROM users";

	private static final String 
	REFRESH_TABLE="select id as 'ID', emri as 'EMRI', mbiemri as 'MBIEMRI', username as 'USERNAME', password as 'PASSWORD', role as 'ROLI'\r\n"
			+ "from users\r\n"
			+ "order by id;";



	/**
	 * Method to insert a user in the database
	 * @param user the user that will be inserted 
	 * @return user the inserted
	 * @throws SQLException
	 */
	public User insert(User user) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

		pstmt.setString(1, user.getEmri());
		pstmt.setString(2, user.getMbiemri());
		pstmt.setString(3, user.getUsername());
		pstmt.setString(4, user.getPassword());
		pstmt.setString(5, user.getRole());
		pstmt.setBytes(6, user.getPicture());

		pstmt.executeUpdate();

		ResultSet rset = pstmt.getGeneratedKeys();

		rset.next();
		Integer idGenerated = rset.getInt(1);
		user.setId(idGenerated);

		pstmt.close();
		c.close();

		return user;
	}

	/**
	 * Method to retrieve all users from the database
	 * @return users all users in the database	
	 * @throws SQLException 
	 */
	public List<User> all() throws SQLException {
		ArrayList<User> users = new ArrayList<User>();

		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(ALL);

		ResultSet rset = pstmt.executeQuery();
		while (rset.next()){
			users.add(createUser(rset));
		}

		pstmt.close();
		c.close();

		return users;
	}

	@Override
	public User update(User user) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(UPDATE);

		pstmt.setString(1, user.getEmri());
		pstmt.setString(2, user.getMbiemri());
		pstmt.setString(3, user.getUsername());
		pstmt.setString(4, user.getPassword());
		pstmt.setString(5, user.getRole());
		pstmt.setInt(6, user.getId());

		pstmt.execute();

		pstmt.close();
		c.close();

		return user;
	}


	/**
	 * Method to delete all users in the database
	 * @return rowsAffected the numbers of rows Affected
	 * @throws SQLException 
	 */
	public int deleteAll() throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(DELETE_ALL);

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;
	}

	/**
	 * Method to delete all users in the database
	 * @return rowsAffected the numbers of rows Affected
	 * @throws SQLException 
	 */
	public int delete(User user) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(DELETE);
		pstmt.setInt(1, user.getId());

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;
	}

	public int deleteById(Integer iduser) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(DELETE);
		pstmt.setInt(1, iduser);

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;
	}

	/**
	 * Method to find a user by username
	 * @return user User find by the username, otherwise null	
	 * @throws SQLException 
	 */
	public User findByUsername(String username) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_USERNAME);
		pstmt.setString(1, username);

		User user = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			user = createUser(rset);
		}

		pstmt.close();
		c.close();

		return user;
	}



	/**
	 * Method to find a user by password
	 * @return user User find by the password, otherwise null	
	 * @throws SQLException 
	 */
	public User findByPassword(String password) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_PASSWORD);
		pstmt.setString(1, password);

		User user = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			user = createUser(rset);
		}

		pstmt.close();
		c.close();

		return user;
	}	

	public User getUserFromDB(String username, String password) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_USERNAME_PASSWORD);
		pstmt.setString(1, username);
		pstmt.setString(2, password);

		User user = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			user = createUser(rset);
		}

		pstmt.close();
		c.close();

		return user;
	}

	/**
	 * Method to find a user by login
	 * @return user User find by the id, otherwise null	
	 * @throws SQLException 
	 */
	public User findById(Integer id) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_ID);
		pstmt.setInt(1, id);

		User user = null;
		ResultSet rset = pstmt.executeQuery();

		while (rset.next()){
			user = createUser(rset);
		}

		pstmt.close();
		c.close();

		return user;
	}

	/* method to create users **/
	private User createUser(ResultSet rset) throws SQLException{
		User user = new User(rset.getString("emri"),
				rset.getString("mbiemri"),
				rset.getString("username"),
				rset.getString("password"),
				rset.getString("role"));

		user.setId(rset.getInt("id"));

		return user;
	}



	@Override
	public int deleteByUserAndPass(String username, String password) throws SQLException {

		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(DELETE_USERNAME_PASSWORD);
		pstmt.setString(1, username);
		pstmt.setString(2, password);

		//pstmt.executeQuery();

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;

	}

	@Override
	public int findByUsernameAndPassword(String username, String password) throws SQLException {

		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(FIND_BY_USERNAME_PASSWORD);
		pstmt.setString(1, username);
		pstmt.setString(2, password);

		//pstmt.executeQuery();

		int rowsAffected = pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return rowsAffected;
	}


	@Override
	public boolean isPresent(String username, String password) throws SQLException {

		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(FIND_BY_USERNAME_PASSWORD);
		pstmt.setString(1, username);
		pstmt.setString(2, password);

		boolean isPresent;

		ResultSet r1=pstmt.executeQuery();
		if(r1.next()) {
			isPresent=true;
		}
		else {
			isPresent=false;
		}

		pstmt.close();
		c.close();

		return isPresent;
	}

	@Override
	public boolean isAdmin(String username, String password) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();

		PreparedStatement pstmt = c.prepareStatement(FIND_BY_USERNAME_PASSWORD);
		pstmt.setString(1, username);
		pstmt.setString(2, password);

		User user = null;
		ResultSet rset = pstmt.executeQuery();
		boolean isAdmin=false;

		while (rset.next()){
			user = createUser(rset);
			if(user.getRole().equals("Admin")) {
				isAdmin=true;
			} else if (user.getRole().equals("perderues")) {
				isAdmin=false;
			}

		}

		pstmt.close();
		c.close();
		return isAdmin;

	}


	public int findId(String username, String password) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(FIND_ID);
		pstmt.setString(1, username);
		pstmt.setString(2, password);

		ResultSet zrs= pstmt.executeQuery();

		int count = 0;
		while (zrs.next()) {
			// Get the values from the current row...
			count = zrs.getInt(1);
		}
		pstmt.close();
		c.close();
		return count;
	}

	@Override
	public void refreshTable(JTable tableShowUsers) throws SQLException {
		Connection c = (Connection) DaoFactory.getDatabase().openConnection();
		try {

			PreparedStatement pst = (PreparedStatement) c.prepareStatement(REFRESH_TABLE);
			ResultSet rs=pst.executeQuery();
			tableShowUsers.setModel(DbUtils.resultSetToTableModel(rs));
			pst.close();
			rs.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
		
		JTableUtilities.setCellsAlignmentUsers(tableShowUsers);
		
		tableShowUsers.getColumnModel().getColumn(0).setMinWidth(0);
		tableShowUsers.getColumnModel().getColumn(0).setMaxWidth(0);
		tableShowUsers.getColumnModel().getColumn(0).setWidth(0);
		
		HideColumnRenderer hideColumn = new HideColumnRenderer();
		int columnIndex = 4; // Indice della colonna da nascondere e centrare i "***"
		tableShowUsers.getColumnModel().getColumn(columnIndex).setCellRenderer(hideColumn);
		

		
	}

}
