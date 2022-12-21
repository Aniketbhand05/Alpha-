import java.util.*;
public class binomial_fac {
    public static float binomial(int n,int r,int c){
        int fact =1;
        int bino = 1;
        int coeff = 1;
        for (int i=1 ; i<=n ; i++){
            fact = fact*i;
        }
        for (int i=1 ; i<=r ; i++){
            bino= bino*i;
        }
        for (int i=1 ; i<=c ; i++){
            coeff = coeff*i;
        }
        float binomial = fact/(bino*coeff);
        return binomial;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n =");
        int n = sc.nextInt();
        System.out.println("enter the value of r =");
        int r =sc.nextInt();
        int c = n-r;
        System.out.println("the binomial coefficient is = " + binomial(n,r,c) );

    }
    
}
