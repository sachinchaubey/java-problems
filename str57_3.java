import java.util.Arrays;
import java.util.Scanner;
class srt57_3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            String s = sc.next();
            if(n <= 2){
                System.out.println(s);
            }
            else{
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String ans = new String(ch);
                System.out.println(ans);
            }
        }
        sc.close(); 
    }
}