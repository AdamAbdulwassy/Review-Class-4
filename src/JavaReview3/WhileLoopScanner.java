package JavaReview3;

import java.util.Scanner;

public class WhileLoopScanner {
    public static void main(String[] args) {

      /*ask user to enter numbers 1 by 1 until user enters
      none integer value - then loop should stop

      inside loop we need to calculate the sum of all
      entered numbers
       */

        Scanner scan=new Scanner(System.in);
        int sum=0;
        System.out.println("Please enter your integer values");

        while(scan.hasNextInt()) {

            int num = scan.nextInt();
            sum = sum + num;


        }
        System.out.println("Sum="+sum);

    }
}
