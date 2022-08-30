import java.util.Arrays;

class rotateArray{
    public static void main(String[] args){
        int[] arr = {1,2,3,5,8};
        int n = arr.length;
        int k = 3;
        int[] temp = new int[n];
        for(int i = 0; i < n ; i++){
            temp[(i + k)% n] = arr[i];
        }
        for(int i = 0; i< n ; i++){
            arr[i] = temp[i];
        }
        System.out.println(Arrays.toString(arr)); 
    }
}