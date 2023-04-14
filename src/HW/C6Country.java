package HW;

import java.util.Scanner;

public class C6Country {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your Country");
        String country= scan.nextLine();

        switch (country){
            case "United States":
                System.out.println("English");
                break;
            case "France":
                System.out.println("French");
                break;
            case "Brazil":
                System.out.println("Portuguese");
                break;
            case "Mexico":
                System.out.println("Spanish");
                break;

        }
        System.out.println("enter a grade");
        String grade=scan.nextLine();

        switch (grade){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not acceptable");
        }














    }
}
