public class array_as_argue {
    public static void update(int marks[], int verify){
        verify = 10; 
        for(int i =0; i<marks.length; i++){
            marks[i] = marks[i] + 10;
        }
    }
    public static void main(String agrs[]){
        int marks[] = {43,49,65};
        int verify = 5;
        update(marks, verify);    //the verify variable is changed in the function but the change is not reflected in the main function 
        System.out.println(verify);   //but the array is changed in function call and it is reflected in the main code
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks.length);
    }
    
}
