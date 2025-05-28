
//Write a program that reads the following variables using BufferedReader class.

    import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class vap21 {

    public static void main(String[] args) {
        // BufferedReader setup
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Read string
            System.out.print("Enter your name: ");
            String name = reader.readLine();

            // Read int
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(reader.readLine());

            // Read double
            System.out.print("Enter your salary: ");
            double salary = Double.parseDouble(reader.readLine());

            // Read boolean
            System.out.print("Are you employed? (true/false): ");
            boolean isEmployed = Boolean.parseBoolean(reader.readLine());

            // Display collected data
            System.out.println("\n--- User Details ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
            System.out.println("Employed: " + isEmployed);

        } catch (IOException e) {
            System.out.println("Input error occurred.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            e.printStackTrace();
        }
    }
}


