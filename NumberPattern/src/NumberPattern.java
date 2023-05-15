public class NumberPattern {
    public static void main(String[] args){
         int pattern = 10 ;

         for (int count = 1 ; count < pattern ; count++){
             for (int index = 1; index < count ; index++){
                 System.out.print(index);
             }
             System.out.println();
         }
    }
}
