//Use the table dummy_technologies of the database companies created in assignment no. 2 of session 28. Read the company's name from the user and delete the matching records(rows).


    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class vap17 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companies?serverTimezone=UTC";
        String user = "root"; // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        Scanner scanner = new Scanner(System.in);

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to the companies database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Read tech_name (company name) from user
            System.out.print("Enter the technology name to delete: ");
            String techName = scanner.nextLine();

            // Prepare DELETE SQL statement
            String sql = "DELETE FROM dummy_technologies WHERE tech_name = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Set parameter
            pstmt.setString(1, techName);

            // Execute update
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println(rowsDeleted + " record(s) deleted successfully.");
            } else {
                System.out.println("No matching records found.");
            }

            // Close connections
            pstmt.close();
            conn.close();
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


