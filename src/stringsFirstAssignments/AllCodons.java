package stringsFirstAssignments;

public class AllCodons {

    public int findStopCodon(String dnaStr, int startIndex, String stopCodon) {
        int currIndex = dnaStr.indexOf(stopCodon, startIndex);

        while(currIndex != -1) {
            int diff = currIndex - startIndex;

            if (diff % 3 == 0) {
                return currIndex;
            } else {
                currIndex = dnaStr.indexOf(stopCodon, currIndex + 1);
            }
        }

        return dnaStr.length();
    };

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");

        if (startIndex == -1) {
            return "";
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        int temp = Math.min(taaIndex, tagIndex);
        int minIndex = Math.min(temp, tgaIndex);

        if (minIndex == dna.length()) {
            return "";
        }


        return dna.substring(startIndex, minIndex + 3);
    }
    public static void main(String[] args) {
        AllCodons geneFinder = new AllCodons();
        String testString = "ATGAAATAGTAGTAA";
        String gene = geneFinder.findGene(testString);

        System.out.println(gene);

    };
}
