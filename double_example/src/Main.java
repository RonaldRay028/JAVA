import java.util.*;
public class Main {

    public static void main(String[] args) {

        double num1 = 5 , num2  = 10;

        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);

        Scanner in = new Scanner(System.in);
        // num3= in.nextDouble();
        double num3 , num4 ;
        double sum;

        System.out.print("Enter your first number : ");
        // taking in user input
        num3 = in.nextDouble();
        System.out.print("Enter your second number : ");
        num4 = in.nextDouble();
        System.out.println();

        sum = num3 + num4 ;

        System.out.println("the sum of num3 + num4 : " + sum);
        if ( num3 < num4){
            System.out.println("Num4 is greater than num3");
        }
        if (num4 < num3 ){
            System.out.println("Num3 is greater than num4");
        }
    }
}