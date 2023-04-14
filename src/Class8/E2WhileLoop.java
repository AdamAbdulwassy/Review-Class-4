package Class8;

import java.util.Scanner;

public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a starting,ending,and skip number");
        int start = scan.nextInt();
        int end = scan.nextInt();
        int skip = scan.nextInt();


        while(start<=end){
            System.out.print(start+" ");
            start=start+skip;
        }












    }
}
