import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class character_try {
    public static void main( String[] args){
            ArrayList<Character>mylist = new ArrayList<>();
            mylist.add('r');
            mylist.add('a');
            mylist.add('1');
            mylist.add('9');
            
            Collections.sort(mylist);
            System.out.println(mylist);

            String string = "Loveday Mpofu";
            String string2 = "8726763561356511";

            char charArry[] = string.toCharArray();
            char charArry2[] = string2.toCharArray();

            Arrays.sort(charArry);
            Arrays.sort(charArry2);
            System.out.println(string);
            System.out.println(string2);
            System.out.println(new String(charArry));
            System.out.println(new String(charArry2));
            //System.out.println(Arrays.toString(list));
        }
}
