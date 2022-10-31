import java.util.Arrays;

//using brute force

class longestSeq{
    public static void main(String[] args){
        // int a[] = {20,34,11,10,7,9,8,6,4,1,2,3};
        // int a[] = {0,3,7,2,5,8,4,6,0,1};
        int a[] = {1,1};
        Arrays.sort(a);
        int pre = a[0];
        int count = 1;
        int max = 0;
        for(int i = 1 ; i< a.length; i++){
            if(a[i] == (pre +1)){
                count++;
            }
            else if(a[i] == pre){
                // continue;
            }
            else if(a[i] != pre+1){
                count = 1;
            }
            System.out.println("hello");
            pre = a[i];
            max = Math.max(max,count);
        }
        System.out.println(max);
    }
}