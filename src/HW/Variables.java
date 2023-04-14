package HW;

public class Variables {
    public static void main(String[] args) {
        /* Create a Java program and name it Variables
In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
My name is  and my  last name is __
I am A/B student
I live in city and state__
And my phone number is …..*/


        String name="Adam";
        String lastName="Azzuri";
        char grade='A';
        grade='B';
        String city="Atlanta";
        city="San Fran";
        String state="Ga";
        state="California";
        String phoneNumber="770-777-7777";
        phoneNumber="888-888-8888";

        System.out.println("My name is "+name+" and my last name is "+lastName+".");
        System.out.println("I am "+grade+" student.");
        System.out.println("I live in "+city+" and "+state+".");
        System.out.println("My phone number is "+phoneNumber+".");

        /*Change student’s city, state, phone number and grade. And print those updated values:
Example:
My name is  and I moved to new city and new state. My new phone number is */

        System.out.println("My name is "+name+" and I moved to "+city+","+state+". My new phone number is "+phoneNumber+".");







    }
}
