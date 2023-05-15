public class Inheritence {
    static class A{
        int num1 = 1 ;
        int num2 = 3;

        void  show (){
            System.out.print("Value num1 " + num1 + " value num2 " + num2);
        }
    }
    static class child extends A {
        child (){
            // getting all the variables from the parent
            super();
        }

        int num3 = 6;
        int sum = num1 + num2 + num3;
        void show_2(){
            System.out.println("Sum : " + sum);
        }

        @Override
        void show() {
            super.show();
            System.out.println(" Value num3 " + num3);
        }
    }

    public static void main(String[] args) {
        A user = new A();
        user.show();
        child user_1 = new child();
        user_1.show_2();
        user_1.show();
    }
}
