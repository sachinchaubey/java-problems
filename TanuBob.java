//codechef problem
// import java.util.Arrays;
import java.util.Scanner;
class TanuBob{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int count_Y = 0;
            int count_I = 0;
            String s = sc.next();
            for(int i = 0 ;i< n; i++){
                if(s.charAt(i) == 'Y'){
                    count_Y++;
                }
                else if(s.charAt(i) == 'I'){
                    count_I++;
                }
            }
            if(count_I > 0){
                System.out.println("Indian");
            }
            else if(count_Y > 0){
                System.out.println("Not Indian");
            }
            else if(count_I == 0 && count_Y == 0 ){
                System.out.println("Not Sure");
            }
        }
        sc.close();
    }
}