
import java.util.Scanner;

public class P4{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n ;
        double product=1;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        double [] a = new double[n];
        double[] ProductArray = new double[n];
        System.out.println("Enter the elements of the array : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            product = product*a[i];
        }
        for (i = 0; i < n; i++) {
            ProductArray[i] = product/a[i];
        }
        System.out.println("The new product array is : ");
        for (i = 0; i < n; i++) {
            System.out.print(ProductArray[i]+" , ");
        }

    }
}