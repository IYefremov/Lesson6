//2. Fix the method with try-catch to get the correct result of division:
//public class Main {
//
//    public static void main(String[] args) {
//        System.out.println(divideByZero());
//    }
//
//    public static int divideByZero() {
//        int a = 5;
//        int b = 0;
//        return a / b;
//    }
//}

package Task2;

public class Task2 {
    public static void main(String[] args) {

        System.out.println(divideByZero());

    }

    public static int divideByZero() {
        int a = 5;
        int b = 0;

        try {

            return a / b;

        } catch (ArithmeticException e) {
            e.getMessage();
            e.getStackTrace();
        }

        return 0;
    }


}
