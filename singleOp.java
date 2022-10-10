import java.util.Scanner;

//codechef contest

class singleOp{
    public static void main(String[] args){
        // int x = 3;
        // int y = 2;
        // // int c = x / Math.pow(2, y);
        // int k = (int) Math.pow(2,y); 
        // System.out.println(k);
        // int c = x / k;
        // System.out.println(c);
        // // c = Math.floor(c);
        // int ans = x ^ c;
        // System.out.println(ans);

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int max;
        int y = 0 ;
        // int X = 0;
        // int count = 0;
        while(t --> 0){
            max = Integer.MAX_VALUE;
            // max = Integer.MIN_VALUE;
            int n = sc.nextInt();
            String s = sc.next();
            int X = Integer.parseInt(s,2);
            // for(int i = n-1; i>=0 ;i--){
            //     if(s.charAt(i) == '1'){
            //         X += Math.pow(2,count);
            //     }
            //     count++;
            // }
            // System.out.println(X);
            int i;
            for(i = 1 ; i<=n; i++){
                // Math.pow(2, i);
                int k = (int) Math.pow(2,i);
                int c = X / k;
                int ans = X ^ c;
                // int ans = X ^ (X / (int) Math.pow(2,i));
                // System.out.println(ans);
                if(ans < max){
                    max = ans;
                    y = i;
                }
            }
            System.out.println(y);
            // System.out.println(max);
            // double l = X / Math.pow(2,3);
        }
        sc.close();
    }
}