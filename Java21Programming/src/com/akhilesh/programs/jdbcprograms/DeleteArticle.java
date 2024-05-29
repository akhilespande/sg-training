package com.akhilesh.programs.jdbcprograms;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteArticle {

    public static void main(String args[]) throws SQLException {

      Connection connection =  ConnectionUtil.createConnection();
      Statement statement = connection.createStatement();
      int count = statement.executeUpdate(DbConstants.DELETE_QUERY);
      System.out.println("No of Records deleted : "+ count);
      ConnectionUtil.closeConnection();
    }
}
