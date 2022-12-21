import java.util.*;
public class functn {
    public static void subst(int num1 , int num2){
        int sub = num1 - num2;
        System.out.println("the substraction is = " + sub);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a = ");
        //System.out.println();
        int a = sc.nextInt();
        System.out.print("enter b = ");
        //System.out.println();
        int b = sc.nextInt();
        subst(a,b);

    }
    
}
