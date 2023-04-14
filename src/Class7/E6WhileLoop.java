package Class7;

public class E6WhileLoop {
    public static void main(String[] args) {

        int counter=100;
        while(counter>=1){
            System.out.print(counter+ " ");
            counter-=1;
        }

        counter=20;
        System.out.println();
        while(counter<=100){
            System.out.print(counter + " ");
            counter+=2;
        }

        counter=100;
        System.out.println();
        while(counter>1){
            if(counter%2!=0){
                //odd numbers when divided by 2 gives you a remainder
                System.out.print(counter+" ");
            }
            counter-=1;
        }











    }
}
