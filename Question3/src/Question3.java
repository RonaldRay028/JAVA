public class Question3 {
    static class Task{
        String TaskName;
        int TaskID ;
        double TaskWage ;

        Task(){
            TaskName = "Web page";
            TaskID = 14242;
            TaskWage = 13433 ;
        }
    }

    static class workerOne implements Runnable{
        private Task myTask;

        workerOne(Task myTask){
             this.myTask= myTask;
         }
         void display(){
            Thread myThread = new Thread();

            System.out.println("\nThread state : " + myThread.getName());
            System.out.println("Thread status : " + myThread.getId());

             System.out.println("\nTask\t\tTask_ID\t\t\tTask_Wage");
             System.out.println(myTask.TaskName+ "\t\t" + myTask.TaskID + "\t\t" + myTask.TaskWage);
             System.out.println();

         }
        @Override
        public void run(){
            try {
                Thread.sleep(1000);
                display();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class workerTwo implements Runnable{
        private Task myTask;

        workerTwo(Task myTask){
            this.myTask= myTask;
        }
        void display(){
            Thread myThread = new Thread();

            System.out.println("\nThread state : " + myThread.getName());
            System.out.println("Thread status : " + myThread.getId());

            System.out.println("\nTask\t\tTask_ID\t\t\tTask_Wage\t\tWork status \t\t Personnel");
            System.out.println(myTask.TaskName+ "\t\t" + myTask.TaskID + "\t\t\t" + myTask.TaskWage + "\t\t\t Running" + "\t\t12");
            System.out.println();

        }
        @Override
        public void run(){
            try {
                Thread.sleep(1000);
                display();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Task myTask = new Task();
        workerOne myWorker = new workerOne(myTask);
        workerTwo myWorker2 = new workerTwo(myTask);

        Thread myworkerThread = new Thread(myWorker);
        Thread myWorkerThread2 = new Thread(myWorker2);

        myworkerThread.start();
        myWorkerThread2.start();
    }
}
