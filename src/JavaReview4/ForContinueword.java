package JavaReview4;

public class ForContinueword {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {

            if (i == 3) {
                continue;
            }
            System.out.println(i);

        }

    }
}
//continue makes java go back to the beginning of the loop
//doesn't print