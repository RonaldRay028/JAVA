public class Quesion_3 {
    public static void main( String[] args){
        Task user = new Task();
        // creating worker one and passing TAsk object
        Worker_1 myThread = new Worker_1(user);
        Thread newThread = new Thread(myThread);
        // creating worker two and passing TAsk object
        Worker_2 myThread2 = new Worker_2(user);
        Thread newThread_2 = new Thread(myThread2);

        newThread_2.start();
        newThread.start();
    }
}
