import java.util.*;
public class larged {
    public static int largest(int numbers[]){
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>large){
                large = numbers[i];
            }
            if(numbers[i]<small){
                small = numbers[i];
                //return small;
            }
            

        }System.out.println("the smallest element is = "+ small);
        return large;
    }
    public static void main(String args[]){
        int numbers[] = {1,2,3,6,3,5};
        int Lar =  largest(numbers);
        //int smal = lar
        System.out.println("the largest number is = " + Lar);
        //System.out.println("the smallest number is = " + smal);

    }
    
}
