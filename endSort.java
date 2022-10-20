import java.util.Scanner;

//codechef problems

class endSort{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ;i < n ;i++){
                a[i] = sc.nextInt();
            }
            int count = 0,ind_1= 0,ind_p=0;
            for(int i = 0 ; i<n-1; i++){
                if(a[i] == 1){
                   ind_1 = i; 
                }
                if(a[i] == n){
                    ind_p = i;
                }
            }
            count = ind_1 + (n - 1 - ind_p);
            if(ind_p < ind_1){
                System.out.println(count-1);
            }
            else{
                System.out.println(count);
            }
        }
        sc.close();
    }
}