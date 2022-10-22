import java.util.Scanner;

//codechef contest

class imdb{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t --> 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int s[] = new int[n];
            int r[] = new int[n];
            for(int i = 0; i< n; i++){
                s[i] = sc.nextInt();
                r[i] = sc.nextInt();
            }
            int rate = 0;
            for(int i = 0 ; i< n; i++){
                if(s[i] <= x){
                    rate = Math.max(rate, r[i]);
                }
            }
            System.out.println(rate);
        }
        sc.close();
    }
}