import java.util.*;
public class binary_to_decimal {
    public static void binarytodecimal(int n){
        int decimal = 0;
        int power = 0;
        while(n>0){
            int last_digit = n%10;
            decimal = decimal + (last_digit*(int)Math.pow(2,power));
            power++;
            n = n/10;
        }System.out.println("the decimal number is = " + decimal);                       
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter binary no = ");
        int n = sc.nextInt();
        binarytodecimal(n);
        //System.out.println("the decimal number is = " + deci);

    }
    
}
