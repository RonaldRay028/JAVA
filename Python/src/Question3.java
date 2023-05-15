import java.util.*;
public class Question3 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        float airfare_cost ;
        int hotel_nights;
        float nightly_cost ;
        int rental_car_days ;
        float daily_cost_rental_car;

        System.out.print("The cost of the Airfare : ");
        airfare_cost = input.nextFloat();
        System.out.print("The number of hotel nights : " );
        hotel_nights = input.nextInt();
        System.out.print("The nightly cost of the hotel : ");
        nightly_cost = input.nextFloat();

        // calling the function
        System.out.println("Total airfare cost : " + Total_airfare_cost(airfare_cost));
        System.out.println("Total hotel cost : " + Total_hotel_cost(hotel_nights , nightly_cost) );

    }
    public static float Total_airfare_cost( double airfare){
        final float Tax_rate = 0.1f;
        float airfare_cost = (float) (airfare + ( airfare * Tax_rate ));

        return airfare_cost;
    }
    public static float Total_hotel_cost( int nights , float nightly_cost){
        final float Hotel_tax_rate = 0.05f ;
        float hotel_cost = (float) ((nights * nightly_cost) + ((nights * nightly_cost) * Hotel_tax_rate));
        return hotel_cost;
    }
}
