import java.util.Arrays;

class sort{
    public static void main(String[] args){
        int a[] = {100,4,200,3,1,1,2};
        // int a[] = {0,3,7,2,5,8,4,6,0,1};
        int n = a.length;
        for(int i = 0; i < n-1; i++){
            for(int j = i+1; j < n; j++){
                if(a[i] > a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a)); 
    }
}