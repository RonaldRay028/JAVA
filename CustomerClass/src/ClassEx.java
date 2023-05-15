import java.util.*;
public class ClassEx {
    public static void main(String[] args){
       // set_information();
        Customer user  = new Customer();
        user.Display();
    }
    public static void set_information(){
        Scanner input = new Scanner(System.in);
        // creating an object for our class
        Customer user = new Customer();
        System.out.print("Enter the name of the customer : ");
        String user_name = input.next();
        System.out.print("Enter the Last name : ");
        String user_lastName = input.next();
        System.out.print("Enter the age of the customer : ");
        int user_age = input.nextInt();

        user.setNames(user_name,user_lastName,user_age);
        user.Display();

    }
}
