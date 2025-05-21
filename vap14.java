
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class vap14 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/companies?serverTimezone=UTC";
        String user = "root"; // Replace with your MySQL username
        String password = "password"; // Replace with your MySQL password

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);

            String insertSQL = "INSERT INTO Dummy_technologies (tech_name, version, released_year, is_open_source) VALUES (?, ?, ?, ?)";

            PreparedStatement pstmt = conn.prepareStatement(insertSQL);

            // Record 1
            pstmt.setString(1, "Java");
            pstmt.setString(2, "17");
            pstmt.setInt(3, 2021);
            pstmt.setBoolean(4, true);
            pstmt.executeUpdate();

            // Record 2
            pstmt.setString(1, "Python");
            pstmt.setString(2, "3.11");
            pstmt.setInt(3, 2022);
            pstmt.setBoolean(4, true);
            pstmt.executeUpdate();

            // Record 3
            pstmt.setString(1, "Oracle DB");
            pstmt.setString(2, "19c");
            pstmt.setInt(3, 2019);
            pstmt.setBoolean(4, false);
            pstmt.executeUpdate();

            // Record 4
            pstmt.setString(1, "Docker");
            pstmt.setString(2, "24.0");
            pstmt.setInt(3, 2023);
            pstmt.setBoolean(4, true);
            pstmt.executeUpdate();

            // Record 5
            pstmt.setString(1, "Microsoft .NET");
            pstmt.setString(2, "6.0");
            pstmt.setInt(3, 2021);
            pstmt.setBoolean(4, false);
            pstmt.executeUpdate();

            System.out.println("5 records inserted successfully into Dummy_technologies.");

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


