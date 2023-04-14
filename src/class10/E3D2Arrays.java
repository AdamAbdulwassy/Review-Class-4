package class10;

public class E3D2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30},
                {20,50,65},
                {102,54,60}
        };
        int [] ar1=matrix[0];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i]+" ");
        }
        System.out.println();

        ar1=matrix[1];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i]+" ");
        }
        System.out.println();

        ar1=matrix[2];
        for (int i = 0; i < ar1.length; i++) {
            System.out.print(ar1[i]+" ");
        }



    }
}
