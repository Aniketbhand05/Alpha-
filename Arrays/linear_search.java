public class linear_search {
    public static int Search(int numbers[] , int key){
        for(int i=0; i<=numbers.length; i++){
            if (numbers[i]==11){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18,20};
        int key = 11;
        int index = Search(numbers , key);
        if(index == -1){
            System.out.println("the element is not found");
        }else{
            System.out.println("the element is present at index = " + index + " which is = " + numbers[index]); 
        }

    }
    
}
