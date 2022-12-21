//first see the outer loop means how many lines is to be printed
//then see the no of stars in each line this comes under the inner loop

public class star {
    public static void main(String args[]){
        for(int line =1 ;line <=8 ;line++){
            for(int star=1; star<=line ;star++){
                System.out.print(" * ");
            }System.out.println();

        }
    }
    
}
