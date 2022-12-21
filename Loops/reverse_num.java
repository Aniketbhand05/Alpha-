import java.util.*;
public class reverse_num{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter number");
        int a = sc.nextInt();
        while(a>0){
            int last_digit = a%10;
            System.out.print(last_digit);
            a = a/10;
        }System.out.println();
    }
}