/* 1. Create a new Java Class named Part2 in the StringsFirstAssignments project.

2. Copy and paste the two methods findSimpleGene and testSimpleGene  from the Part1 class into the Part2 class.

3. The method findSimpleGene has one parameter for the DNA string named dna. Modify findSimpleGene to add two additional parameters, one named startCodon for the start codon and one named stopCodon for the stop codon. What additional changes do you need to make for the program to compile? After making all changes, run your program to check that you get the same output as before.

4. Modify the findSimpleGene method to work with DNA strings that are either all uppercase letters such as “ATGGGTTAAGTC” or all lowercase letters such as “gatgctataat”. Calling findSimpleGene with “ATGGGTTAAGTC” should return the answer with uppercase letters, the gene “ATGGGTTAA”, and calling findSimpleGene with  “gatgctataat” should return the answer with lowercase letters, the gene “atgctataa”. HINT: there are two string methods toUpperCase() and toLowerCase(). If dna is the string “ATGTAA” then dna.toLowerCase() results in the string “atgtaa”. */


package stringsFirstAssignments;

public class Part2 {
    
    public String findSimpleGene(String dna, String startCodon, String stopCodon) {
        String result = "";
        int startIndex = dna.indexOf(startCodon);
        if (startIndex == -1) {
            return result;
        }
        int stopIndex = dna.indexOf(stopCodon, startIndex + 3);
        if (stopIndex == -1) {
            return result;
        }
        if ((stopIndex - startIndex) % 3 == 0) {
            result = dna.substring(startIndex, stopIndex + 3);
        }
        return result;
    }

    public void testSimpleGene() {
        String[] dnaStrings = {"ATCGCGTAATAGCTGACTGACATCG", "CGCGTAAATCGACTGACGACGACG", 
            "ATCGCGTACGACTGACATCGACTGACGTAA", "ATGCGTAACTGACTGACGATCG", 
            "ATGCGTAACTGACGACGACTAACTGACGACG"};
        for (String dna : dnaStrings) {
            System.out.println("DNA string: " + dna);
            String gene = findSimpleGene(dna, "ATG", "TAA");
            System.out.println("Gene: " + gene);
        }
    }

    public static void main(String[] args) {
        Part2 geneFinder = new Part2();
        geneFinder.testSimpleGene();
    }
}
