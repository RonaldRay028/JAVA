import java.util.Scanner;
public class UserInput {

    public static void main( String[] args){
        int input_1 , input_2;

        Scanner My_scanner = new Scanner(System.in);

        System.out.println("A reader object has been defined ");
        System.out.print("Enter the first number: ");
        input_1 = My_scanner.nextInt();
        System.out.print("Enter second number: ");
        input_2 =My_scanner.nextInt();
        My_scanner.close();
        System.out.println("The scanner object has been closed ");
        int my_sum = input_1 + input_2 ;
        System.out.println("Sum of to two numbers is: " + my_sum);

    }
}
