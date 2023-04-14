package JavaReview2;

public class Nestedif {
    public static void main(String[] args) {




        boolean driverLicense=true;
        boolean car=false;

        if (driverLicense) {
            System.out.println("Lets check if you have a car");

        if (car){
            System.out.println("You can drive to work");
        }else{
            System.out.println("You have to take the bus");
        }

        }else{
            System.out.println("You should get a DL");
        }

    }
}
