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

        return -1;
    };

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");

        if (startIndex == -1) {
            return "";
        }

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

       /*  int temp = Math.min(taaIndex, tagIndex);
        int minIndex = Math.min(temp, tgaIndex); */

        int minIndex = 0;

        if (taaIndex == -1 || (tgaIndex != -1 && tgaIndex < taaIndex)) {
            minIndex = tgaIndex;
        } else {
            minIndex = taaIndex;
        }

        if (minIndex == -1 || (tagIndex != -1 && tagIndex < minIndex)) {
            minIndex = tagIndex;
        }

        if (minIndex == -1) {
            return "";
        }


        return dna.substring(startIndex, minIndex + 3);
    }
    public static void main(String[] args) {
        AllCodons geneFinder = new AllCodons();
        String testString =  "AATGCTAACTAGCTGACTAAT";
        String gene = geneFinder.findGene(testString);

        System.out.println(gene);

    };
}
