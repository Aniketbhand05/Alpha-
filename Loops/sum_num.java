import java.util.*;
public class sum_num{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int a = sc.nextInt();
        int i=0;
        int sum=0 ;
        while(i<=a){
            sum=sum+i;
            i++;
        }System.out.println(sum);
    }
} 
