package JDBC_EMP.SRC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/employeedb",
                "root",
                "Rajababu@2004"
            );

            System.out.println("Database Connected Successfully");

        } catch (Exception e) {

            System.out.println("Connection Failed");
            e.printStackTrace();
        }

        return con;
    }
}