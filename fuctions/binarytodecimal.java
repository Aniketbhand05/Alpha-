import java.util.*;
public class binarytodecimal {
    public static int decimal(int binarynum){
        int last_digit =0;
        int power =0;
        int decimal =0;
        while(binarynum>0){
            last_digit = binarynum%10;
            decimal = decimal +(last_digit* (int)Math.pow(2,power));
            binarynum = binarynum/10;
            power ++;

        } return decimal;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the binary number = ");
        int n = sc.nextInt();
        System.out.println("the decimal number is = " + decimal(n)); 

    }
    
}
