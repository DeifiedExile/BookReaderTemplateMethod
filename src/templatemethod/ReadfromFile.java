package templatemethod;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadfromFile extends BookReader {

    
    String fileName = "prideprejudice.txt";
    BufferedReader in = null;
    @Override
    void initialize() {
        // Modify this method to open the file prideprejudice.txt (included with project)
        try {
            in = new BufferedReader(new FileReader(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("File Open Error: " + fileName + " " + e);
        }
        System.out.println("Open an input file");
    }

    @Override
    void startReading() {
        
        // Modify this method to read lines from the file and print each line to standard output
        String line;
        try {
            while ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("File Write Error: " + fileName + " " + e);
        }
        System.out.println("Loop writing out each record");
    }

    @Override
    void stopReading() {
        // Modify this method to close the file
        if (in != null) {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Close input file");
    }
}
