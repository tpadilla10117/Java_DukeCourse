package practice;

/* public class FunctionPractice {
    public static void main(String[] args) {
        int x = 4;
        int y = 4;

        int z = myFunction(x, y);
        System.out.println(z);
    };

    public static int myFunction(int x, int y) {
        int z = x + y;
        return z;
    }
} */

public class Function2 {
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
}
