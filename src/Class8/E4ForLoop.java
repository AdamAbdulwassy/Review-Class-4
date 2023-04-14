package Class8;

import java.util.Scanner;

public class E4ForLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please type a starting number");
        int start1=scan.nextInt();
        System.out.println("Please type a ending number");
        int end= scan.nextInt();
        System.out.println("Please type a skip number");
        int skip= scan.nextInt();

        for (int number = start1; number <=end; number=number+skip) {
            System.out.print(number+" ");
        }
    }
}
