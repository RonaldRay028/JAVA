import java.util.*;
public class Average {
    public static void main( String[] args){
        // to take in uer input
        Scanner input = new Scanner(System.in);

        int num_1 , num_2 ,min , max ,sum;

        System.out.print("Enter first number : ");
        num_1 = input.nextInt();
        System.out.print("Enter the second number : ");
        num_2 = input.nextInt();

        sum = num_1 + num_2;
        // menu
        int choice ;
        System.out.println("1.Sum");
        System.out.println("2.Average");
        System.out.println("3.Smallest");
        System.out.println("4.Biggest");
        System.out.print("Enter your choice ");
        choice = input.nextInt();
        System.out.println();

        switch (choice)
        {
            case 1:
                System.out.println("The sum is " + sum);
                break;
            case 2:
                System.out.println("The Average is " + ( sum/ 2 ));
                break;
            case 3: {
                if (num_1 < num_2) {
                    min = num_1;
                    System.out.println("The smallest is " + num_1);
                }else {
                    System.out.println("Num 1 is equal to num 2");
                }
                break;
            }
            case 4: {
                if (num_2 > num_1) {
                    max = num_2;
                    System.out.println("The biggest is " + max);
                }else {
                    System.out.println("Num 1 is equal to num 2");
                }
                break;
            }
        }


    }
}
