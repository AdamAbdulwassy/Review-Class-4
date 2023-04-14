package HW;

import java.util.Scanner;

public class C6Numbers {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number between 1-1,000");
        int number= scan.nextInt();
        if (number>=1&&number<=10){
            System.out.println("Small number");
        } else if (number>=11&&number<=100) {
            System.out.println("Medium number");
            
        } else if (number>=101&&number<=1000) {
            System.out.println("Large number");

        }else{
            System.out.println("Invalid number");
        }


    }
}
