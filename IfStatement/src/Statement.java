import java.util.*;
public class Statement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = 11_000;
        if(num%2 == 0){
            System.out.print("The number entered is EVEN!!");
        }else{
            System.out.println("The number entered is ODD!!");
        }
        String two = (num <= 20_000)?("Even"):("odd");
        String an = (num <= 10_000)?("even"):(two);
        System.out.println(an);
    }
}
