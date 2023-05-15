public class Task {
    private  String TasName ;
    private  int TaskId ;
    private int TaskWage ;

    Task(){
        TasName = "MOBILE APP";
        TaskId = 40213714 ;
        TaskWage = 1_000_000 ;
    }
    public String myTaskName(){
        return TasName ;
    }
    public int myTaskID(){
        return TaskId;
    }
    public int myTaskWage(){
        return TaskWage;
    }

}
