

class buySell_stock{
    public static void main(String[] args){
        int a[] = {7,1,5,3,6,4};
        int profit = 0;
        int diff = 0;
        for(int i = 0 ; i<a.length; i++){
            for(int j = i ; j < a.length; j++){
                if(a[i] <= a[j]){
                    diff = Math.abs(a[i] - a[j]);
                    if(diff > profit){
                        profit = diff;
                    }   
                }
            }
        }
        System.out.println(profit);
    }
}