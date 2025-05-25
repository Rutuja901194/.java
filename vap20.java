

//Use the file “myfile.txt” created in assignment number 2 of this session. Now, copy all the contents of this file into another file with the name “myfile_copy.txt”.

    import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;

public class vap20 {

    public static void main(String[] args) {
        // Define paths
        String folder = "MKCL";
        String sourceFileName = "myfile.txt";
        String destFileName = "myfile_copy.txt";

        File sourceFile = new File(folder, sourceFileName);
        File destFile = new File(folder, destFileName);

        try (
            FileReader reader = new FileReader(sourceFile);
            FileWriter writer = new FileWriter(destFile);
        ) {
            int ch;
            while ((ch = reader.read()) != -1) {
                writer.write(ch);
            }

            System.out.println("File copied successfully to 'myfile_copy.txt'.");

        } catch (IOException e) {
            System.out.println("Error occurred during file copy.");
            e.printStackTrace();
        }
    }
}


