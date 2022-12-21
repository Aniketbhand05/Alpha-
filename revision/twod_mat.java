import java.util.*;
public class twod_mat {
    public static void input(int matrix[][], int n, int m){
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

    }

    public static void print(int matrix[][], int n, int m){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][4];
        int n = matrix.length;
        int m = matrix[0].length;
        input(matrix,n,m);
        print(matrix,n,m);
    }
    
}
