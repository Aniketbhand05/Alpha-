public class functn_overloading {
    public static void main(String args[]){
        Calculator c = new Calculator();
        c.sum(2,3);
        c.sum((float)2.1 , (float)3.5);
        c.sum(1,2,3);
    }
}
class Calculator{
    void sum(int a , int b){
        int sum = a+b;
        System.out.println("the sum is " + sum);
    }
    void sum(float a , float b){
        float sum = a+b;
        System.out.println("the sum is " + sum);
    }
    void sum(int a, int b, int c){
        int sum = a+b+c;
        System.out.println("the sum is " + sum  );
    }
}