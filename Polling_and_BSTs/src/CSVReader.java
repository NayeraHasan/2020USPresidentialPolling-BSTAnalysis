import java.io.*;
import java.util.ArrayList;
/**
 * A Java class for reading CSV files and storing the data as an ArrayList of String arrays.
 * This class is designed to be used for reading CSV files and extracting data from them.
 */
public class CSVReader {

    BufferedReader br;

    /**
     * Reads the contents of a CSV file and returns them as an ArrayList of String arrays.
     * @param csvFile The FileReader object representing the CSV file to be read.
     * @return An ArrayList of String arrays where each array represents a line from the CSV file.
     */
    public ArrayList<String[]> read(FileReader csvFile){
        ArrayList<String[]> eachLine = new ArrayList<String[]>();

        try {
            br = new BufferedReader(csvFile);
            String line = "";
            String[] tempArr;
            br.readLine(); // Skip the header line
            while((line = br.readLine()) != null) {
                tempArr = line.split(",");
                eachLine.add(tempArr);
            }

        } catch(IOException ioe) {
            ioe.printStackTrace();
        }
        return(eachLine); // output as ArrayList of Strings.
    }

    /**
     * Closes the underlying buffered reader used for reading the CSV file.
     */
    public void close(){
        try {
            br.close();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
}
