// codechef contest seplunchtime2022
import java.util.Scanner;
class lunchTime_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int r = n-x;
            if(x == 0 || x == n){
                System.out.println(0);
            }
            else if(r > x){
                System.out.println(x);
            }
            else{
                System.out.println(r);
            }
        }
        sc.close();
    }
}