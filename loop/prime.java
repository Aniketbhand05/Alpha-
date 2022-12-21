import java.util.*;
public class prime {
    public static void main(String arrgs[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nunber");
        long num = sc.nextInt();
        boolean isprime =true;
        if(num==2){
            System.out.println("the number is prime");}
        else{
        
        for(int i=2;i<num-1;i++){
            if(num%i==0){
                isprime=false;
        } 
    }
    if( isprime ==true){
        System.out.println("the number is  prime");
    } else{
        System.out.println("the number is not prime");
    }
}
    }
}
