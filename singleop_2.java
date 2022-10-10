//codechef contest
import java.util.Scanner;
class singleOp_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int count = 1;
            int i ;
            int n = sc.nextInt();
            String s = sc.next();
            for(i =0 ; i<n-1; i++){
                // count++;
                if(s.charAt(i+1) == '1'){
                    break;
                }
                else{
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}