import java.util.Scanner;

// codechef problems

class RG_light{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt(); 
            int a[] = new int[n];
            int b = sc.nextInt();
            int count = 0;
            for(int i = 0; i < n ; i++){
                a[i] = sc.nextInt();
            }
            for(int i = 0; i<n ; i++){
                if(a[i] > b){
                    count++;
                }
            }
            System.out.println(count);
        }
        sc.close();
    }
}