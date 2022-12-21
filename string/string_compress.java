public class string_compress {
    public static String compress(String str){
        StringBuilder fin = new StringBuilder("");
        Integer count = 1;
        for(int i = 0; i<str.length(); i++){
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }if(count>1){
                fin.append(str.charAt(i));
                fin.append(count);
                count = 1;
            }else{
                fin.append(str.charAt(i));
            }

        }return fin.toString();
    }
    public static void main(String args[]){
        String str = "aaaabbbccdde";
        System.out.println(compress(str));

    }
    
}
