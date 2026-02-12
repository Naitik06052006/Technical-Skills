
import java.util.Scanner;

public class P5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, n, k;
        System.out.println("Enter the length of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of the sum element: ");
        k = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                if ((arr[i] + arr[j]) == k && i != j) {
                    System.out.println("Yes pair exists at indexes: "+i+","+j);
                    break;
                }
            }
        }
    }
}