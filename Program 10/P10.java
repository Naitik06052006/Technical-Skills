import java.util.Scanner;
public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter the column of matrix: ");
        int c = sc.nextInt();
        
        int arr[][] = new int[r][c];
        System.out.println("Enter the elements of a matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i= 0; i < r; i++){
            int r_sum = 0 , c_sum = 0;
            for(int j= 0; j<c ; j++){
                r_sum += arr[i][j];
                c_sum += arr[i][j];
            }
            System.out.println("Row Number" + (i+1) +"is: " +r_sum);
            System.out.println("Column" + (i+1) +"is: " +c_sum);
        }
    }
}
