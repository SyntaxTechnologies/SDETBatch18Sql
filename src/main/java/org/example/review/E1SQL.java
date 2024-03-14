package org.example.review;

import javax.xml.transform.Result;
import java.sql.*;

public class E1SQL {
    public static void main(String[] args) throws SQLException {


        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";

     Connection connection= DriverManager.getConnection(dbUrl,userName,password);
     Statement  statement=connection.createStatement();
     String query="select * from employee";
     ResultSet resultSet= statement.executeQuery(query);
     while (resultSet.next()){

       String id=  resultSet.getString(1);
       String salary=  resultSet.getString(2);
       String grade=  resultSet.getString(3);
       String department=  resultSet.getString(4);
         System.out.println(id+" "+salary+" "+grade+" "+department);

     }

    }
}
