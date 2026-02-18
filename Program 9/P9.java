import java.util.Scanner;
class P9{
    public static void main(String args[]){
        int r, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row: ");
        r = sc.nextInt();
        System.out.println("Enter the size of Column: ");
        c = sc.nextInt();
        int arr [][] = new int[r][c];
        System.out.println("Enter the elements of a matrix: ");
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int U_sum = 0 , L_sum = 0;

        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i<j){
                    U_sum += arr[i][j];
                }
                if(i>j){
                    L_sum += arr[i][j];
                }
            }
        }
        System.out.println("Upper Digonal Sum is: " +U_sum);
        System.out.println("Lower Digonal Sum is: " +L_sum);

        sc.close();
    }
}