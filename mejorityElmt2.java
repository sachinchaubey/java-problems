public class mejorityElmt2 {
    public static int major(int arr[]){
        int index = 0;
        int count = 0;
        for(int i = 0; i<arr.length ; i++){
            if(count == 0){
                index = arr[i];
                count = 1;
            }
            else if(index == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }
        return index;
    }
    public static void main(String[] args){
        int arr[] = {3,2,3,2,2};
        System.out.println(major(arr));

    }
    
}
