public class primeNumbers {
    public static void main(String[] args){
        double num , sroot , reer;

        for(double count = 2.0 ; count <= 100.0 ; count++){
            /*
            if (count%2 != 0){
                System.out.println( count + " is a prime number");
            }
             */

            sroot = Math.sqrt(count);
            System.out.println("Square root of " + count + " is " + sroot);

            // compute rounding error
            reer = count - ( sroot * sroot);
            System.out.println("Rounding error is " + reer);
            System.out.println();

        }
    }
}
