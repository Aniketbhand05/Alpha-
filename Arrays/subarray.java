public class subarray {
    public static void sub_array(int numbers[]){
        int sum=0;
        int max = Integer.MIN_VALUE;
        
        for (int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                sum=0;
                for(int k=i; k<=j; k++){
                    System.out.print(numbers[k] +" ");
                    sum += numbers[k];
                }if(sum>max){
                    max = sum;
                }
                System.out.print("                 the sum of subarray is = " + sum );
            System.out.println();
            }System.out.println();
            }System.out.println("the maximum sum of sub array is = " + max);
            System.out.println();
        }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        sub_array(numbers);
    }
}    

