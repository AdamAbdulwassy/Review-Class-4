package HW;

import java.util.Scanner;

public class C6Hours {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("What time of day is it");
        int day= scan.nextInt();
        if (day>=1&&day<=11){
            System.out.println("Morning");
        }else if (day>=12&&day<=15){
            System.out.println("Afternoon");
        } else if (day>=16&&day<=20) {
            System.out.println("Evening");
            
        } else if (day>=21&&day<=24) {
            System.out.println("Night");
            
        }else{
            System.out.println("Invalid time");
        }


    }
}
