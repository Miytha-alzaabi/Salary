import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
     String name;
    double salary;

     Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
public class Main {
    

    public static void main(String[] args) {
         
         
     static List<Employee> employees = new ArrayList<>();
        Scanner read = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create Add Employee. \n 2. Show Employee Details. \n 3. Exit");
            System.out.print("Enter your Choice: ");
            int choice = read.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Employee Name: ");
                    read.nextLine();
                    String name = read.nextLine();
                    System.out.print("Enter Employee Salary: ");
                    double salary = read.nextDouble();
                    employees.add(new Employee(name, salary));
                    System.out.println("Employee Added Successfully.");
                    break;
                case 2:
                    System.out.println("Employee salaries:");
                    for (Employee employee : employees) {
                        System.out.println(" Employee: "+employee.getName() + ": with " + employee.getSalary()+" OMR Salary");
                    }
                    break;
                case 3:
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
