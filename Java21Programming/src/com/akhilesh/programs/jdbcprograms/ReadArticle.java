package com.akhilesh.programs.jdbcprograms;

import java.sql.*;
/*
 Problem 1: SQL Exception :Client does not support authentication protocol requested by server; consider upgrading MySQL client

 Solution :
    ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
    flush privileges;

 Problem 2 : SQL Exception :Unknown initial character set index '255' received from server. Initial client character set can be forced via the 'characterEncoding' property.

 Solution : Append characterEncoding  as utf8 in the DB_URL " ?characterEncoding=utf8 "

 */

public class ReadArticle {



    public static void main(String args[]) throws SQLException {
        Statement statement = null;
        ResultSet resultSet = null;
        Connection connection = null;

             connection = ConnectionUtil.createConnection();
             statement = connection.createStatement();
             resultSet = statement.executeQuery(DbConstants.SELECT_QUERY);

            while (resultSet.next()) {
                int articleid = resultSet.getInt(1);
                String articleName = resultSet.getString(2);
                String category = resultSet.getString(3);

                System.out.println(articleid + " , " + articleName + " , " + category);

            }
        ConnectionUtil.closeConnection();
    }

}
