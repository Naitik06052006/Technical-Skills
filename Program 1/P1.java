
import java.util.Scanner;

public class P1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements in array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        int max = 0, count = 0;

        for (int i = 0; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (array[i] != max) {
                count++;
            }
        }
        System.out.println(count);

    }
}