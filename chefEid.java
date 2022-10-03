import java.util.Arrays;
import java.util.Scanner;

//codechef problems

class chefEid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            int max = Integer.MAX_VALUE;
            for(int i = 0 ; i < n-1; i++){
                max = Math.min(max, Math.abs(a[i] - a[i+1]));
            }
            System.out.println(max);
        }
        sc.close();
    }
}