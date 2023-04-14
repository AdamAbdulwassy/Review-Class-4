package HW;

import java.util.Scanner;

public class C6WeekendWeekdayTwo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day of the week, (1-7)");
        int day= scan.nextInt();
        if (day>=1&&day<=5){
            System.out.println("It's a weekday");
        } else if (day>=6&&day<=7) {
            System.out.println("It's a weekend");
            
        }else {
            System.out.println("invalid day");
        }


    }
}
