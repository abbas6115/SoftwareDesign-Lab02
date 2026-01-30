// Reads a CSV dataset and saves the items to an ArrayList to use/manipulate

import java.io.*;
import java.util.ArrayList;

public class DatabaseInteractor {
    public static final String DELIMITER = ",";
    public static final String FILE_NAME = "data.csv";
    public ArrayList<String[]> data; // each line is a String array

    // constructors
    public DatabaseInteractor() {
        data = new ArrayList<String[]>();
        readCSV(FILE_NAME);
    }

    public void readCSV(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] values = line.split(DELIMITER);
                data.add(values);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToCSV(String ID, String name, String description) {
        String[] entry = {ID, name, description};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            String line = String.join(DELIMITER, entry);
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}