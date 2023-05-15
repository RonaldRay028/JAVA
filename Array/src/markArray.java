import java.util.ArrayList;
import java.util.*;
public class markArray {
    public static void main(String[] args){
        //ITS STUDENT SYSTEM
        ArrayList<String>Student_name =new ArrayList<String>();
        ArrayList<String>Student_mark =  new ArrayList<String>();
        ArrayList<String>Student_lastname = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String name ;
        String lastname;
        String mark;
        int index ;
        int choice = 1;
        //while loop
        while (choice != 0){
            // menu
            System.out.println("\t#########################################");
            System.out.println("\t#\t\t 1.Add new Student\t\t\t\t#");
            System.out.println("\t#\t\t 2.Edit Student list\t\t\t#");
            System.out.println("\t#\t\t 3.Delete Student \t\t\t\t#");
            System.out.println("\t#\t\t 4.Display Student list\t\t\t#");
            System.out.println("\t#\t\t 5.Exit the program\t\t\t\t#");
            System.out.println("\t#########################################");
            System.out.print("Enter your choice : ");
            choice = input.nextInt();

            if (choice == 1){
                System.out.print("Enter the name of the Student : ");
                name = input.next();
                System.out.print("Enter the last name of Student : ");
                lastname = input.next();
                System.out.print("Enter mark of Student : ");
                mark = input.next();

                // setting the values to the array lists
                Student_mark.add(mark);
                Student_lastname.add(lastname);
                Student_name.add(name);
                System.out.println("Student has been Successfully Add!!");
                System.out.println();
            } else if (choice == 2) {
                if (Student_mark.size() == 0){
                    System.out.println("The table is empty");
                }else {
                    System.out.println();
                    //STUDENT TABLE
                    System.out.println("Student Table ");
                    System.out.println("index\t\tName\t\tLast name\t\tMark");
                    for (int count = 0; count < Student_mark.size(); ++count) {

                        System.out.println((count + 1) + "\t\t\t" + Student_name.get(count) + "\t\t" + Student_lastname.get(count) +
                                "\t\t\t" + Student_mark.get(count));
                    }
                    System.out.println();
                    System.out.print("Enter number of Student to be edited : ");
                    index = input.nextInt();
                    // as the index of an array starts from 0 but the number index
                    // in our table starts from 1 we have to subtract 1 from the number
                    // the user entered
                    index -= 1;

                    if (index <= Student_mark.size()) {
                        System.out.print("Enter new mark : ");
                        Student_mark.set(index, input.next());
                        System.out.println("Mark successfully updated!!");
                    } else {
                        System.out.println("Number is not on the list ");
                    }
                }
                System.out.println();

            } else if (choice == 3) {
                if (Student_mark.size() == 0){
                    System.out.println("Student table is empty!!");
                }else {
                    System.out.println("Student Table ");
                    System.out.println("index\t\tName\t\t\tLast name\t\tMark");
                    for (int count = 0; count < Student_mark.size(); ++count) {
                        System.out.println((count + 1) + "\t\t\t" + Student_name.get(count) + "\t\t\t" + Student_lastname.get(count) +
                                "\t\t\t" + Student_mark.get(count));
                    }
                    System.out.println();
                    System.out.print("Enter number of Student to be removed : ");
                    int remove = input.nextInt();
                    // as the index of an array starts from 0 but the number index
                    // in our table starts from 1 we have to subtract 1 from the number
                    // the user entered
                    remove -= 1;
                    // REMOVING THE STUDENT INFO FROM ALL THE ARRAY LISTS
                    Student_mark.remove(remove);
                    Student_lastname.remove(remove);
                    Student_name.remove(remove);
                    System.out.print("Student has successfully been removed ");
                }
                System.out.println();

            } else if (choice == 4) {
                System.out.println();
                // CHECKING IF THE TABLE IS EMPTY OR NOT
                if (Student_mark.size() == 0){
                    System.out.println("Student table is empty ");
                }else {
                    System.out.println("Student Table ");
                    System.out.println("index\t\tName\t\t\tLast name\t\tMark");
                    // LOOP TO DISPLAY THE STUDENTS THAT ARE IN THE LIST
                    for (int count = 0; count < Student_mark.size(); ++count) {
                        System.out.println((count + 1) + "\t\t\t" + Student_name.get(count) + "\t\t\t" + Student_lastname.get(count) +
                                "\t\t\t" + Student_mark.get(count));
                    }
                }
                System.out.println();

            } else if (choice == 5) {
                // breaking out of the loop
                    System.out.println("\tTHANK YOU");
                    break;

            }else {
                // IF THE NUMBER ENTERED IS NOT IN THE RANGE OF 1 TO 5
                System.out.println("Number entered is not on the above list ");
                System.out.println("\t\t TRY AGAIN ");
            }

        }

    }
}