/* 
 *How to run and compile in Eclipse with "javac and java" commands:

    1) Open the terminal and navigate to the directory where your Java file is saved.

    2) Compile the Java file using the "javac" command followed by the name of your Java file. For example, if your file is named "HelloWorld.java", the command would be:

    javac HelloWorld.java


    3) Run the compiled Java program using the "java" command followed by the name of the class file (without the .class extension). For example, if your class file is named "HelloWorld.class", the command would be:

    java HelloWorld


    - This will execute the Java program and display the output in the terminal.

    4) Note that in order to run Java from the terminal, you need to have the Java Development Kit (JDK) installed on your system and the "java" and "javac" commands must be added to your system's PATH environment variable.


    5) To run in a package, need to start from the parent directory: e.g. java practice.FunctionPractice

 * 
 * 
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}
