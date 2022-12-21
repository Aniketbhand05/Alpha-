import java.util.*;
public class leap_year{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        float year= sc.nextFloat();
        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("the year is a leap year");
                }else{
                    System.out.println("the year is not a leap year");
                }
            }else{
              System.out.println("the year is a leap year");
            }
        }else{
            System.out.println("the year is not leap year");
        }


    }
}
