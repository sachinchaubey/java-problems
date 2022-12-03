class cloud_carry{
    public static void main(String[] args){
        int n = 675;
        int m = 126;
        // int rev1 = 0;
        // int rev2 = 0;
        int carry = 0;
        int total = 0;
        while(n != 0 && m !=0){
            int rev1= 0;
            int rev2= 0;
            
            rev1 = n % 10;
            rev2 = m % 10;
            int ans = rev1 + rev2 + carry;
            if(ans >= 10){
                carry = 1;
                total = total + carry;
            }
            n = n / 10;
            m = m / 10;
        }
        System.out.println(total);
    }
}