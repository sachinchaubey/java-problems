//count set bit of integer

class countsetbit{
    public static void main(String[] args){
        int n = 9;
        int count = 0;
        while(n > 0){
            count += n & 1;  // value of n & 1 add in count 
            n = n >> 1;      //right shift n by 1 position
        }
        System.out.println(count);

    }
}