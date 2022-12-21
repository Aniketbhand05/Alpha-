import java.util.*;
public class floyds_triangle {
    public static void floyds(int n){
        int counter = 1;
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i; j++ ){
                System.out.print(counter + " ");
                counter++;
            }System.out.println();
        }
    }
    public static void main(String agrs[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number = ");
        int n = sc.nextInt();
        floyds(n);
    }
}
