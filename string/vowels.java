import java.util.*;
public class vowels {
    public static int vowels(String str){
        int count = 0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'A'){
                count++;
            }else if(str.charAt(i) == 'e' || str.charAt(i) == 'E'){
                count++;
            }else if(str.charAt(i) == 'i' || str.charAt(i) == 'I'){
                count++;
            }else if(str.charAt(i) == 'o' || str.charAt(i) == 'O'){
                count++;
            }else if(str.charAt(i) == 'u' || str.charAt(i) == 'U'){
                count++;
            }
        }return count;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //System.out.println(str);
        int c = vowels(str);
        if(c>0){
            System.out.println("the no. of vowels in string " + str +" = "  + c);
        }else{
            System.out.println("no vowel found");
        }

    }
    
}
