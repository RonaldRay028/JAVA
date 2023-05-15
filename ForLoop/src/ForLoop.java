public class ForLoop {
    public static void main(String[] args){

        char[] name = {'L','O','V','E','D','A','Y'};
        //name = new char[7];
        /*
        name[0] = 'L';
        name[1] = 'O';
        name[2] = 'V';
        name[3] = 'E';
        name[4] = 'D';
        name[5] = 'A';
        name[6] = 'Y';
         */

        for (int count = 0 ; count < name.length ;count++ ){
            System.out.print(name[count]);
        }
    }
}
