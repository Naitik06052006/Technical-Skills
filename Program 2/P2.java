
import java.util.Scanner;

public class P2{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, n;
        System.out.println("Enter the length of the array: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        int Prefixarr[] = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (i == 0) {
                Prefixarr[i] = arr[i];
            } else {
                Prefixarr[i] = Prefixarr[i - 1] + arr[i];
            }
        }
        int count = 0, sum = Prefixarr[n - 1], ls, rs;
        for (i = 0; i < n; i++) {
            if (i == 0) {
                ls = 0;
            } else {
                ls = Prefixarr[i - 1];
            }
            rs = sum - Prefixarr[i];

            if (ls == rs) {
                count++;
            }
        }
        System.out.println(count);

    }
}