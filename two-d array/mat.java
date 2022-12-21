import java.util.*;
public class mat {
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

    public static void search(int matrix[][],int n, int m, int key){
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == key){
                    System.out.print("the key is found at index (" + i + "," + j + ")");
                }
            }System.out.println();
        }
    }

    public static void maxi(int matrix[][], int n, int m){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] > max){
                    max = matrix[i][j]; 
                }
            }
        }System.out.println("the largest element is = " + max);
    }
    public static void mini(int matrix[][], int n, int m){
        int min = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j]; 
                }
            }
        }System.out.println("the largest element is = " + min);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][4];
        int n = matrix.length;
        int m = matrix[0].length;
        input(matrix,n,m);
        print(matrix,n,m);
        search(matrix,n,m,4);
        maxi(matrix , n , m);
        mini(matrix , n , m);
    }
    
}
