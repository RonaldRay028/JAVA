public class WorkerThread_one implements Runnable {
    private Task myTask;
// constructor so the thread can take object parameter
    public WorkerThread_one(Task myTask)
    {
        this.myTask = myTask;
    }
    // getting information about the current thread
    public void ThreadStatus(){
        Thread myThread = Thread.currentThread();
        String name = myThread.getName();
        boolean status = myThread.isAlive();
        // output
        System.out.println("Thread name : " + name);
        System.out.println("Thread status : " + status);
    }
// overriding the run method
    @Override
    public void run(){
        // code that will run when the thread is called to start
        try {
            // to make the thread sleep for 1 second before running
            Thread.sleep(500);
            System.out.println("Task\t\tTask_ID\t\tTask_Wage");
            System.out.println(myTask.getName()+"\t" + myTask.getID() + "\t" + myTask.getWage());
            ThreadStatus();

        }catch (Exception e){
            throw new RuntimeException();
        }
    }

}
