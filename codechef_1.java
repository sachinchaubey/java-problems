import java.util.Scanner;

// codechef practice problem

class codechef_1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        
        int count = 0;
        for(int i = 0 ; i < n; i++){
            // System.out.println(arr[i]);
            if(arr[i] == 10){
                // System.out.println();
                count++;
                // System.out.println(count);
            }
        }
        System.out.println(count);
        sc.close();
    }
}