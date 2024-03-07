package org.example.class1;

import java.sql.*;

public class E1SQL {
    public static void main(String[] args) throws SQLException {

        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";
    // Creates the connection between java program and the database
     Connection connection= DriverManager.getConnection(dbUrl,userName,password);
     // Takes our queries executes them and brings the results back
     Statement statement=connection.createStatement();
     String query="select * from person";
    ResultSet rs= statement.executeQuery(query);
    while (rs.next()){
        String id=rs.getString(1);
        String firstName=rs.getString("FirstName");
        System.out.println(id+" "+firstName);
    }

    }
}
