package methods;

public class BooleanMethod {
    public static void main(String args[]) {
        System.out.println(isEven(67));
        System.out.println(isEven(44));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) return true;
        return false;
    }
}
