public class kadanes {
    public static void kadanes_sum(int numbers[]){
        int current_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        //int min_sum = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            current_sum = current_sum + numbers[i];
            if(current_sum < 0){
                //min_sum = Math.min(current_sum,min_sum);
                current_sum=0;
            }max_sum = Math.max(current_sum,max_sum);
        }  System.out.println(max_sum);
        //System.out.println(min_sum);

    }
    public static void main(String args[]){
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        kadanes_sum(numbers);
      
    }
    
}
