import java.util.Scanner;

// fine min from rotated array (Binary Search)
// using Brute force

class min_Bs{
    static int min(int a[]){
        int m = Integer.MAX_VALUE;
        for(int i = 0 ; i < a.length; i++){
            if(a[i] < m){
                m = a[i];
            }
        }
        return m;
    }
    public static void main(String[] args){
        int a[] = {3,5,7,0,1,2};
        System.out.println("Min element is in array is : "+ min(a));
    }
}