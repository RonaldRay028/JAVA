public class Task {
    private String Name ;
    private long ID ;
    private double Wage;
    /*
     methods that pass the values from our private data members
     to the worker threads
    */
    public String getName(){
        return Name;
    }
    public long getID(){
        return ID;
    }
    public double getWage(){
        return Wage;
    }
    //constructor
    Task(){
        Name = "JAVA CODING";
        ID = 401913052;
        Wage = 100000;
    }
}

