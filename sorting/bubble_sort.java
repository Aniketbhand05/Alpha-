public class bubble_sort {
    public static void sort(int num[]){
        int swap = 0;
        for(int turn = 0; turn<num.length-1; turn++){
            //int update = 0;
            
            for(int j=0; j<num.length-1-turn; j++){
                if(num[j]>num[j+1]){
                    int temp= num[j];
                    num[j]= num[j+1];
                    num[j+1] = temp;
                    swap++;
                    //update++;
                }
            }
        }if(swap==0){
            System.out.println("the array was already sorted");
        }
        System.out.println("total no of swaps = " +swap);
    }
    public static void main(String args[]){
        int num[] = {5,4,1,3,2};
        sort(num);
        //System.out.println(sort(num));
        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }

    }
}

