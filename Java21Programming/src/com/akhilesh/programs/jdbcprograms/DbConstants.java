package com.akhilesh.programs.jdbcprograms;

public class DbConstants {
    static final String DB_URL = "jdbc:mysql://localhost:3306/Dev?characterEncoding=utf8";
    static final String USER_ID = "root";
    static final String PASSWORD = "root";
    static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    static final String SELECT_QUERY = "select articleid , title , category from article";
    static final String INSERT_QUERY = "INSERT INTO Article Values(3,'Election' , 'UP election')";
    static final String DELETE_QUERY = "DELETE FROM Article WHERE articleid = 1";
    static final String UPDATE_QUERY = "UPDATE Article SET category = 'Election' WHERE articleId = 2";
    static final String INSERT_QUERY_FOR_PREPARED_STATEMENT =  "INSERT INTO Article Values(?,?,?)";;
}
