// codeChef practice
import java.util.Scanner;
class farAway{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int N = sc.nextInt();
            int M = sc.nextInt();
            int a[] = new int[N];
            for(int i = 0; i < N ; i++){
                int c = sc.nextInt();
                if(c <= M){
                    a[i] = c;
                }
            }
            long max = 0;
            for(int i = 0; i < N; i++){
                // int k = a[i] - 1;
                // int a1 = Math.abs(k);
                // int l = a[i] - M;
                // int a2 = Math.abs(l);
                // max = max + Math.max(a1, a2);
                max = max + Math.max(Math.abs(a[i]-1), Math.abs(a[i]-M));
            }
            System.out.println(max);
        }
        sc.close();

    }
}