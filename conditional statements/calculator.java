import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
        System.out.println("enter operatnt");
        char operator = sc.next().charAt(0);

        switch(operator) {
            case '+': System.out.println("the addition is="+(a+b));
            break;
            case '-' : System.out.println("the sub is ="+(a-b));
            break;
            case '*' : System.out.println("the multi is ="+(a*b));
            break;
            case '/' : System.out.println("the div is ="+ (float)(a/b));
            break;
            default : System.out.println("invalid operatant");
            }

    }
}