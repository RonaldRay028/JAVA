public class QUESTION1 {
    static class employee{
        String name ;
        int number;
        double salary;

        double calculateTax( double salary){
            double taxAmount = (salary <=10000 )?(0)
                    : (salary > 10000 && salary <= 20000)?(salary * 0.1)
                    :(salary > 20000 && salary <= 40000)?(salary*0.2):(salary*0.25);
            return taxAmount;
        }

        double taxPercent( double salary){
            double percent;
           return percent = (calculateTax(salary)/salary)*100 ;

        }
        void display(){
            System.out.println("Name\t\t\tEmployee No\t\tSalary\t\tAfter Tax\t\tTax Value");
            System.out.println(name+ "\t\t" + number + "\t\t\tR" + salary + "\tR" + (salary-calculateTax(salary)) +
                    "\t\t\t" + taxPercent(salary) +"%");
        }
        employee(){
            name ="Thandeka";
            number = 1010;
            salary = 700000;
        }
    }
    public static void main(String[] args) {

        employee employee1 = new employee();
        employee1.display();
    }
}
