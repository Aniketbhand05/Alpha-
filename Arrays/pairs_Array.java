public class pairs_Array {
    public static void pairs( int numbers[]){
        int total_pairs = 0;
        for(int i=0; i<numbers.length; i++){
            for(int j =i+1; j<numbers.length; j++){
                System.out.print("("+numbers[i] + "," + numbers[j]+")");
                total_pairs++;
            }
            System.out.println();
        }System.out.println("the total no of pairs are = "+total_pairs);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10};
        pairs(numbers);
    }
    
    
}
