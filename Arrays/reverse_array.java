public class reverse_array {
    public static void reverse(int numbers[]){
        int first =0;
        int end = numbers.length-1;
        while(first<end){
            int temp;
            temp = numbers[first];
            numbers[first] = numbers[end];
            numbers[end] = temp; 
            first++;
            end--;
        }

    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        
        System.out.println("the reversed array is  " );
        reverse(numbers);
        for(int i=0; i<numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }System.out.println();
    }
    
    
}
