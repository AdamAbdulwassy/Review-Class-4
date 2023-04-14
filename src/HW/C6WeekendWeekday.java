package HW;

import java.util.Scanner;

public class C6WeekendWeekday {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a day of the week");
        String day=scan.nextLine();
        if (day.equals("Monday")||day.equals("Tuesday")||day.equals("Wednesday")||day.equals("Thursday")||day.equals("Friday")) {
            System.out.println("It's a weekday");
        } else if (day.equals("Saturday")||day.equals("Sunday")) {
            System.out.println("It's a weekend");

        }else{
            System.out.println("Invalid day");
        }


    }
}
