package com.cindytech.itravel.dao.concrete;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.cindytech.itravel.dao.interfaces.CompanyDao;
import com.cindytech.itravel.daoFactory.DaoFactory;
import com.cindytech.itravel.model.Company;

public class MysqlCompanyDao implements CompanyDao{

	private static final String
	INSERT = "INSERT INTO company_Info (id_company, company_name, company_address, company_vat, company_phone) VALUES (?, ?, ?, ?, ?)";

	private static final String
	GET_COMPANY_INFO = "SELECT company_name, company_address, company_vat, company_phone FROM company_info WHERE id_company=1";


	@Override
	public Company insert(Company company) throws SQLException {
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(INSERT, PreparedStatement.RETURN_GENERATED_KEYS);

		pstmt.setInt(1, 1);
		pstmt.setString(2, company.getCompanyName());
		pstmt.setString(3, company.getCompanyAddress());
		pstmt.setString(4, company.getCompanyVat());
		pstmt.setString(5, company.getCompanyPhone());
		pstmt.executeUpdate();

		pstmt.close();
		c.close();

		return company;
	}

	private Company createCompany(ResultSet rset) throws SQLException{
		Company company = new Company(
				
				rset.getString("company_name"),
				rset.getString("company_address"),
				rset.getString("company_vat"),
				rset.getString("company_phone"));

		return company;
	}

	@Override
	public Company getCompanyInfo() throws SQLException {
		
		Connection c = DaoFactory.getDatabase().openConnection();
		PreparedStatement pstmt = c.prepareStatement(GET_COMPANY_INFO);

		ResultSet rset = pstmt.executeQuery();
		Company company = new Company();
		while (rset.next()){
			company = createCompany(rset);
		}
		pstmt.close();
		c.close();

		return company;
	}

	@Override
	public List<Company> all() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteAll() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Company company) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
