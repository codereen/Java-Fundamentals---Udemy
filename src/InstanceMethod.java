class Student{
    public void name_of_student(String name){
        System.out.println(String.format("Student name is %s", name));
    }

    public void grade(double grade){
        System.out.println(String.format("Student grade is %.2f", grade));
    }
}


public class InstanceMethod {
    public static void main(String[] args){
        Student student1 = new Student();
        student1.name_of_student("Stacy");
        student1.grade(4.231);
    }
}
