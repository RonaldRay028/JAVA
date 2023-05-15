public class Question_1 {
    public static void main(String[] args){
        Employee user = new Employee();
        user.display();
    }
    public static class Employee {
        private String Name ;
        private int Number;
        private double Salary;

        public double CalculateTax( double salary){
            //ternary operator
            double Tax = (salary <= 10000)?(salary*0)
                    :(salary > 10000 && salary <= 20000)?(salary*0.1)
                    :(salary > 20000 && salary <= 40000)?(salary*0.2)
                    :(salary*0.25);

            return Tax;
        }
        public double TaxPercentage( double salary){
            Double percentage = (((CalculateTax(salary))/salary)*100);
            return percentage;
        }
        public void display(){
            System.out.println("Name\t\t\tEmployee No\t\tSalary\t\tAfter Tax\t\tTax Value");
            System.out.println(Name+ "\t\t" + Number + "\t\t\tR" + Salary + "\tR" + (Salary-CalculateTax(Salary)) +
                    "\t\t\t" + TaxPercentage(Salary) +"%");
        }
        Employee() {
            Name ="Thandiswa";
            Number = 1010;
            Salary = 10000;
        }
    }
}
