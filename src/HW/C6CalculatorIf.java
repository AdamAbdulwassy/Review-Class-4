package HW;

import java.util.Scanner;

public class C6CalculatorIf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter a number");
        int num1= scan.nextInt();

        System.out.println("Enter an operator");
        char operator=scan.next().charAt(0);


        System.out.println("Enter a number");
        int num2=scan.nextInt();

        if (operator=='+'){
            System.out.println(num1+num2);
        }else if (operator=='*'){
            System.out.println(num1*num2);
        } else if (operator=='-') {
            System.out.println(num1-num2);
        } else if (operator=='/') {
            System.out.println(+num1-num2);

        }


    }
}
