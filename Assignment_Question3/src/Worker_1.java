public class Worker_1 implements Runnable{
    private Task user ;
    // creating a constructor for the thread that
    // can take in parameter of Task type
    public Worker_1(Task user) {
        this.user = user;
    }
    public void print () {

        Thread myThread = Thread.currentThread();
        String name = myThread.getName();
        long id = myThread.getId();
        boolean status = myThread.isAlive();
        Thread.State state = myThread.getState();

        try {
            Thread.sleep(2_000);
            System.out.println("\nThread name 1: " + name);
            System.out.println("Thread ID : " + id);
            System.out.println("Thread state : " + state);
            System.out.println("Thread status : " + status + "\n");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void display(){
        System.out.println("Task\t\tTask_ID\t\t\tTask_Wage");
        System.out.println(user.myTaskName()+ "\t\t" + user.myTaskID() + "\t\t" + user.myTaskWage());

    }

    @Override
    public void run() {
        try {
            Thread.sleep(500);
            display();
           // System.out.println("Worker one!!");
        } catch (InterruptedException e) {
        }
        print();
    }
}
