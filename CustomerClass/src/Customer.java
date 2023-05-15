public class Customer {
    private String Name;
    private int age;
    private String Last_name;
    private double Balance;
    private long Account_number;

    public void setNames( String user_name,String user_lastName,int user_age ){
        this.Name = user_name;
        this.Last_name = user_lastName;
        this.age = user_age;
    }
    public void set_user_information(double user_balance, long user_AccountNumber){

    }
    public void Display(){
        System.out.println();
        System.out.println("Information of customer");
        System.out.println("NAME \t\t: " + Name);
        System.out.println("LAST NAME \t: " + Last_name);
        System.out.println("AGE \t\t: " + age);
    }

    Customer() {
        this.Name = "Ronald";
        this.Last_name = "Mpofu";
        this.age = 22 ;
    }
}
