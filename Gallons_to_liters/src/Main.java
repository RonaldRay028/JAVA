public class Main {
    public static void main(String[] args) {
        double gallons , liters ;

        gallons = 10;
        liters = gallons * 3.7854 ;

        if (gallons > 1){
            System.out.print("They are " + liters + " liters");
            System.out.println(" in " + gallons + " gallons");
        }
        if (gallons <= 1){
            System.out.print("They are " + liters + " liters");
            System.out.println(" in " + gallons + " gallon");
        }
    }
}