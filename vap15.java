
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class vap15 {
    public static void main(String[] args) {

        // Connect to MySQL without specifying a database
        String url = "jdbc:mysql://localhost:3306/?serverTimezone=UTC";

        String user = "root"; // Use your actual MySQL username

        String password = "password"; // Use your actual MySQL password

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL server
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();

            // 1. Create Database
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS Companies");

            // 2. Switch to Companies database
            stmt.execute("USE Companies");

            // 3. Create Dummy_technologies Table
            String createTableSQL = """
                CREATE TABLE IF NOT EXISTS Dummy_technologies (
                    tech_id INT AUTO_INCREMENT PRIMARY KEY,
                    tech_name VARCHAR(100) NOT NULL,
                    version VARCHAR(20),
                    released_year INT,
                    is_open_source BOOLEAN
                );
            """;

            stmt.executeUpdate(createTableSQL);

            System.out.println("Database 'Companies' and table 'Dummy_technologies' created successfully.");

            // Close resources
            stmt.close();
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}










