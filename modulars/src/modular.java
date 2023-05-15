public class modular {
    public static void main(String [] args){
        int num1 = 463 , num2 = 2 ;
        System.out.println(num1 + " modulars " + num2 + " : " + num1%num2 );

        multithreading thread = new multithreading();
        multithreading thread2 = new multithreading();
        // the method will run but not in a separate thread
        //thread.run();
        // calls a new thread
        thread.start();
        thread2.start();
    }
}
