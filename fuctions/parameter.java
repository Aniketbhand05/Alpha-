import java.util.*;
public class parameter {
    public static int sub(int num1,int num2){
        int sub = num1-num2;
        return sub;
        //System.out.println("the sub is = " + sub);

    }
public static void main(String arrgs[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a = ");
    int a = sc.nextInt();
    System.out.println("enter b = ");
    int b = sc.nextInt();
    int substraction =sub(b,a);
    System.out.println("the sub is = "+ substraction);
    
}    
}
