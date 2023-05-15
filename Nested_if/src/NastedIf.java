import java.util.*;
public class NastedIf {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of users : ");
        int number_of_user = input.nextInt();

        for ( int count = 1 ; count <= number_of_user; count++){
            information( input, count);
        }

    }
    public static void information ( Scanner input, int number){
        double height , weight ;
        // for the first person to enter
        if (number == 1){
            System.out.println("Enter the first person's information");
            System.out.print("Height (in inches) ? ");
            height = input.nextInt();
            System.out.print("Weight (in pounds) ?");
            weight = input.nextInt();
        } else {
            // for the other users after the first
            System.out.println("Enter the next person's information");
            System.out.print("Height (in inches) ? ");
            height = input.nextInt();
            System.out.print("Weight (in pounds) ?");
            weight = input.nextInt();
        }
    }
    public static double body_mass_index(int)

}
