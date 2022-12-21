public class lower_uppercase {
    public static String uppercase(String str){
        StringBuilder fin = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        fin.append(ch);
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length()-1){
                fin.append(str.charAt(i));
                char c = Character.toUpperCase(str.charAt(i+1));
                i++;
                fin.append(c);
                
            }else{
                fin.append(str.charAt(i));
            }

        }
        return fin.toString();
    }
    public static void main(String args[]){
        String str =  "hi i am aniket helllo wORLD";

        System.out.println(uppercase(str));
    }
    
}
