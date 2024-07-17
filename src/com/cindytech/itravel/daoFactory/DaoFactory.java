package com.cindytech.itravel.daoFactory;

import java.sql.Connection;
import com.cindytech.itravel.dao.interfaces.CompanyDao;
import com.cindytech.itravel.dao.interfaces.SessionDao;
import com.cindytech.itravel.dao.interfaces.SettingsDao;
import com.cindytech.itravel.dao.interfaces.UserDao;


public abstract class DaoFactory {

  /* 
   * There will be a method for each DAO that can be
   * created. The concrete factories will have to
   * implement these methods.
   */
  public abstract Connection openConnection();	
  public abstract UserDao getUserDao();
  public abstract SettingsDao getSettingsDao();
  public abstract SessionDao getSessionDao();
  public abstract CompanyDao getCompanyDao();

  
  public static DaoFactory getDatabase() {
      return new Mysql();
  }
}
