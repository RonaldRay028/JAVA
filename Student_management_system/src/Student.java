import java.util.ArrayList;
public class Student {
    private String Name ;
    private String Surname;
    private String password ;
    private int StudentNumber ;
    ArrayList<String> Student_Name = new ArrayList<>();
    ArrayList<String> Student_Surname = new ArrayList<>();
    ArrayList<String> Student_password = new ArrayList<>();
    ArrayList<Integer> Student_Number = new ArrayList<>();

    String getName(){
        return Name;
    }
    String getSurname(){
        return Surname;
    }
    String getPassword(){
        return password;
    }
    int getStudentNumber(){
        return StudentNumber;
    }

    Student( String Name , String Surname , String password , int Student_Number){
            this.Name = Name;
            this.Surname = Surname;
            this.password = password;
            this.StudentNumber = Student_Number;
            Student_Name.add(Name);


    }
    public void add(){
        Student_Name.add(this.Name);
        Student_Surname.add(Surname);
        Student_password.add(this.password);
        Student_Number.add(StudentNumber);
    }
    public void show(){
        System.out.println(Student_Name.get(0));
        System.out.println(Student_Surname);
        System.out.println(Student_password);
        System.out.println(Student_Number);
    }

}
