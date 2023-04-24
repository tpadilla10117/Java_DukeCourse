/* Part 3: Problem Solving with Strings
This assignment will give you additional practice using String methods. You will write two methods to solve some problems using strings and a third method to test these two methods.

Specifically, you should do the following:

1. Create a new Java Class named Part3 in the StringsFirstAssignments project. Put the following methods in this class.

2. Write the method named twoOccurrences that has two String parameters named stringa and stringb. This method returns true if stringa appears at least twice in stringb, otherwise it returns false. For example, the call twoOccurrences(“by”, “A story by Abby Long”) returns true as there are two occurrences of “by”, the call twoOccurrences(“a”, “banana”) returns true as there are three occurrences of “a” so “a” occurs at least twice, and the call twoOccurrences(“atg”, “ctgtatgta”) returns false as there is only one occurence of “atg”.

3. Write the void method named testing that has no parameters. This method should call twoOccurrences on several pairs of strings and print the strings and the result of calling twoOccurrences (true or false) for each pair. Be sure to test examples that should result in true and examples that should result in false.

4. Write the method named lastPart that has two String parameters named stringa and stringb. This method finds the first occurrence of stringa in stringb, and returns the part of stringb that follows stringa.  If stringa does not occur in stringb, then return stringb. For example, the call lastPart(“an”, “banana”) returns the string “ana”, the part of the string after the first “an”. The call lastPart(“zoo”, “forest”) returns the string “forest” since “zoo” does not appear in that word.

5. Add code to the method testing to call the method lastPart with several pairs of strings. For each call print the strings passed in and the result. For example, the output for the two calls above might be:

The part of the string after an in banana is ana.

The part of the string after zoo in forest is forest.

 */

package stringsFirstAssignments;

public class Part3 {

    public boolean twoOccurrences(String stringa, String stringb) {
        int index = stringb.indexOf(stringa);
        if (index != -1) {
            index = stringb.indexOf(stringa, index + stringa.length());
            if (index != -1) {
                return true;
            }
        }
        return false;
    }

    public void testing() {
        String[] pairsStringa = {"by", "a", "atg", "a", "ana"};
        String[] pairsStringb = {"A story by Abby Long", "banana", "ctgtatgta", "banana", "banana"};
        for (int i = 0; i < pairsStringa.length; i++) {
            System.out.println("stringa: " + pairsStringa[i] + ", stringb: " + pairsStringb[i] +
                    ", twoOccurrences: " + twoOccurrences(pairsStringa[i], pairsStringb[i]));
        }
    }

    public String lastPart(String stringa, String stringb) {
        int index = stringb.indexOf(stringa);
        if (index != -1) {
            return stringb.substring(index + stringa.length());
        } else {
            return stringb;
        }
    }

    public void testingLastPart() {
        String[] pairsStringa = {"an", "zoo", "atg", "boo", "hey"};
        String[] pairsStringb = {"banana", "forest", "ctgtatgta", "booboo", "haystack"};
        for (int i = 0; i < pairsStringa.length; i++) {
            System.out.println("stringa: " + pairsStringa[i] + ", stringb: " + pairsStringb[i] +
                    ", lastPart: " + lastPart(pairsStringa[i], pairsStringb[i]));
        }
    }

    public static void main(String[] args) {
        Part3 part3 = new Part3();

        // testing twoOccurrences method
        part3.testing();

        // testing lastPart method
        part3.testingLastPart();
    }
}
