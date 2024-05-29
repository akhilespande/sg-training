package com.akhilesh.programs.jdbcprograms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatchInsertUsingPreparedStatement {

    public static void main(String args[]) throws SQLException {
        Connection connection = ConnectionUtil.createConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DbConstants.INSERT_QUERY_FOR_PREPARED_STATEMENT);
        preparedStatement.setInt(1, 5);
        preparedStatement.setString(2, "Eduction");
        preparedStatement.setString(3, "Books");
        preparedStatement.addBatch();

        preparedStatement.setInt(1, 6);
        preparedStatement.setString(2, "Thinkpad");
        preparedStatement.setString(3, "Laptop");
        preparedStatement.addBatch();

        preparedStatement.executeBatch();

        ResultSet resultSet = preparedStatement.executeQuery(DbConstants.SELECT_QUERY);

        while (resultSet.next()){
            System.out.println(resultSet.getInt(1)+ " , " + resultSet.getString(2) + " , " + resultSet.getString(3));

        }

        resultSet.close();

        ConnectionUtil.closeConnection();



    }
}
