import java.util.*;
public class factorial {
    public static int factorial(int N){
int factorial = 1;
for(int i=1 ; i<=N ; i++){
    factorial = factorial*i;
}return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number = ");
        int n = sc.nextInt();
        int fact =factorial(n);
        System.out.println("the factorial of " + n + " is "+ fact);


    }
    
}
