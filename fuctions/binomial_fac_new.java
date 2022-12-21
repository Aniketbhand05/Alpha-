import java.util.*;
public class binomial_fac1 {
    public static int factorial(int N){
        int factorial = 1;
        for (int i=1 ; i<=N ; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n =");
        int n = sc.nextInt();
        System.out.println("enter the value of r =");
        int r = sc.nextInt();
        int c =n-r;
        int binomial = factorial(n)/(factorial(r)*factorial(c));
        System.out.println("the binomial coefficient is = " + binomial);

    }
    
}
