
//Write a program that establishes a connection with a Mysql database named “companies”.

import java.sql.Connection;
import java.sql.DriverManager;

public class vap18 {

    public static void main(String[] args) {
        // MySQL connection URL for the "companies" database
        String url = "jdbc:mysql://localhost:3306/companies?serverTimezone=UTC";
        String user = "root";         // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // If no exception, connection is successful
            System.out.println("Connected to the 'companies' database successfully!");

            // Close the connection
            conn.close();

        } 
        catch (Exception e) 
        {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}

