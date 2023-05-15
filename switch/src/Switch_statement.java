import java.util.Scanner;

public class Switch_statement {
     public static void main(String[] args) {
         box mybox = new box(10,15,5);
         box mybox2 = new box(20,30,40);


         double vol = mybox.depth * mybox.height * mybox.width;
         System.out.println("My volume : " + mybox.vol());
         System.out.println("My volume : " + mybox2.vol());

    }
    static class box{
         private double height ;
         private double  depth;
         private double width;

         double vol(){
             return height * depth * width;
         }

         box(double height , double depth , double width){
             this.height = height;
             this.depth = depth;
             this.width = width;
         }
    }
}
