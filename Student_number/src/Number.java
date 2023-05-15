import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Number {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        long[] number = new long[8];
        for (int i = 4 ; i < 8 ; i ++ ){

            if ( i == 4){
                number[0] = 4 ;
                number[1] = 0 ;
                number[2] = 2 ;
                number[3] = 3 ;
            }else {
                int newNumber = (int) (Math.random() * 10);
                number[i] = newNumber;
            }
        }
        for (int j = 0 ; j < number.length ; j++){
            System.out.print(number[j]);
            n.add((int) number[j]);
        }
        System.out.println();
        System.out.println(n);
        String not = String.copyValueOf(n);
        System.out.println(not);

    }

}
