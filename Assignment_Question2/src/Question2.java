import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.out;

public class Question2 {
    public static void main(String[] args){
        String mylist = "qtruytyserexdxre00897857563634231344665";
        try {
            // creating a text file to hold our elements
            FileWriter myFile = new FileWriter("Question2.txt");
            // writing the elements on the mylist array into the text file
            myFile.write(String.valueOf(mylist));
            myFile.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        // so it can be public accessed
        String data = null;
        try {
            // assigning the file Question2.txt to a variable myfile
            File myfile = new File("Question2.txt");
            // Getting the data from the text file
            Scanner input = new Scanner(myfile);

            // Reading the data from the text file
            while (input.hasNextLine()) {
                data = input.nextLine();
            }
            // closing the scanner
            input.close();
        } catch (FileNotFoundException e) {
            out.println("An error occurred");
            e.printStackTrace();
        }
        // empty arraylist
        ArrayList<String> datalist = new ArrayList<>();
        // adding elements from the text file that were store in DATA
        // into the Arraylist datalist
        for (int counter = 0 ; counter < data.length() ; counter++){
            //adding the elements using the index so that they are stored as
            // characters 
            datalist.add(String.valueOf(data.charAt(counter)));
        }
        // outputting the elements before sorting
        out.println("Before sorting : " + datalist);

        // sorting
        Collections.sort(datalist);

        // After sorting
        out.println("After sorting : " + datalist);

    }
}
