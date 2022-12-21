import java.util.*;
public class prime {
    public static boolean prime(int n){
        boolean pri = true;
        if(n == 2){
            pri = true;
        }else{
        for(int i=2 ;i<=n-1 ;i++){
            if(n%i==0){
                pri = false;
                //break;
            }
        } 
        }return pri;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number =");
        int n =sc.nextInt();
        System.out.println("the number is prime = "+ prime(n));
    }
    
}
