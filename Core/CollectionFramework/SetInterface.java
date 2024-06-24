package CollectionFramework;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(20);
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(70);

        System.out.println(set);

        System.out.println(set.contains(40));
        System.out.println(set.contains(30));

        set.remove(40);
        System.out.println(set);


        //Custom class object in hashSet

        HashSet<Student> students = new HashSet<>();

        students.add(new Student(10, "Sourav"));
        students.add(new Student(11, "Hari"));
        students.add(new Student(10, "Moon"));

        System.out.println(students); // The student named "moon" is not inserted into students set because that roll no is same as "Sourav"
    }
}

class Student{
    int rollno;
    String name;

    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollno == student.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollno);
    }

    @Override
    public String toString() {
        return "\n{" +
                "rollno=" + rollno +
                ", name='" + name + '\'' +
                "}";
    }
}
