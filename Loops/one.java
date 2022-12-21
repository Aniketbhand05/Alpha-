import java.util.InputMismatchException;
import java.util.Scanner;
/**************************************************
 * Demo.java
 * @program : 
 * @web : www.TestingDocs.com
 * @author : 
 * @version : 1.0
 **************************************************/
public class one {
 //main
 public static void main(String[] args) {
 Scanner keyboard = new Scanner(System.in);
 double radius=0.0;
 double areaCircle=0.0;

 try {
 System.out.println("Enter Radius := ");
 radius = keyboard.nextDouble();
 areaCircle = Math.PI*radius*radius;
 System.out.println("Area of Circle = "+ areaCircle);
 keyboard.close();
 }catch(InputMismatchException ime) {
 System.out.println("Please enter valid number for radius");
 }
 } // end main
} // end Demo