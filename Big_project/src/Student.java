import java.math.BigInteger;
import java.util.HashMap;

public class Student {
    // instance variables
    private String Name ;
    private String Surname;
    private int Age ;
    private long ID_Num ;
    private String Course ;

    // Hashmaps
    public HashMap<Integer , String> myHashmap = new HashMap<>();
    private HashMap<BigInteger , String> Student_Number = new HashMap<>();

    // setters
    public void setName(String name) {
        Name = name;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public void setAge(int age) {
        Age = age;
    }

    public void setID_Num(long ID_Num) {
        this.ID_Num = ID_Num;
    }

    public void setCourse(String course) {
        Course = course;
    }
    // setting values into the hashmap
    Student() {
        myHashmap.put(1 , "BSC Computer ");
        myHashmap.put(2 , "BSC Information Technology ");
        myHashmap.put(3 , "BSC System Designs ");
        myHashmap.put(4 , "BSC Mathematical thinking ");
        myHashmap.put(5 , "BA Accounting ");
    }
    // getting  a value from the hashmap
    public String getHashmap ( int num ){
        return myHashmap.get(num);
    }
}
