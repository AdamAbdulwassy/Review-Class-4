package HW;

public class C7evenNumbers {
    public static void main(String[] args) {

        int number=20;
        while(number>=1){
            System.out.print(number+ " ");
            number-=2;
        }
        System.out.println();
        int num=20;
        while (num>=1){
            if(num%2!=1) {
                System.out.print(num+ " ");
            }
            num-=2;
        }
        System.out.println();
        for (int i = 20; i >=1; i-=2) {
            System.out.print(i+" ");
        }
        System.out.println();
        for (int a=20;a>=1;a-=2) {
            if(a%2!=2)
            System.out.print(a+" ");
        }


















    }
}
