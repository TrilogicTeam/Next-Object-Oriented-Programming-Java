/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ali
 */
public class connection {
     static Connection getConnection(){
        Connection con = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/db_java";
            String user = "root";
            String pass = "";

            con = DriverManager.getConnection(url, user, pass);
        }
        catch ( ClassNotFoundException e){
            System.out.println (e.getMessage());
        }
        catch (SQLException e){
            System.out.println (e.getMessage());
        }
            return con;
    }
}
