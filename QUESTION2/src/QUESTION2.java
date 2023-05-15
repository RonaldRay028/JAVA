import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class QUESTION2 {
    public static void main(String[] args) {

        String fileData = null;
        try {
            File myfile = new File("QUESTION2.txt");
            Scanner input = new Scanner(myfile);

            while (input.hasNextLine()) {
                fileData = input.nextLine();
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
        ArrayList<String> mylist = new ArrayList<>();
        for (int i = 0 ; i < fileData.length() ; i++){
            mylist.add(String.valueOf(fileData.charAt(i)));
        }

        System.out.println("Before sorting : " + mylist);
        Collections.sort(mylist);
        System.out.println("After sorting : " + mylist);

    }

}
