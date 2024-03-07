package org.example.class1;

import java.sql.*;

public class E2SQL {
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
    // This Object gives us info about the data that is being returned by the query
    ResultSetMetaData rsm=rs.getMetaData();
        System.out.println(rsm.getColumnCount());
        for (int i = 1; i <=rsm.getColumnCount() ; i++) {
            System.out.print(rsm.getColumnName(i)+" ");
        }
        System.out.println();
        while (rs.next()){

            for (int i = 1; i <rsm.getColumnCount() ; i++) {
                System.out.print(rs.getString(i)+" ");
            }
            System.out.println();
        }

    }
}
