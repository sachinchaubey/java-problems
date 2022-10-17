import java.util.Scanner;

//codechef contest

class money{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n];
            String s = "";
            for(int i = 0 ; i < n ; i++){
                a[i] = sc.nextInt();
                if(a[i] <= k){
                    // System.out.println(a[i]);
                    k = k - a[i];
                    s = s +"1";
                }
                else{
                    s = s + "0";
                }
            }
            System.out.println(s);
        }
    }
}