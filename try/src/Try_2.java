// import a library
import java.util.*;
public class Try_2 {
    public class Individual{
        String name;
        int age;
        double height;
        double weight;
        String message;

        static indi_func(){
            Scanner in = new Scanner(System.in);


            System.out.println("Please enter your first name");
            String name = in.nextString();

            System.out.println("PLease enter your last name");
            String lname = in.nextString();

            System.out.println();
            System.out.println();
            System.out.println("Please insert insert your height in centimeters");
            int height = in.nextInt();


        };
    };
    public static void main(String args[]){
        int z = 6;
        System.out.println("Your answer is " + my_function(z));

    }
    static int my_function(int z){
        // for calling the class methods
        Scanner in = new Scanner(System.in);

        System.out.println("Input your first integer");
        //getting input from user
        int x = in.nextInt();

        System.out.println("Input your second integer.");
        // getting the input from the user
        int y = in.nextInt();

        z = x + y;
        return z;
    }
}
