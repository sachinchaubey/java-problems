
class binarySearch1{
    public static void main(String[] args){
        int a[] = {-1,0,1,4,5,8};
        int key = 0;
        int low = 0;
        // int loc = -1;
        int high = a.length-1;
        // System.out.println(12);
        while(low <= high){
            // System.out.println(23);
            // if(low )
            int mid = (low + high)/2;
            mid = (int) Math.floor(mid);
            if(a[mid] == key){
                // loc = mid;
                // break;
                System.out.println(mid);
                break;
            }
            else if(key > a[mid]){
                low = mid + 1;
            }
            else if(key < a[mid]){
                high = mid - 1;
            }
        }
        if(low > high){
            System.out.println("element not found");
        }
        // else{
        //     System.out.println(loc);
        // }
        // System.out.println("element not found");
    }
}