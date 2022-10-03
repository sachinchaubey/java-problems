//find last occurrence of the target element using Binary Search
// time complexity: O(log n)

class findLast_1{
    static int lastoccur(int a[], int tar){
        int start = 0;
        int end = a.length - 1;
        int ind = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(a[mid] == tar){
                ind = mid;
                start = mid + 1;
            }
            else if(tar < a[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }

        return ind;
    }
    public static void main(String[] args){
        int a[] = {3,4,15,15,15,20,40};
        int tar = 13;
        System.out.println(lastoccur(a,tar));
    }
} 