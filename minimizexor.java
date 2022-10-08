
class minimizexor{
    public static void main(String[] args){
        int num1 = 31,num2 = 3;
        // int x = Integer.bitCount(num1);
        // System.out.println("no of bit" + x);
        int n = 1000;
        // int n = (int)Math.pow(10,9);
        int count = 0;
        int a =0 ;
        int count_1;
        int min = Integer.MAX_VALUE;
        int ans = 0;
        while(num2 > 0){
            count += num2 & 1;
            num2 = num2 >> 1;
        }
        // System.out.println(count);
        int i;
        int k;
        for(i = 2; i <= n ; i++){
            k = i;
            count_1 = 0;
            while(k > 0){
                count_1 += k & 1;
                k = k >> 1;
            }
            if(count_1 == count){
                // System.out.println(count + " " + count_1);
                a = i ^ num1;
                // System.out.println("value of a: " + a);
                if(a <= min){
                    min = a;
                    // System.out.println("min is :" + min);
                    ans = i;
                    // System.out.println("ans is :" + ans);
                }
            }
        }
        System.out.println(ans);
    }
}