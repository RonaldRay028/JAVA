public class OddEven {
    public static void main(String[] args){
        int rows = 10;
        for ( int count = 1 ; count <= rows ; ++count){
            for ( int index = 1; index <= count;++index){
                System.out.print(+index);
            }
            System.out.println(" ");
        };
    }
}
