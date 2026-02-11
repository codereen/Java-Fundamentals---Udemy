package strings;

public class StringInterpolation {
    public static void main(String args[]){
        String custName = "Ken";
        String streetName = "29 Myrtle Rd";
        int age = 78;
        String city = "Sydney";
        String state = "NSW";
        String zipCode = "2200";
        String country = "Australia";

        System.out.println(String.format("Student details: name:%s, age:%d, address:%s, City:%s, Country:%s",
                custName, age, streetName, city, country));
    }
}