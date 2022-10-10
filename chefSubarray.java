//codechef pro
import java.util.Scanner;
class chefSubarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i< n; i++){
                a[i] = sc.nextInt();
            }
            int count = 0 ;
            for(int i = n-1 ; i >= 0 ; i--){
                int sum = 0 ;
                int mul = 1;
                for(int j = i ; j>= 0 ; j--){
                    sum += a[j];
                    mul *= a[j];
                    if(mul == sum){
                        count++;
                    } 
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}