//Imagine an HR system where all employees get a base salary and a performance bonus calculation.
//A regular Employee has a name, a base salary, and a standard bonus method.
//A Manager inherits everything from Employee but has a unique teamSize property.
//The Manager overrides the bonus calculation to add an extra $500 for every team member they manage,
//  while still keeping the base bonus from the parent class.

class Employee{
    String empName;
    double baseSalary;

    public Employee(String empName, double baseSalary) {
        this.empName = empName;
        this.baseSalary = baseSalary;
    }

    public double calculateBonus(){
        return this.baseSalary * 0.10;
    }
}

class Manager extends Employee{

    int teamSize;


    public Manager(String empName, double baseSalary, int teamSize) {
        super(empName, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateBonus() {
        double baseBonus = super.calculateBonus();
        double teamBonus = this.teamSize*500;

        return baseBonus+teamBonus;
    }
}

public class EmployeeBonusSystem {
    public static void main(String[] args) {

        Employee manager = new Manager("Kalu", 2000000.00, 12);

        System.out.println("Manager Bonus: " + manager.calculateBonus());
    }
}
