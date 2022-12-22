public class hybrid_inherit {
    public static void main(String args[]){
        Parrot p1 = new Parrot();
        p1.eats();
        p1.eggs();
        p1.fly();
    }
}
class Animals{
    void eats(){
        System.out.println("eats");
    }

    void breathe(){
        System.out.println("breathes");
    }
}

class Fish extends Animals{
    void swim(){
        System.out.println("fish swims");
    }
}
class Bird extends Animals{
    void fly(){
        System.out.println("birds can fly");
    }
}

class Mammals extends Animals{
    void milk(){
        System.out.println("mammals can give milk");
    }
}
class Shark extends Fish{
    void danger(){
        System.out.println("skark is dangerous");
    }
}
class Tuna extends Fish{
    void simple(){
        System.out.println("tuna is a simple fish");
    }
}
class Parrot extends Bird{
    void eggs(){
        System.out.println("birds lay eggs");
    }
}
