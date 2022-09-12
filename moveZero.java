// move zero in end 
// approach 1 : bruteforce

class moveZero{
    public static void main(String[] args){
        int arr[] = {0,3,0,1,0};
        int n = arr.length;
        int temp[] = new int[n];

        int k = 0;
        for(int i = 0; i < n ; i++){
            if(arr[i] != 0){
                temp[k] = arr[i];
                k++;
            }
        }
        if(k < n){
            temp[k] = 0;
            k++;
        }

        for(int i = 0 ; i< n ; i++){
            System.out.print(temp[i] + " ");
        }
    }
}