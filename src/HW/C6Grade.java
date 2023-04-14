package HW;

import java.util.Scanner;

public class C6Grade {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your quiz score");
        int score=scan.nextInt();
        if (score>=90){
            System.out.println("You got an A");
        }else if (score>=70&&score<=90){
            System.out.println("You got a B");
        }else if (score>=50&&score<70){
            System.out.println("You got a C");
        }else if (score<50){
            System.out.println("You got a F");
        }else{
            System.out.println("Invalid response");
        }

        Scanner scan1=new Scanner(System.in);
        System.out.println("Enter your test score");

        int score1=scan1.nextInt();
        if (score1>=90){
            System.out.println("You got an A");
        }else if (score1>=70&&score1<=90){
            System.out.println("You got a B");
        }else if (score1>=50&&score1<70){
            System.out.println("You got a C");
        }else if (score1<50){
            System.out.println("You got a F");
        }else{
            System.out.println("Invalid response");
        }

        Scanner scan2=new Scanner(System.in);
        System.out.println("Enter your final score");
        int score3=scan2.nextInt();
        if (score3>=90){
            System.out.println("You got an A");
        }else if (score3>=70&&score3<=90){
            System.out.println("You got a B");
        }else if (score3>=50&&score3<70){
            System.out.println("You got a C");
        }else if (score3<50){
            System.out.println("You got a F");
        }else{
            System.out.println("Invalid response");
        }

        int avg= (score+score1+score3)/3;
        System.out.println("Your average score is "+avg);


    }
}
