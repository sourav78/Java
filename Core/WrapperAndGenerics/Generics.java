package WrapperAndGenerics;

public class Generics {
    public static void main(String[] args) {

        GenZ<String> g1 = new GenZ<>("ju876");
        System.out.println(g1.getId());
        System.out.println(g1.getId().getClass());
        GenZ<Integer> g2 = new GenZ<>(123);
        System.out.println(g2.getId());

        Employee<String, Double> emp = new Employee<>("SDA123", 4500.99);
        System.out.println(emp.getSalary());

        Employee<String, Integer> emp2 = new Employee<>("SDA123", 90000);
        System.out.println(emp.getSalary());

        //Here we can not provided salary type string.
//        Employee<String, String> emp3 = new Employee<>("SDA123", "67000");
//        System.out.println(emp.getSalary());
    }
}

class GenZ <T> {
    T id;

    public GenZ(T id){
        this.id = id;
    }

    public T getId(){
        return this.id;
    }
}

class Employee <I, S extends Number> { //Here the S type is only support Number type value
    I id;
    private S salary;

    public Employee(I id, S salary){
        this.id = id;
        this.salary = salary;
    }

    public S getSalary(){
        return this.salary;
    }
}
