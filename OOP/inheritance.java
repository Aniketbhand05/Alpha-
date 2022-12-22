public class inheritance {
    public static void main(String args[]){
        Fish f1 = new Fish();
        f1.breathe();
    }
}
class Animal{
    String color;

    void eat(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathe");
    }
}
class Fish extends Animal{
    int fins;

    void fins(){
        System.out.println("fish swims in water");
    }
}