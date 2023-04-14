package Athomestudy;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {

        String username= "Adam";
        System.out.println("Hello "+ username);
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name: ");
        username= input.next();
        System.out.println("Welcome: " +username);


    }
}
