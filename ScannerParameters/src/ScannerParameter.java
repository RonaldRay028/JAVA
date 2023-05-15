import java.util.*;
public class ScannerParameter {
    public static void main( String[] args){
        Scanner input = new Scanner(System.in);
        int sum = readSum3(input);
        double Average = sum/ 3.0 ;
        System.out.println("The average is " + Average);

    }
    // function takes user input direct from the user
    public static int readSum3(Scanner input){
        System.out.print("Enter 3 numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int mininum = Math.min(num1 , Math.min(num2 , num3));
        System.out.println("The minimum is " + mininum);

        return num1 + num2 + num3 ;
    }
}
