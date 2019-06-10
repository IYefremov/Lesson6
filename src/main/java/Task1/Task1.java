//   Create method to check:
//        if number < 0 print “Number < 0”,
//        if number > 0 print “Number > 0”
//        if number = 0 throw your own exception

package Task1;

public class Task1 {

    public static void main(String[] args) {

        CompareDigit myDigit = new CompareDigit();

        try {
            myDigit.setDigit(12);
            myDigit.setDigit(-4);
            myDigit.setDigit(0);

        } catch (CompareDigit.MyException e){

            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static class CompareDigit{

        private int digit;


        public int getDigit() {
            return digit;
        }

        public void setDigit(int digit)  throws MyException   {

            if (digit == 0){
                throw new MyException("Warning!!! You entered 0");

            }else if (digit < 0){
                System.out.println("Number < 0");
                this.digit = digit;
            }else {
                System.out.println("Number > 0");
                this.digit = digit;
            }

        }

        public class MyException extends Exception{

            public MyException (String message){
                super (message);
            }
        }
    }
}
