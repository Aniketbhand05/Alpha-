import java.util.*;
public class shortest_path {
    public static void path(String str){
        int tb = 0;
        int lr = 0;
        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == 'E'){
                lr++;
            }else if(str.charAt(i) == 'W'){
                lr--;
            }else if(str.charAt(i) == 'N'){
                tb++;
            }else{
                tb--;
            }
        }int sqr1 = tb*tb ;
        int sqr2 = lr*lr;
        int sqr3 = sqr1+sqr2;
        System.out.println(Math.sqrt(sqr3));
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        path(str);
    }
    
}
