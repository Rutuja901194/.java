
//Create a file in Notepad with the name “myfile.txt” in the folder MKCL. Type the following matter.


    import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class vap19 {

    public static void main(String[] args) {
        // Define folder and file paths
        String folderName = "MKCL";
        String fileName = "myfile.txt";
        String content = """
            This is a sample file created using Advanced Java.
            The file is stored inside the MKCL folder.
            Java File I/O is powerful and flexible.
            """;

        try {
            // Create folder if it doesn't exist
            File folder = new File(folderName);
            if (!folder.exists()) {
                folder.mkdir();
                System.out.println("Folder 'MKCL' created.");
            }

            // Create file object
            File file = new File(folder, fileName);

            // Create FileWriter to write to the file
            FileWriter writer = new FileWriter(file);
            writer.write(content);
            writer.close();

            System.out.println("File 'myfile.txt' created successfully in folder 'MKCL'.");

        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }
}


