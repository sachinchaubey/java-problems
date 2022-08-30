// only exist if no duplicat no are present.

class secondLargest{
    public static void main(String[] args){
        int[] arr = {1,2,4,7,6,7};
        int max1 = -1; 
        int max2 = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == max1){
                max1 = arr[i];
            }
            else if(arr[i] > max1){
                max2 = max1;
                max1 = arr[i];
            }
            else if(arr[i] > max2 && max2 < max1){
                max2 = arr[i];
            }
        }
        System.out.println(max2);
    }
}
