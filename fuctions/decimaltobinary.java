import java.util.*;
public class decimaltobinary {
    public static int binary(int decimal){
        int rem =0;
        int binary =0;
        int quotient= 0;
        int bin =0;
        while(decimal>0){
            rem = decimal%2;
            quotient = (decimal-rem)/2;
            binary = rem;
            decimal=quotient;
        }return binary;

    }
    public static void main(String args[]){
        System.out.println(binary(121));
    }
    
}
