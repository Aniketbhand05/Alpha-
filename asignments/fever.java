import java.util.*;
public class fever {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the temp");
        float temp = sc.nextFloat();
        if(temp>100){
            System.out.println("you have a fever");
        }else{
            System.out.println("you dint have a fever");
        }

    }
    
}
