package practice;
/* Package = in Java, a package is a group of classes that are grouped together and held in one place, similar to how you might put all of your files for one course or project in the same folder in your computer */

/* You cannot directly call a method like println() outside of a method, constructor, or static block. */

/* This code declares a class called Practice with a main method, which is the entry point for the program. Inside the main method, the integer variable x is declared and initialized to the value of 4. Then the println() method is used to print the value of x to the console. */

/* EG: */
/* public class Practice {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(x);
    }
}
 */

/* You cannot declare a function inside the main method directly. In Java, functions or methods are declared outside of the main method and the class body. */
/* 
public class FunctionPractice {
    public static void main(String[] args) {
        int x = 4;
        int y = 4;

        int z = myFunction(x, y);
        System.out.println(z);
    }

    public static int myFunction(int x, int y) {
        int z = x - y;
        return z;
    }
} */

public class FunctionPractice {
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
}