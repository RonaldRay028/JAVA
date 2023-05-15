import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student user = new Student();

        while (true){
            System.out.print("Would you like to enter a new Student ( Yes / No ) : ");
            String choice = input.next().toUpperCase() ;
            //String newchoice = choice.toUpperCase();

            if (choice.equals("YES")){
                //System.out.println("Entered a student ");
                System.out.println(user.myHashmap);
                System.out.print("Enter number of course to enroll the student :  " );
                int opinion = input.nextInt();

                System.out.println(user.getHashmap(opinion) + " " + Student_number());

                break;
            } else if (choice.equals("NO")) {
                System.out.println("NO new student entered ");
                break;
            }else {
                System.out.println("Opinion entered is not part of the given choices !!!!! Try again ");
            }
        }
    }
    public static int Student_number(){
        // convert int into string
        BigInteger number = BigInteger.valueOf(2023);

        String new_number = number.toString();
        // covert string to array characters

        char[] characters = new_number.toCharArray();

        for (int i = 0 ; i < 3 ; i++){
            int n = (int) (Math.random()*10);
            char newn = (char) n;
            characters[i] = newn ;
        }

        int StudentNumber = Integer.parseInt(characters.toString());

        return StudentNumber;

    }
}
