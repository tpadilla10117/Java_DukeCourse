package practice;

/* public class Function2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        int z = calcOne(x, y);
        int result = calcTwo(z);

        System.out.println(result);
    };

    public static int calcOne(int x, int y) {
        int z = x + y;
        return z;
    };

    public static int calcTwo(int a) {
        int z = a * 9;

        return z;
    };
} */

public class Conditionals {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        System.out.println(testConditionals(x, y));

    };

    public static int testConditionals(int a, int b) {
        if( a < b ) {
            return b;
        } else {
            return a;
        }
    };
}
