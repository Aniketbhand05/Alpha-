import java.util.*;
public class anagram {
    public static String ana(String str1, String str2 ){
        StringBuilder fin = new StringBuilder("");
        int count = 0;
        while(str1.length() == str2.length()){
            for(int i = 0; i<str1.length(); i++){
                for(int j=0; j<str2.length(); j++){
                    if(str1.charAt(i) == str2.charAt(j)){
                        char c = str2.charAt(j);
                        fin.append(c);
                        //System.out.print("a");
                        count++;
                    }
                }
            }
        }//return fin.toString();
        if(fin.length() == str2.length()){
            System.out.println("the both string are anagram");
        }else{
            System.out.println("the both string are not anagram");
        }
        return fin.toString();
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("enter the first string -- ");
        String str1 = sc.nextLine();
        System.out.print("enter the second string -- ");
        String str2 = sc.nextLine(); 
        ana(str1,str2);
        

        
        
        //}System.out.println();
        //for(int i = 0; i<arr2.length; i++){
          //  System.out.print(arr2[i] + " ");
        //}System.out.println();
    }
    
}
