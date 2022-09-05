public class function_call{
    public static void main(String[] args){
        // int a = 5;  
        // int b = 6;   
        int c = hello(5,6);
        System.out.println(c);
    }

    static int hello(int a,int b){
        int z = a + b;
        return z; 
    }
}