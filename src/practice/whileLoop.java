package practice;

public class whileLoop {

    public static void testWhileLoop(int a, int b) {
        while (a < b) {
            System.out.println(a);
            a++;
        }
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 10;

        testWhileLoop(x, y);
    }
}
