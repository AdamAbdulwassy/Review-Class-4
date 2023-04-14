package Class8;

public class E6BreakKeyword {
    public static void main(String[] args) {

        //FOR CAN ONLY BE USED IN IF AND SWITCH STATEMENTS

        for (int a = 0; a < 10; a++) {
            if (a>5){
                break;
            }
            System.out.print(a+" ");
        }




       int sum = 0;
        for (int i = 0; i < 50; i++) {
            sum = sum + i;
            if (sum >= 300) {
                System.out.print(i);
                break;
            }

        }


    }
}
