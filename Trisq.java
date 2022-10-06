//codechef 
import java.util.Scanner;
class trisq{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int b = sc.nextInt();
            b = b-2;    //for save from the overflow
            b = b/2;    //for  making 2*2 size triangle
            int ans = b*(b+1)/2;
            System.out.println(ans);
        }
        sc.close();
    } 
}