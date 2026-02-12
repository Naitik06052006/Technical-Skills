import java.util.Scanner;
class P7{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int i,j,m,n ;
        System.out.println("Enter the row of matrix: ");
        m = sc.nextInt();
        System.out.println("Enter the coloumn of matrix: ");
        n = sc.nextInt();
        int [][] arr = new int[m][n];
        System.out.println("Enter Matrix Elemnts: ");
        
        for (i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.println(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}