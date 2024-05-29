package com.akhilesh.programs.jdbcprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class WriteArticle {
    public static void main(String args[]) throws SQLException {

       Connection connection = ConnectionUtil.createConnection();
       Statement statement = connection.createStatement();
       statement.executeUpdate(DbConstants.INSERT_QUERY);
       System.out.println("Data Inserted into database");
       ConnectionUtil.closeConnection();

    }
}
