
import java.util.Scanner;

public class P6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n, max = 0, secondLargest = 0;
        System.out.println("Enter the size of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (i = 0; i < n; i++) {
            if (arr[i] > secondLargest && arr[i] != max) {
                secondLargest = arr[i];
            }
        }
        System.out.println("The second largest element in the array is : " + secondLargest);
    sc.close();
   
    }
}
