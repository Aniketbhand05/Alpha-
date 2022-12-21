public class palindrome {
    public static void palindrome(String str){
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() -1 - i)){
                System.out.println("the string " + str + " is not a palindrome ");
                break;
            }else{
                System.out.println("the string " + str +" is a palindrome");
                break;
            }
        }
    }
    public static void main(String args[]){
        String str = "racecar";
        palindrome(str);
    }
    
}
