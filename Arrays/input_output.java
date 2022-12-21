import java.util.*;
public class input_output {
    public static void main(String args[]){
    int marks[] = new int[100];
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the marks of phy = ");
    marks[0] = sc.nextInt();
    System.out.println("enter the marks of math = ");
    marks[1] = sc.nextInt();
    System.out.println("enter the marks of chem = ");
    marks[2] = sc.nextInt();

    //length of array
    System.out.println("the length of array is = " + marks.length);

    System.out.println("the marks of phy you entered is = "+marks[0]);
    System.out.println("the marks of math you entered is = "+marks[1]);
    System.out.println("the marks of chem you entered is = "+marks[2]);

    //System.out.println("entert the correct marks of maths = " );
    //marks[1]=sc.nextInt();  //update

    //or

    marks[1] = marks[1]+15;
    System.out.println("the corrected marks of maaths is = "+marks[1]);
    float percentee = (((marks[0]+marks[1]+marks[2])/300)*100);
    System.out.println("the % of the marks is = "+percentee);
    }
}
