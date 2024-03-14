package org.example.review;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3SQL {
    public static void main(String[] args) throws SQLException {


        String dbUrl="jdbc:mysql://3.239.253.255:3306/syntaxhrm_mysql";
        String userName="syntax_hrm";
        String password="syntaxhrm123";

     Connection connection= DriverManager.getConnection(dbUrl,userName,password);
     Statement  statement=connection.createStatement();
     String query="select p.FirstName,p.age,e.salary,e.department\n" +
             "from person as p,employee as e where p.empId=e.empId;";
     ResultSet rs= statement.executeQuery(query);
     ResultSetMetaData rsm=rs.getMetaData();
     List<Map<String,String>> dataList=new ArrayList<>();
     while (rs.next()){
        Map<String,String> rowMap=new LinkedHashMap<>();
         for (int i = 1; i <=rsm.getColumnCount() ; i++) {
            String key=rsm.getColumnName(i);
            String value=rs.getString(i);
            rowMap.put(key,value);
         }
        dataList.add(rowMap);

     }
        System.out.println(dataList.get(5).get("FirstName"));
        System.out.println(dataList.get(5).get("salary"));

    }
}
