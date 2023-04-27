package csvMax;
import edu.duke.*;

import java.io.File;

import org.apache.commons.csv.*;
/* import java.io.*; */

public class CSVMax {
    public CSVRecord hottestHourInFile(CSVParser parser) {
        CSVRecord largestSoFar = null;

        for (CSVRecord currentRow : parser) {
            if (largestSoFar == null) {
                largestSoFar = currentRow;
            } else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));

                if(currentTemp > largestTemp) {
                    largestSoFar = currentRow;
                }
            }
        }

        return largestSoFar;

    };


    public CSVRecord hottestInManyDays() {
        DirectoryResource dr = new DirectoryResource();

        CSVRecord largestSoFar = null;

        for (File f: dr.selectedFiles()) {
            FileResource fr = new FileResource(f);

            CSVRecord currentRow = hottestHourInFile(fr.getCSVParser());

            if (largestSoFar == null) {
                largestSoFar = currentRow;
            } else {
                double currentTemp = Double.parseDouble(currentRow.get("TemperatureF"));
                double largestTemp = Double.parseDouble(largestSoFar.get("TemperatureF"));

                if(currentTemp > largestTemp) {
                    largestSoFar = currentRow;
                }
            }
        }

        return largestSoFar;
    
    };
};


