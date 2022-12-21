import java.util.*;
public class weeknumber {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        switch(number){
            case 1:System.out.println("its monday beta");
            break;
            case 2:System.out.println("its tuesday beta");
            break;
            case 3:System.out.println("its wednesday beta");
            break;
            case 4:System.out.println("its thursday beta");
            break;
            case 5:System.out.println("its friday beta");
            break;
            case 6:System.out.println("its saturday beta");
            break;
            case 7:System.out.println("its sunday beta");
            break;
            default : System.out.println("entered wrong number");
        }
    }
    
}
