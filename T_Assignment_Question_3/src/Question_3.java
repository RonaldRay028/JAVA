import java.util.Scanner;

public class Question_3 {
    public static void main(String[] args){
        Task myTask = new Task();
        WorkerThread_one myThread = new WorkerThread_one(myTask);
        WorkThread_Two myThread2 = new WorkThread_Two(myTask);
        Thread newThread = new Thread(myThread);
        Thread newThread2 = new Thread(myThread2);

        newThread.start();
        newThread2.start();

    }
}
