import java.util.*;
public class simplevibe {
    public class james{
        int age;
        String name;
        String initial;
        int ID_No;

       char unex = 'x' ;

        public int takeage(){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your age");
            age = in.nextInt();
            return age;
        };

        public String takeName(){
            Scanner in = new Scanner(System.in);
            System.out.println("Please enter your name");
            name = in.nextLine();
            return name;
        };

        public int ID_No(){
            Scanner in= new Scanner(System.in);
            System.out.println("Enter your Identity Number");

            if (ID_No <= 13) {
                System.out.println("Enter your full ID number");
            }
            else if (ID_No == unex){
                System.out.println("Invalid ID Number, RE-ENTER!!!");
            }

            return ID_No;
            };
        james JJObjct = new james();

        JJObjct.takeage();

        JJObjct.takeName();

        JJObjct.ID_No();
        };
    };
}
