import java.util.Scanner;

public class P12 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int i, j, sum= 0, coreSum= 0 ;
        System.out.println("Enter the row of matrix: ");
        int r = sc.nextInt();
        System.out.println("Enter the column of matrix: ");    
        int c = sc.nextInt();
        int [][] arr = new int[r][c];
        System.err.println("Enter the elements of matrix: ");
        for (i = 0; i < r ; i++){
            for(j = 0; j < c; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i < r; i++){
            for(j = 0; j < c; j++){
                if(i==0 || i == (c-1) || j==0 || j == (c-1)){
                    sum += arr[i][j];
                }
                else{
                    coreSum += arr[i][j];
                }
            }
        }
        System.out.println("Sum of Frame elements is " + sum);
        System.out.println("Sum of Core elements is " + coreSum);

    }
    
}
