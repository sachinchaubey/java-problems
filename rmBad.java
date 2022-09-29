//codechef contest 

import java.util.Scanner;

//codechef problem

class rmBad{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int count = 0;
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i< n ; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0 ;i<n ;i++){
                if(a[i] != a[i+1]){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}