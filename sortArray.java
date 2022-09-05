class sortArray{
    public static void main(String[] args){
        int[] arr = {0,2,1,0,2,0,1,1};
        for(int i = 0 ; i < arr.length - 1 ; i++){
            if(arr[i] > arr[i+1]){
                arr[i] = arr[i] + arr[i+1];
                arr[i+1] = arr[i] - arr[i+1];
                arr[i] = arr[i] - arr[i+1];
            }
        }
        for(int i = 0; i< arr.length ;i++){
            System.out.println(arr[i]);
        }
    }
}