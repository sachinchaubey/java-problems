
class mejorityElmt{
    public static int majorElmt(int arr[]){
        int indexElmt = 0;
        int count = 0;
        // System.out.println(arr.length);
        for(int i = 0; i<arr.length;i++){
            if(arr[indexElmt] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                indexElmt = i;
                count = 1;
            }
        }
        return arr[indexElmt];

    }
    public static void main(String[] args){
        int arr[] = {3,2,3,3,2,2,2};
        System.out.println(majorElmt(arr));
    } 
}