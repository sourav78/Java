package OOPS.Encapsulation;

public class MainClass {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teachingClass = 7;
//        teacher.salary = 20000; // This throw error because has private access
        teacher.degree = "PHD";
        teacher.studentCount = 200;
    }
}
