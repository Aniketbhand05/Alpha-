public class subarray {
    public static void sub(int numbers[]){
        int ts=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum = Integer.MAX_VALUE;
        int curr_sum = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j=i; j<numbers.length; j++){
                for(int k= i; k<=j; k++){
                    System.out.print(numbers[k] + " ");
                    curr_sum = curr_sum +numbers[k];
                    if(curr_sum>max_sum){
                        max_sum = curr_sum;
                    }if(curr_sum<min_sum){
                        min_sum = curr_sum;
                    }
                }System.out.println();
                ts++;
                curr_sum=0;
            }System.out.println();
            
        }System.out.println(" =" + ts);
        System.out.println("=" + max_sum);
        System.out.println("= "+ min_sum);
    }
    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        sub(numbers);
    }
    
}
