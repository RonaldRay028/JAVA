public class Employee {
    private String name;
    private int number;
    private double salary;

    public double calculate_tax() {
        // checking if the user's salary is over 20_000 and less than 40_000
        double tax_percentage_20 = (salary > 20_000.0 && salary < 40_000.0)?(salary*0.2):(salary*0.25);
        // checking if the user's salary is over 10_000 and less than of equal to 20_000
        double tax_percentage_10 = (salary > 10_000.0 && salary <=20_000.0)?(salary*0.1):(tax_percentage_20);
        // checking if the user's salary is less than 10_000 or greater than 10_000
        // if the salary is less than 10_000 the tax amount is 0
        double tax_amount = ( salary <= 10_000.0)?(0):(tax_percentage_10);

        return tax_amount ;
    }
    public double tax_percentage(){
        // getting the tax percentage by using the tax amount
        double tax = calculate_tax()/salary * 100;
        return tax;
    }
    public void Display(){
        // display table
        System.out.println("Name\t\t Employee No\t\t Salary\t\t\t After Tax\t\t Tax value ");
        System.out.print(name + "\t\t " + number + "\t\t\t\t R" + salary + "\t\t R" + (salary - calculate_tax()));
        System.out.print("\t\t " + tax_percentage() +"%");

    }
    //constructors
    Employee(){
        name = "LOVEDAY";
        number = 1010 ;
        salary = 700_000;
    }
    Employee(String user_name, int user_number, double user_salary){
        name = user_name;
        number = user_number;
        salary = user_salary;

    }

}
