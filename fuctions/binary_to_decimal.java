import java.util.*;
public class binary_to_decimal {
    public static int decimal(int binnum){
        int pow =0;
        int decimal =0;
        while(binnum>0){
            int last_digit = binnum%10;
            decimal = decimal + (last_digit * (int)Math.pow(2,pow));
            pow++;
            binnum = binnum/10;
        }return decimal;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number");
        int n = sc.nextInt();
        System.out.println("the decimal number is = "+ decimal(n));
    }
    
}
