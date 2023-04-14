package JavaReview2;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter a word");
        String word=scan.nextLine();
        System.out.println("Word that was captured "+ word);

        System.out.println("Please enter a sentence");
        String sentence = scan.nextLine();
        System.out.println("The sentence you entered is " + sentence);

        System.out.println("Please enter a number");
        int number= scan.nextInt();
        System.out.println("The number that was captured is "+number);

        System.out.println("Please enter a decimal value");
        double decimal= scan.nextDouble();
        System.out.println("The decimal that was captured is "+decimal);



    }
}
