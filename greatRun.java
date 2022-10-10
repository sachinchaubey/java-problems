//codechef contest
import java.util.Scanner;;
class greatRun{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for(int i = 0 ; i<n ; i++){
                arr[i] = sc.nextInt();
            }
            int max = Integer.MIN_VALUE;
            for(int i = 0 ; i < n - k + 1; i++){
                int sum = 0;
                for(int j = i ; j < k + i ; j++){
                    sum += arr[j];
                }
                if(sum > max){
                    max = sum;
                }
            }
            System.out.println(max);
        }
        sc.close();
    }
}