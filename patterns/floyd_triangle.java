public class floyd_triangle {
    int n=5;
    int counter =1;
    public static void floyd_tri(int n, int counter ){
        for(int i =1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }System.out.println();
        }
    }
    public static void main(String agrs[]){
        floyd_tri(5,1);
    }
}
