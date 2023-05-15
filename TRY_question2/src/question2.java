import java.io.*;
import java.util.ArrayList;

public class question2 {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        ArrayList<String> mylist = new ArrayList<>();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");
         */

        int[] mylist = {1,2,3,4,5};

        try {
            FileWriter myFile = new FileWriter("Question2.txt");

            myFile.write(String.valueOf(mylist));

            System.out.println(mylist);
            myFile.close();
            System.out.println("Successful");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }


        /*
        ArrayList<Character>mylist = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader( new FileReader("Question2.txt"));
            char number ;
            while ((number = reader.read()) != null){
                System.out.println(number);
                mylist.add(number);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.print(mylist);
        System.out.print(" " + mylist.size());


    }

         */
}
