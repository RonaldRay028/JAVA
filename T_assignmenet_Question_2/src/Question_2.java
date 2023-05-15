import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Question_2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner reader = new Scanner(System.in);
        String RandomCharacters ;

        //asking the user wants to enter they own list
       while (true){

           System.out.print("Would you like to enter your own RANDOM list ( Yes / No ) : " );
           String opinion = reader.nextLine();
           String newOpinion = opinion.toUpperCase();

           if(newOpinion.equals("YES") ){
               System.out.print("Enter a random list of Characters : ");
               RandomCharacters = reader.nextLine();
               // breaking out of the loop
               break;

           }else if(newOpinion.equals("NO")) {
               //default list
               RandomCharacters = "56725314";
               break;
           }else {
               System.out.println("ERROR!!");
           }
       }



        try {
            FileWriter myfile = new FileWriter("Question2.txt");
            myfile.write(RandomCharacters);
            myfile.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // assigning the text a veriable
        File Question2 = new File("Question2.txt");
        // so the scanner can read from the text file
        reader = new Scanner(Question2);
        String stringfromFile = null;

        while ( reader.hasNextLine()){
            stringfromFile = reader.nextLine();
        }
        // close the scanner
        reader.close();
        ArrayList<String>listFromFile = new ArrayList<>();

        for (int i = 0 ; i < stringfromFile.length() ; i++ ){
            listFromFile.add(String.valueOf(stringfromFile.charAt(i)));
        }
        System.out.println("Before sorting : " + listFromFile);
        Collections.sort(listFromFile);
        System.out.print("After sorting  : " + listFromFile);

    }
}
