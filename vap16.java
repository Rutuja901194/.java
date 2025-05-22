//Use the table dummy_technologies of the database companies created in assignment no. 2 of session 28. Read the values of fields(column names) from the user and insert the row into the table.

    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class vap16 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companies?serverTimezone=UTC";
        String user = "root"; // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        Scanner scanner = new Scanner(System.in);

        try {
            // Step 1: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Connect to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Step 3: Prepare SQL insert statement
            String sql = "INSERT INTO dummy_technologies (tech_name, version, released_year, is_open_source) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            // Step 4: Read user input
            System.out.print("Enter technology name: ");
            String techName = scanner.nextLine();

            System.out.print("Enter version: ");
            String version = scanner.nextLine();

            System.out.print("Enter released year: ");
            int releasedYear = scanner.nextInt();

            System.out.print("Is it open source? (true/false): ");
            boolean isOpenSource = scanner.nextBoolean();

            // Step 5: Set values and execute insert
            pstmt.setString(1, techName);
            pstmt.setString(2, version);
            pstmt.setInt(3, releasedYear);
            pstmt.setBoolean(4, isOpenSource);

            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) inserted successfully.");

            // Step 6: Close resources
            pstmt.close();
            conn.close();
            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


