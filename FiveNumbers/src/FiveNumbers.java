import  java.util.*;
public class FiveNumbers {

    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);

        int sum = Readsum(input);

        double Avarage = sum / 5.0 ;

        System.out.println("the sum of 5 numbers is : " + sum);
        System.out.println("the Average is : " + Avarage);

    }
    public static int Readsum(Scanner input){
        System.out.print("Enter 5 numbers : ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();

        return num1 + num2 + num3 + num4 + num5;
    }
}
