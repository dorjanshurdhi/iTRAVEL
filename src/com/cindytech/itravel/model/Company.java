package com.cindytech.itravel.model;

import java.sql.SQLException;
import com.cindytech.itravel.dao.interfaces.CompanyDao;
import com.cindytech.itravel.daoFactory.DaoFactory;

public class Company {

	private String companyName;
	private String companyAddress;
	private String companyVat;
	private String companyPhone;
	
	public Company() {}
	
	public Company(String companyName, String companyAddress, String companyVat, String companyPhone) {
		super();
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyVat = companyVat;
		this.companyPhone = companyPhone;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String comanyName) {
		this.companyName = comanyName;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String comanyAddress) {
		this.companyAddress = comanyAddress;
	}

	public String getCompanyVat() {
		return companyVat;
	}

	public void setCompanyVat(String comanyVat) {
		this.companyVat = comanyVat;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String comanyPhone) {
		this.companyPhone = comanyPhone;
	}
	
	
	//DAO METHODS
	private static CompanyDao companyDAO(){
		DaoFactory dao = DaoFactory.getDatabase();
		return dao.getCompanyDao();
	}
	
	//INSERT SESSION
	public Company insert(Company company) throws SQLException {
		return companyDAO().insert(company);
	}
	
	//SAVE SESSION
	public void save() throws SQLException{
		companyDAO().insert(this);
	}
	
	public Company getCompanyInfo() throws SQLException {
		return companyDAO().getCompanyInfo();
	}
	
}
