package OOPS;

public class SuperKeyword {
    public static void main(String[] args) {
        Employee emp = new Employee("TCS", "Ashutosh");
        emp.printDetails();
    }
}

class Company{
    String companyName;

    public Company(String companyName){
        this.companyName = companyName;
    }

    void printDetails(){
        System.out.println(companyName+" company.");
    }
}

class Employee extends Company{

    String employeeName;

    public Employee(String companyName, String employeeName){
        super(companyName);
        this.employeeName = employeeName;
    }

    void printDetails(){
        super.printDetails();
        System.out.println("Employee name: "+employeeName);
        System.out.println("Worked on: "+companyName);
    }
}