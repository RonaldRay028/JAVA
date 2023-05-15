import java.util.*;
public class EmployeeTax {

    public static void main(String[] args){
        // creating an object for the scanner class
        Scanner input = new Scanner(System.in);
        // creating an object for the employee
        Employee user = new Employee();
        user.Display();

        String name;
        int employeeNo;
        double salary;

        // prompt user to enter to the employee details
        System.out.println();
        System.out.print("Enter the employees name : ");
        name = input.nextLine();
        System.out.print("Enter the employees number : ");
        employeeNo = input.nextInt();
        System.out.print("Enter the employees salary : ");
        salary = input.nextDouble();

        Employee user_1 = new Employee(name, employeeNo,salary);
        user_1.Display();

    }
}
