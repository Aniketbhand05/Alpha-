public class linear_search_array{
    public static int linear_search(int numbers[] , int key){
        int index = 0;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]== key){
                index = i;  
                break;
            }else{
                index = -1;
            }
        }return index;
    }
    public static void main(String args[]){
        int key = 4;
        int numbers[] = {1,2,3,4,5,6};
        System.out.println("hello world");
        System.out.println("the number is located at index = "+ linear_search(numbers,key));
    }
}