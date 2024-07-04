package EmployeeCrud;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            System.out.println("-----Employee Management-----");
            System.out.println("Choose Operation: ");
            System.out.println(" 1 - New Employee \n 2 - Update Employee \n 3 - Read Employee \n 4 - Read Single Employee \n 5 - Delete Employee");
            System.out.print("Press Key: ");
            Scanner sc = new Scanner(System.in);
            int operation = sc.nextInt();

            if(operation != 1 && operation != 2 && operation != 3 && operation != 4 && operation != 5){
                break;
            }

            sc.nextLine();

            switch (operation){
                case 1:
                    System.out.println("Add New Employee");
                    System.out.print("Employee id: ");
                    String id = sc.nextLine();
                    System.out.print("Employee name: ");
                    String name = sc.nextLine();
                    System.out.print("Employee email: ");
                    String email = sc.nextLine();
                    System.out.print("Employee salary: ");
                    int salary = sc.nextInt();

                    Employee employee = new Employee(id, name, email, salary);
                    DAO.createEmployee(employee);
                    break;
                case 2:
                    System.out.println("Update Employee");
                    System.out.print("Employee id: ");
                    String uid = sc.nextLine();
                    System.out.print("Employee name: ");
                    String uname = sc.nextLine();
                    System.out.print("Employee email: ");
                    String uemail = sc.nextLine();
                    System.out.print("Employee salary: ");
                    int usalary = sc.nextInt();

                    Employee uemployee = new Employee(uid, uname, uemail, usalary);
                    DAO.updateEmployee(uemployee);
                    break;
                case 3:
                    System.out.println("All Employee");
                    ArrayList<Employee> empList = DAO.readEmployee();
//                    for(Employee emp : empList){
//                        System.out.println(emp);
//                    }
                    System.out.println(empList);
                    break;
                case 4:
                    System.out.println("Single Employee");
                    System.out.print("Employee id: ");
                    String sid = sc.nextLine();
                    Employee singleEmployee = DAO.singleEmployeeRecord(sid);
                    System.out.println(singleEmployee);
                    break;
                case 5:
                    System.out.println("Delete Employee");
                    System.out.print("Employee id: ");
                    String did = sc.nextLine();
                    DAO.deleteEmployee(did);
                    break;
            }
        }
    }
}
