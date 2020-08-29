/*
 * Created by Gokul on $today.date/ $toay.month/2020
 */

package com.company.annotations.Database;

/**
 * Created by Gokul on Aug,2020,27-08-2020 at 17:31
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.sql.Driver;
import java.util.Properties;

import com.mysql.jdbc.*;
public class ConnectionTesting {
    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
        Connection connection = null;
        Statement statement=null;
        ResultSet resultSet=null;
        String url="jdbc:mysql://localhost:3306/demo";

        Properties properties = new Properties();
        properties.load(new FileInputStream("D:\\JavaProject\\src\\com\\company\\Creditionals.properties"));
        connection=DriverManager.getConnection(url,properties.getProperty("name"),properties.getProperty("pswd"));
        System.out.println("Connected Successfully");
        statement=connection.createStatement();
        resultSet=statement.executeQuery("select * from employees");
        while (resultSet.next()){
            System.out.println(resultSet.getString("last_name")+" "+resultSet.getString("first_name"));
        }

    }
}
