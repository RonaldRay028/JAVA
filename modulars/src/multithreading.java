public class multithreading extends Thread{
    // have to override the thread class run method
    @Override
    public void run(){
        for (int counter = 0 ; counter <= 5 ; counter++ ){
            System.out.println(counter);
            try{
                Thread.sleep(1_000);
            }catch (InterruptedException e) {

            }
        }
    }
    multithreading(){
        System.out.println("This is a constructer");
    }
}
