import java.util.Arrays;
import java.util.Scanner;

//codechef problem

class uncalJon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n+1];
            for(int i = 1 ; i < n+1 ; i++){
                a[i] = sc.nextInt();
            }
            int key_ind = sc.nextInt();
            // System.out.println(key_ind);
            int key = a[key_ind];
            // System.out.println(key);
            Arrays.sort(a);
            for(int i = 1 ;i <= n ; i++){
                if(a[i] == key){
                    System.out.println(i);
                }
                // System.out.println(Arrays.toString(a));
            }
        }
        sc.close();
    }
}