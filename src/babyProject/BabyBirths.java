package babyProject;
import edu.duke.*;
import org.apache.commons.csv.*;

public class BabyBirths {
    public void printNames() {
        FileResource fr = new FileResource();

        /* This is data instead of header row: */
        for (CSVRecord rec :fr.getCSVParser(false)) {
            System.out.println("Name " + rec.get(0) + " Gender " + rec.get(1) + " Num Born " + rec.get(2));
        };
    }
}
