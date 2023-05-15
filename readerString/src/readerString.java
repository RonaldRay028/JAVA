import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.System.*;

public class readerString {


    public static void main(String[] args) {
        String data = null;
        try {
            File myfile = new File("Strings.txt");
            Scanner input = new Scanner(myfile);
            data = null;


            while (input.hasNextLine()) {
                data = input.nextLine();
                out.println(data);
            }
            input.close();
            out.println(data);
        } catch (FileNotFoundException e) {
            out.println("An error occurred");
            e.printStackTrace();
        }
        data.split("\\s");
        out.println(data.length());
        ArrayList<String>mylist = new ArrayList<>();
        for (int counter = 0 ; counter < data.length() ; counter++ ){
            mylist.add(String.valueOf(data.charAt(counter)));
        }

        //mylist.spliterator();
        //Collections.sort(mylist);
        char chardata[] = data.toCharArray();
        String newData = Arrays.toString(data.split("\\s"));
        out.println(newData);
        Arrays.sort(chardata);
        out.println(Arrays.toString(chardata));
        //mylist.add(Arrays.toString(chardata));
        out.println("Arraylist" + mylist);
    }
}
