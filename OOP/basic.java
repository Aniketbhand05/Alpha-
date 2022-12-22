public class basic{
    public static void main(String args[]){
        Pen p1 = new Pen();
        p1.set_color("blue");
        p1.set_tip(5);
        System.out.println(p1.color +" " + p1.tip);
        bankaccount myacc = new bankaccount();
        myacc.username = "aniket bhand";
        myacc.setpassword("abcc");
        System.out.println(myacc.username);
        System.out.println(myacc.password);


    }
}
class Pen{
    String color;
    int tip;

    void set_color(String new_color){
        color = new_color;
    }
    void set_tip(int new_tip){
        tip = new_tip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calculate_percentage(int phy, int chem, int math){
        percentage = (phy+chem+math)/3;
    }
}
class bankaccount{
    public String username;
    private String password;
    public void setpassword(String pwd ){
        password = pwd;
    }
}