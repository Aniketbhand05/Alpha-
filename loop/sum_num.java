import java.util.*;
public class sum_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int sum_even=0;
        int sum_odd=0;
        for(int i=0;i<=num;i++){
            if(i%2==0){
                sum_even+=i;
            }else{
                sum_odd+=i;
            }
        }
        System.out.println("the sum of odd numbers is =" +sum_odd);
        System.out.println("the sum of even numbers is =" +sum_even);
    }

    
}
