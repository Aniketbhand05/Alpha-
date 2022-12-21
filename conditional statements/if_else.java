import java.util.*;
public class if_else{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age<=13){
            System.out.println("child");
        }
        if(age>=13 && age<=18){
            System.out.println("teen");
        }
        if(age>=18){
            System.out.println("adult");
        }
    }
}