package com.cindytech.itravel.dao.interfaces;

import java.sql.SQLException;
import java.util.List;
import com.cindytech.itravel.model.Company;

public interface CompanyDao {
	
	Company insert(Company company) throws SQLException;
	Company getCompanyInfo() throws SQLException;
	List<Company> all() throws SQLException;
	int deleteAll() throws SQLException;
	int delete(Company company) throws SQLException;
}