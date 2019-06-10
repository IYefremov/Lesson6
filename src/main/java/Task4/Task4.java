
//4. Fix the program to make it work:
//public static void main(String[] args) {
//        try {
//        int a = 0;
//        int b = 4 / a;
//        } catch (Exception e) {
//        e.printStackTrace();
//        } catch (ArithmeticException e) {
//        e.printStackTrace();
//        }
//        }

package Task4;

public class Task4 {

    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 4 / a;
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Our arithmentic ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
