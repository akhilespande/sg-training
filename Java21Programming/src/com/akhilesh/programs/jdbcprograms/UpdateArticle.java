package com.akhilesh.programs.jdbcprograms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateArticle {

    public static void main(String args[]) throws SQLException {
        Connection connection =ConnectionUtil.createConnection();
        Statement statement = connection.createStatement();

        int count = statement.executeUpdate(DbConstants.UPDATE_QUERY);

        System.out.println("No of records updated : "+ count);

        ResultSet resultSet = statement.executeQuery(DbConstants.SELECT_QUERY);
        System.out.println("Records found in database after updating the record...");

        while (resultSet.next()){
          int articleId = resultSet.getInt(1);
          String articleName = resultSet.getString(2);
          String category = resultSet.getString(3);
          System.out.println(articleId + " , "+ articleName + " , " + category);
        }

    }
}
