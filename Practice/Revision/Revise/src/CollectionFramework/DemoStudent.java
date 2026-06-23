package CollectionFramework;

import java.util.Objects;

public class DemoStudent {
    String name;
    int rollno;


    public DemoStudent(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DemoStudent that = (DemoStudent) o;
        return rollno == that.rollno;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollno);
    }

    @Override
    public String toString() {
        return "DemoStudent{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                "}\n";
    }
}
