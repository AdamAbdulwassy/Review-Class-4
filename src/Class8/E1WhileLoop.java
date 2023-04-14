package Class8;

import java.util.Scanner;

public class E1WhileLoop {
    public static void main(String[] args) {

        for (int i = 15; i <=30 ; i++) {
            System.out.print(i+" ");
        }

        System.out.println();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type a starting number & ending number");
        int start1=scan.nextInt();
        int end= scan.nextInt();

        for (int number = start1; number <=end; number++) {
            System.out.print(number+" ");
        }












    }
}
