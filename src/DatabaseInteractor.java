// Reads a CSV dataset and saves the items to an ArrayList to use/manipulate

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class DatabaseInteractor {
    private static final String DELIMITER = ",";
    private ArrayList<String[]> data; // each line is a String array

    // constructors
    public DatabaseInteractor() {
        data = null;
    }

    public DatabaseInteractor(String filename) {
        readCSV(filename);
    }

    private void readCSV(String filename) {
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
}
