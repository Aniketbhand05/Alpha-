public class fun_overloading {
    //public static int sum(int a ,int b){
      //  return a+b;
    //}
    //public static int sum(int a, int b , int c){
      //  return a+b+c;
    //}
    public static void main(String args[]){
        System.out.println(sum(2,3));
        System.out.println(sum(10.2f,20.5f,30.7f));
    }

    public static int sum(int a ,int b){
        return a+b;
    }
    public static float sum(float a, float b , float c){
        return a+b+c;
}

}
//function overloading
