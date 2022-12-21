import java.util.*;
public class income_tax{
    public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            int income=sc.nextInt();
            if(income<=500000){
                System.out.print("no tax");
            }else if(income>=500000){
                float a =(20*income)/100f;
                System.out.println("the tax amount will be="+a);
            }else{
                float b= (30*income)/100f;
                System.out.println("the tex will be="+b);
            }
    }
}