package Class5;

public class E7LogicalOperatorOR {
    public static void main(String[] args) {

      //  System.out.println(true||true||false);
        int age=40;
        if (age<18 || age>60){
            System.out.println("You wiill get a discount");
        }else{
            System.out.println("No discount for you");
        }

        char gender= 'F';
        String name= "Aku";
        if (gender=='F' || age>60){
            System.out.println("You will get a discount");
        }




    }
}
