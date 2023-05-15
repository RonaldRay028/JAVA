public class WorkThread_Two implements Runnable {

    private Task myTask;

    public WorkThread_Two(Task myTask) {
        this.myTask = myTask;
    }

    public void ThreadStatus() {
        Thread myThread = Thread.currentThread();
        String name = myThread.getName();
        boolean status = myThread.isAlive();
        // output
        System.out.println("Thread name : " + name);
        System.out.println("Thread status : " + status);
    }

    // overriding the run method
    @Override
    public void run() {
        // code that will run when the thread is called to start
        try {
            // to make the thread sleep for 1 second before running
            Thread.sleep(1000);
            System.out.println("Task\t\tTask ID\t\tTask Wage\t\tHour Worked\t\tHourly Rate");
            System.out.println(myTask.getName() + "\t" + myTask.getID() + "\t" + myTask.getWage() + "\t\t"
                    + (myTask.getWage()/62.5) + "\t\t\t" + 62.5);
            ThreadStatus();
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
