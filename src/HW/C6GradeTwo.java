package HW;

import java.util.Scanner;

public class C6GradeTwo {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter quiz score");
        int quiz=scan.nextInt();
        System.out.println("Enter test score");
        int test= scan.nextInt();
        System.out.println("Enter final score");
        int finals= scan.nextInt();

        int avg= (quiz+test+finals)/3;

        char grade;
        if (avg>=90){
            grade='A';
        }else if (avg>=70 && avg<90){
            grade='B';
        }else if (avg>=50 && avg<70){
            grade='C';
        }else {
            grade='F';
        }
        System.out.println("Your average score "+avg+" and your grade is "+grade);



    }
}
