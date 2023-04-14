package Class6;

public class E5SwitchStatement {
    public static void main(String[] args) {

        /* switch data type doesnt work with float,double, boolean,

                */
        char gender= 'p';
        switch (gender){
            case 'F':
            System.out.println("Female");
            break;
            case 'M':
                System.out.println("Male");
                break;
            default:
                System.out.println("Neither");
        }



    }
}
