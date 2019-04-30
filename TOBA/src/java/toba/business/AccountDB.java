/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toba.business;

import java.sql.*;
import toba.*;
/**
 *
 * @author lawrencewilson
 */
public class AccountDB {
    public static int insert(Account account) {
        ConnectionPool pool = ConnectionPool.getInstance();
        Connection connection =  pool.getConnection();
        UserStatement us = null;
        
        String query
                ="INSERT INTO ACCOUNT (Account, Balance) "
                + "VALUES (?, ?)";
        
        try {
            us = connection.prepareStatement(query);
            us.setObject(1, account.getUser());
            us.setDouble(2, account.getBalance());

            return us.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
            return 0;
        } finally {
            TobaDBUtility.exitPreparedStatement(us);
            pool.freeConnection(connection);
        }
        
    }
    
}
