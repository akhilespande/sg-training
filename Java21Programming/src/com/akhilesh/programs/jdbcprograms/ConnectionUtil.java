package com.akhilesh.programs.jdbcprograms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

   public  static Connection connection = null;

    public static Connection createConnection()  {
        try {
            Class.forName(DbConstants.DRIVER_NAME);
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println(classNotFoundException.getMessage());
        }
        try {
            connection = DriverManager.getConnection(DbConstants.DB_URL, DbConstants.USER_ID, DbConstants.PASSWORD);
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return connection;
    }

    public static void closeConnection(){
        try {
            connection.close();
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
    }
}
