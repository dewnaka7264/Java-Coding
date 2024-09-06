import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        // Create a File object
        File file = new File("my_file.txt");

        // Check if the file exists
        if (!file.exists()) {
            // Create the file
            file.createNewFile();
        }

        // Create a FileWriter object
        FileWriter fileWriter = new FileWriter(file);

        // Create a BufferedWriter object
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        // Write some data to the file
        bufferedWriter.write("This is some data to write to the file.");
        bufferedWriter.newLine();

        // Close the BufferedWriter object
        bufferedWriter.close();

        // Create a FileReader object
        FileReader fileReader = new FileReader(file);

        // Create a BufferedReader object
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        // Read the data from the file
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            // Do something with the line
            System.out.println(line);
        }

        // Close the BufferedReader object
        bufferedReader.close();
    }
}