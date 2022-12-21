public class twod_array {
    public static int search(int array[][] , int key){
        int num =0;
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length; j++){
                if(array[i][j]==key){
                    num++;
                }
            }
        }return num;
    }
    public static void main(String args[]){
        int[][] array = { {4,7,8},{8,8,7} };
        int key = 8;
        System.out.println("num = " + search(array,key));
    }
    
}
