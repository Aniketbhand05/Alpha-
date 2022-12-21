import java.util.*;
public class ternary{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        String even_odd = (a%2==0)?"Even":"odd";
        System.out.println(even_odd);
    }
}