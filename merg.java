import java.util.Arrays;

class merg{
    public static void main(String[] args){
        int a1[] = {1,2,3,4};
        int a2[] = {2,5,6,7};
        int n = a1.length;
        int m = a2.length;
        int arr[] = new int[n+m];
        for(int i = 0 ; i< n; i++){
            arr[i] = a1[i];
        }
        for(int i = 0 ; i <m ; i++){
            arr[n + i] = a2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}