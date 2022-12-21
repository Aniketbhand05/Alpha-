import java.util.*;
public class multi {
    public static int multiplication(int num1 ,int num2 ){
        int mul = num1*num2;
        return mul;
    }
    
    public static int addition(int num1 ,int num2 ){
        int add = num1+num2;
        return add;
    }
    public static int substraction(int num1 ,int num2 ){
        int sub = num1-num2;
        return sub;
    }
    public static int division(int num1 ,int num2 ){
        int div = num1/num2;
        return div;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a = ");
        int a = sc.nextInt();
        System.out.println("enter b = ");
        int b = sc.nextInt();
        System.out.println("enter the operant = ");
        char opr = sc.next().charAt(0);
        //String opr = sc.next(); 
        //System.out.println(opr);

        if(opr == '+'){
            int addi = addition(a,b);
            System.out.println("the addition is = " + addi);
        }else if(opr == '-'){
            int subs = substraction(a,b);
            System.out.println("the substraction is = "+ subs);
        }else if(opr == '*'){
            int multi =multiplication(a,b);
            System.out.println("the multiplication is = "+ multi);
        }else if (opr == '/'){
            int divi = division(a,b);
            System.out.println("the division is = "+ divi);
        }else{
            System.out.println("you entered wrong operator");
        }
    }
}
