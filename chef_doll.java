//codechef practice
// import java.util.Arrays;
import java.util.Scanner;
class chef_doll{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0 ; i< n; i++){
                a[i] = sc.nextInt();
            }
            int count = 0;
            for(int i = 0 ; i < n ; i++){
                for(int j = 0; j < n ; j++){
                    if(a[i] == a[j]){
                        count++;
                    }
                }
                if(count % 2 != 0){
                    System.out.println(a[i]);
                    break;
                }
            }
            
        }
        sc.close();
    }
}