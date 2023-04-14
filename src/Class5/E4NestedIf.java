package Class5;

public class E4NestedIf {
    public static void main(String[] args) {


        int money = 9000;
        String day = "tuesday";
        if (money > 10000) {
            if (day.equals("Sunday")) {
                System.out.println("Lets go shopping");
            } else {

                System.out.println("Lets wait for Sunday");
            }
        }else {
            System.out.println("Lets save more");
        }

    }
}
