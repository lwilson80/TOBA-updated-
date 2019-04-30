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
public class TobaDBUtility {
    public static void closeUserStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void closePreparedStatement(Statement prepState) {
        try {
            if (prepState != null) {
                prepState.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    
    public static void closeUserStatement (ResultSet results) {
        try {
            if (results != null) {
                results.close();
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
