public class sorted_search {
    public static boolean search(int matrix[][] , int key){
        int row =0; 
        int col=matrix[0].length-1;
        while(row < matrix.length && col >=0){
            if(matrix[row][col] == key){
                System.out.println("the key is found at (" + row + "," + col + ")");
                return true;
            }else if(key > matrix[row][col]){
                row++;
            }else{
                col--;
            }   
        }
            System.out.println("key is not found");
            return false;
    }
    public static void main(String args[]){
        int key = 140;
        int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
    //matrix_sum(matrix);
    System.out.println(search(matrix ,key ));   
    }
}
