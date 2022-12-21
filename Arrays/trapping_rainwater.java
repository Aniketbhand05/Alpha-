import java.util.*;
public class trapping_rainwater {
    public static int trappedrainwater(int height[]){
        //left max boundry as array;
        int leftmax[] = new int[height.length];
        leftmax[0] = height[0];
        for(int i=1; i<height.length; i++){
            leftmax[i] = Math.max(height[i],leftmax[i-1]);
        }
        //right max boundry as array but filling it from reverse directn
        
        int rightmax[] = new int[height.length];
        rightmax[rightmax.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightmax[i] = Math.max(height[i],rightmax[i+1]);
        }
        for(int i=0; i<rightmax.length; i++){
            System.out.print(rightmax[i] + " ");
        }
        int water = 0;
        for(int i=0; i<height.length; i++){
            int waterlevel = Math.min(rightmax[i],leftmax[i]);
            water = water + (waterlevel-height[i]);
        }
        return water;
    }
    public static void main(String args[]){
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, };
        System.out.println("\nthe trapped rain water is = " + trappedrainwater(height));
        
    }
    
}
