import java.util.Date;

public class Account {
    private int ID;
    private double Balance ;
    private double Annual_interest_rate ;
    private Date Date_created = new Date();
    Account(){
        ID = 1234 ;
        Balance = 10_000;
        Annual_interest_rate = 21.02 ;
        Date_created = new Date();
    }
    Account( int ID , double Balance ){
        this.ID = ID ;
        this.Balance = Balance;
    }
    // setters
    void setID( int ID ){
        this.ID =ID ;
    }
    void setBalance ( double Balance ){
        this.Balance = Balance;
    }
    void setAnnual_interest_rate ( double Annual_interest_rate){
        this.Annual_interest_rate = Annual_interest_rate ;
    }
    // getters
    int getID(){
        return ID;
    }
    double getBalance(){
        return Balance ;
    }
    double getAnnual_interest_rate(){
        return Annual_interest_rate;
    }
    Date getDate_created(){
        return Date_created ;
    }
    double getMonthly_interest_rate(){
        return Annual_interest_rate/12 ;
    }

    void withdraw (double WithDraw_money){
        Balance -= WithDraw_money ;
    }
    void  deposit (double deposit_money){
        Balance += deposit_money ;
    }

}
