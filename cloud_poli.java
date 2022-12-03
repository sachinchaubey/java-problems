class cloud_poli{
    public static void main(String[] args){
        int k = 10;
        int m = 80;
        int N = k;
        int total = 0;
        while(N != m){
            // System.out.println("hii");
            int rev = 0;
            int ans = 0;
            int n = N;
            while(n != 0){
                rev = n % 10;
                ans = ans * 10 + rev;
                n = n / 10;
            }
            if(ans == N){
                total = total + ans;
            }
            N++;
        }
        System.out.println(total);
    }
}