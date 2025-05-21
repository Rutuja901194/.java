
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class vap13 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/?serverTimezone=UTC"; // No DB yet
        String user = "root"; // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        try {
            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL Server
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // Create Database
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS Colleges");

            // Use Database
            stmt.execute("USE Colleges");

            // Create Courses Table
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS Courses (
                    course_id INT AUTO_INCREMENT PRIMARY KEY,
                    course_name VARCHAR(100) NOT NULL,
                    duration INT,
                    instructor VARCHAR(100),
                    credits INT
                );
            """;
            stmt.executeUpdate(createTableSQL);

            System.out.println("Database and table created successfully!");

            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//---------------------------------------------------------------------
//database

//queriy
//CREATE DATABASE IF NOT EXISTS Colleges;

//USE Colleges;

//CREATE TABLE IF NOT EXISTS Courses (
 //   course_id INT AUTO_INCREMENT PRIMARY KEY,
  //  course_name VARCHAR(100) NOT NULL,
    //duration INT,
   // instructor VARCHAR(100),
   // credits INT
  //);
