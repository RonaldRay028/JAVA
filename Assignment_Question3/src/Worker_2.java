public class Worker_2 implements Runnable{
    private Task user_2;
    public void print () {

        Thread myThread = Thread.currentThread();
        String name = myThread.getName();
        long id = myThread.getId();
        boolean status = myThread.isAlive();
        Thread.State state = myThread.getState();

        try {
            Thread.sleep(2_100);
            System.out.println("\nThread name 2: " + name);
            System.out.println("Thread ID : " + id);
            System.out.println("Thread state : " + state);
            System.out.println("Thread status : " + status + "\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void display(){
        System.out.println("Task\t\t\tTask_ID\t\tTask_Wage\t\tStatus\t\tPesonnel");
        System.out.println(user_2.myTaskName()+ "\t\t" + user_2.myTaskID() + "\t" + user_2.myTaskWage() + "\t\t Development\t\t 20");
    }

    public Worker_2(Task user2) {
        user_2 = user2;
    }
    @Override
    public void run(){
        try {
            Thread.sleep(600);
            display();
           // System.out.println("Worker two");
        } catch (InterruptedException e) {
        }
        print();
    }
}
