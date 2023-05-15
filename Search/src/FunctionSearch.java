import java.util.*;
public class FunctionSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] list = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        System.out.print("Enter a number that is between 1 and 20 : ");
        int num = input.nextInt();

        if (Search(list, num) == 0 ){
            System.out.println("Number entered is not in the list");
        }else {
            System.out.println(num+ " is in position " +Search(list,num));
        }

    }

    public static int Search(int[] list, int key) {
        int keys = 0;
        for (int count = 0; count < list.length; count++) {
            if (key == list[count]) {
                keys = count;
            }
        }
        if (key ==list[keys]){
            return keys;
        }else {
            return 0;
        }
    }
}
