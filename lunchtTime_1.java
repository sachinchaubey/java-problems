// codechef setp lunchtime contest
import java.util.Scanner;
class lunchTime_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            if(n < 7){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
        sc.close();
        
    }
}