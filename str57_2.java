// codechef starter57D solution
import java.util.Scanner;
class srt57_2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0; i < n ; i++){
                if(a[i] == 0){
                    count = 0;
                    break;
                }
                if(a[i] < 0){
                    count++;
                }
            }
            if(count % 2 == 1){
                System.out.println(1);
            }
            else{
                System.out.println(0);
            }
        }
        sc.close();
    }
}