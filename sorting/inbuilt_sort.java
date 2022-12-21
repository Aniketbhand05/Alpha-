import java.util.*;
import java.util.Collections;
public class inbuilt_sort {
    public static void main(String args[]){
        Integer num[] = {5,4,1,3,2};
        Arrays.sort(num,Collections.reverseOrder());
        //System.out.println(sort(num));
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }

    }
}