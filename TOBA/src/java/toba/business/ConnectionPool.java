/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.business;

import java.sql.*;
import java.sql.DataSource;
import javax.naming.InitialContext;
import javax.naming.NamingException;


/**
 *
 * @author lawrencewilson
 */
public class ConnectionPool {
  try {
            InitialContext ic = new InitialContext();
            dataSource = (DataSource) ic.lookup("java:/comp/env/jdbc/toba");
        } catch (NamingException e) {
            System.out.println(e);
        }
    }
    
    public static synchronized ConnectionPool getInstance() {
        if (pool == null) {
            pool = new ConnectionPool();
        }
        return pool;
    }
    
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }
    }
    
    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }  
}
