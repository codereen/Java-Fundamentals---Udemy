package controlFlow;

public class Switch {
    public static void main(String args[]) {
        String grade = "z";
        switch (grade) {
            case "A+":
                System.out.println("great");
                break;
            case "B+":
            case "B":
            case "B-":
                System.out.println("good");
                break;
            default:
                System.out.println("Failed");
                break;
        }
    }
}
