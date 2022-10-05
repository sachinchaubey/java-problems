import java.util.Scanner;

//leetcode

class monotonArray{
    public static boolean isBoolean(int[] a){
        boolean acr = true;
        boolean dcr = true;
        for(int i = 0 ; i< a.length-1; i++){
            if(a[i] > a[i+1]){
                acr = false;
            }
            if(a[i] < a[i+1]){
                dcr = false;
            }
        }
        return acr || dcr;
    }
    public static void main(String[] args){
        int a[] = {1,2,2,3,4};
        // isBoolean(a);
        System.out.println(isBoolean(a));
    }
}