//Write a program that will enter numbers from the keyboard.
//        The code for reading numbers from the keyboard must be in the readData method.
//        The code inside the readData is wrapped in a try..catch.
//        If the user entered some text, instead of entering a number, the method should catch the exception
//        and display all previously entered numbers as a result.
//        Numbers output from a new line preserving the order of input.

package Task6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Task6 {

    private static int entNum;
    public static ArrayList<Integer> num = new ArrayList<Integer>();

    public static int getEntNum() {
        return entNum;
    }

    public static void setEntNum(int entNum) {
        Task6.entNum = entNum;
    }

    public static boolean readData() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input integer number:  ");

        try {
            setEntNum(in.nextInt());
            num.add(getEntNum());
            return true;

        } catch (InputMismatchException e) {
            System.out.println("You entered not integer number");

            if (num.size() != 0){System.out.println("You entered such numbers: ");
            } else System.out.println("You didn't enter any correct data");

            for (Integer aNum : num) {
                System.out.print(" " + aNum);
            }
            in.close();
            return false;
        }
    }

    public static void main(String[] args) {

          while (readData());
    }
}

