// binarysearch problem when array is sorted or rotated
// complextity : O(lon N)

class binaryS{
    static int bSearch(int a[] ,int key){
        int low = 0 ; 
        int high = a.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(a[mid] == key){
                return mid;
            }
            if(a[low] <= a[mid]){
                if(key >= a[low] && key < a[mid]){
                    high = mid -1;
                }
                else{
                    low = mid + 1;
                }
            }
            else{
                if(key > a[mid] && key <= a[high]){
                    low = mid + 1;
                }
                else{
                    high = mid -1;
                }
            } 
        }
        return -1;
    }
    public static void main(String[] args){
        int a[] = {1,3};
        int key = 3;
        int loc = bSearch(a,key);
        if(loc != -1){
            System.out.println("Element are present at index :" + loc);
        }
        else{
            System.out.println("Sorry, Element are not present in this Array ");
        }
    }
}