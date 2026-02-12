
import java.util.Scanner;

public class P3{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array : ");
        for (i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0, time = 0;
        for (i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        for (i = 0; i < n; i++) {
            time = time + (max - a[i]);
        }
        System.out.println("Total time needed to make all elemets eqaul is : " + time);
    }
}