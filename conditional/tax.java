import java.util.*;
public class tax {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your income");
        int income =sc.nextInt();
        if(income<500000){
            System.out.println("no tax");
        }else if(income>=500000 && income<=1000000){
            System.out.println("tax will be="+ ((income*20)/100));
        }else{
            System.out.println("tax will be="+ ((income*30)/100));
        }

    }
}
