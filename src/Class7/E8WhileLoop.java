package Class7;

import java.util.Scanner;

public class E8WhileLoop {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number greater than 1");
        int number= scan.nextInt();

       int counter=1;
        while(counter<=number){
            System.out.print(counter+" ");
            counter++;
        }












    }
}
