import java.util.Arrays;

// move zero in end of array 
// optimal solution 
// complexity O[n],O[1]

class moveZero_1{

    static void Zeromove(int[] arr){
        int n = arr.length;
        int k = 0;
        while(k < n){
            if(arr[k] == 0){
                break;
            }
            else{
                k++;
            }
        }
        int i = k , j = k+1;
        while(i < n && j < n){
            if(arr[j] != 0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
            j++;
        }
        // System.out.println(Arrays.toString(arr));
        for(i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {1,0,1,2,0,1};
        Zeromove(arr);

    }
}