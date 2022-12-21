import java.util.*;
public class firstn_n_numbers {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int counter = 0;
        int sum=0;
        while(counter<=num){
            sum+=counter;
            
            counter++;
        }
        System.out.println(sum);

    }
    
}
