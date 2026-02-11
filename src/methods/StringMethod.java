package methods;

public class StringMethod {
    public static void main(String args[]) {
        System.out.println(greet("John"));
    }

    public static String greet(String name) {
        return String.format("Hello, %s. Welcome to Java", name);
    }
}


