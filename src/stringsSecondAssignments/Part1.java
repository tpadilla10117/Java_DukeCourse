package stringsSecondAssignments;

public class Part1 {

    // startIndex that represents where the first occurrence of ATG occurs in dna

    //This method returns the index of the first occurrence of stopCodon that appears past startIndex and is a multiple of 3 away from startIndex. If there is no such stopCodon, this method returns the length of the dna strand.

    public int findStopCodon(String dna, int startIndex, String stopCodon) {

        /* int currIndex = dna.indexOf(stopCodon, ) */

        return dna.length();
    }



    /* Find the index of the first occurrence of the start codon “ATG”. If there is no “ATG”, return the empty string.

Find the index of the first occurrence of the stop codon “TAA” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Hint: call findStopCodon.

Find the index of the first occurrence of the stop codon “TAG” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. Find the index of the first occurrence of the stop codon “TGA” after the first occurrence of “ATG” that is a multiple of three away from the “ATG”. 

Return the gene formed from the “ATG” and the closest stop codon that is a multiple of three away. If there is no valid stop codon and therefore no gene, return the empty string. */

    public String findGene(String dna) {
        int startIndex = dna.indexOf("ATG");

        if (startIndex == -1) {
            return "";
        };

        int taaIndex = findStopCodon(dna, startIndex, "TAA");
        int tagIndex = findStopCodon(dna, startIndex, "TAG");
        int tgaIndex = findStopCodon(dna, startIndex, "TGA");

        return "";
    }

    public static void main(String[] args) {

    };
    
}
