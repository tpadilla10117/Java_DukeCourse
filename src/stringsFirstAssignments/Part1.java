package stringsFirstAssignments;

public class Part1 {
    
    public String findSimpleGene(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return result;
        }
        int stopIndex = dna.indexOf("TAA", startIndex + 3);
        if (stopIndex == -1) {
            return result;
        }
        if ((stopIndex - startIndex) % 3 == 0) {
            result = dna.substring(startIndex, stopIndex + 3);
        }
        return result;
    }

    public void testSimpleGene() {
        String[] dnaStrings = {"AAATGCCCTAACTAGATTAAGAAACC"};
        for (String dna : dnaStrings) {
            System.out.println("DNA string: " + dna);
            String gene = findSimpleGene(dna);
            System.out.println("Gene: " + gene);
        }
    }

    public static void main(String[] args) {
        Part1 part1 = new Part1();
        part1.testSimpleGene();
    }
}
