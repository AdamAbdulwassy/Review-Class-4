package HW;

import java.util.Scanner;

public class C6Month {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter birth month to find your season");
        String day=scan.nextLine();
        if (day.equals("January")||day.equals("February")||day.equals("December")){
            System.out.println("You were born in Winter");
        } else if (day.equals("March")||day.equals("April")||day.equals("May")) {
            System.out.println("You were born in Spring");
            
        }else if (day.equals("June")||day.equals("July")||day.equals("August")){
            System.out.println("You were born in Summer");
        }else if (day.equals("September")||day.equals("October")||day.equals("November")){
            System.out.println("You were born in Fall");
        }else {
            System.out.println("Invalid input");
        }


    }
}
