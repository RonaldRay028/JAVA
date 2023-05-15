public class main {
    public static void main(String[] args) {
        Account user = new Account();
        System.out.println( user.getBalance());
        System.out.println( user.getDate_created());
        System.out.println( user.getAnnual_interest_rate());
        System.out.println( user.getID());
        System.out.println(user.getMonthly_interest_rate());
        user.deposit(5_000);
        user.withdraw(2_500);
        System.out.println(user.getBalance());
    }
}
