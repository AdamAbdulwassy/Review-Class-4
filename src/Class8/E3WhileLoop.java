package Class8;

import java.util.Scanner;

public class E3WhileLoop {
    public static void main(String[] args) {

        //Ask the user to enter numbers
        //Other than -1 and print try again until they enter -1
        //once they do end loop


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num= scan.nextInt();


        while(num!=-1){
            System.out.println("try again");
            num= scan.nextInt();
        }











    }
}
