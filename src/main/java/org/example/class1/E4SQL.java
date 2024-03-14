package org.example.class1;

import java.util.List;
import java.util.Map;

public class E4SQL {
    public static void main(String[] args) {

       List<Map<String,String>> data= DbUtils.fetch("Select * from employee");


        System.out.println(data);
        System.out.println(data.get(3));
      Map<String,String> firstRowData= data.get(0);
        System.out.println(firstRowData.get("salary"));
       // Break till 7:45

    }
}
