package OOPS.AnatherPackage;

import OOPS.Encapsulation.Teacher;

public class AntherMain extends Teacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.teachingClass = 8;
//        teacher.salary = 20000; // This throw error because has private access
//        teacher.degree = "MSC"; //'degree' is not public. Cannot be accessed from outside package

        AntherMain antherMain = new AntherMain();
        antherMain.studentCount = 300;
    }
}


