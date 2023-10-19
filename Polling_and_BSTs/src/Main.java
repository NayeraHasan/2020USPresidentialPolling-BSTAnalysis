import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * The Main class is the entry point of the program that reads CSV files containing
 * candidate data and stores it in a LinkedBinarySearchTree.
 */
public class Main {

    /**
     * The main method of the program that reads CSV files, parses candidate data,
     * and populates a LinkedBinarySearchTree with Candidate objects.
     *
     * @param args An array of command-line arguments containing file paths to CSV files.
     * @throws FileNotFoundException If a specified CSV file is not found.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Create a LinkedBinarySearchTree to store Candidate objects
        LinkedBinarySearchTree<Candidate> candidatesData = new LinkedBinarySearchTree<>();

        // Loop through each file specified in the command-line arguments
        for (String fileName : args) {
            // Create a CSVReader to read the CSV file
            CSVReader reader = new CSVReader();

            // Open the CSV file for reading
            FileReader input = new FileReader(fileName);

            // Read the CSV data into an ArrayList of String arrays
            ArrayList<String[]> csvData = reader.read(input);

            // Loop through each row of CSV data
            for (String[] candidateDataArray : csvData) {
                // Create a new Candidate object using the data from the CSV row
                Candidate newCandidate = new Candidate(candidateDataArray[1], candidateDataArray[0], Double.parseDouble(candidateDataArray[2]));

                // Insert the new Candidate object into the LinkedBinarySearchTree
                candidatesData.insert(newCandidate);
            }
        }

        // Print the contents of the LinkedBinarySearchTree
        System.out.println(candidatesData.toString());
    }
}
