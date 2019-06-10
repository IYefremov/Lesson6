//3. Finish the program to handle all the possible exceptions:
//public class Main {
//
//    public static void main(String[] args) {
//        int a = args.length;
//        System.out.println(a);
//
//        int b = 10 / a;
//        int[] c = {1};
//        System.out.println(c[1]);
//
//    }
//
//}
//
//    Print the cause of the exception to the console.

package Task3;

public class Task3 {

    public static void main(String[] args) {
        try {
            int a = args.length;
            System.out.println("The quantity of arguments is " + a);
            int b = 10 / a;

        }catch(ArithmeticException e) {

            System.out.println("Division by zero " );
        }

        try {
            int[] c = {1};
            System.out.println(c[1]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The array index is out of border");
        }
    }
}
