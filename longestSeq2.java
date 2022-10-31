// import java.util.Arrays;

//optimize

class longestSeq{
    public static void main(String[] args){
        int a[] = {100,3,1,2,200,4};
        int n = a.length;
        int count = 1;
        bubble(a,n);
        int pre = a[0];
        int ans = 0; 
        for(int i = 1; i < n ; i++){
            if(a[i] == pre+1){
                count++;
            }
            else if(a[i] != pre+1){
                count = 1;
            }
            pre = a[i];
            ans = Math.max(ans,count);

        }
        System.out.println(ans);

    }

    static void  bubble(int a[],int n){
        if(n == 0 || n == 0 ){
            return ;
        }
        for(int i = 0 ; i< n -1 ; i++){
            if(a[i] > a[i+ 1]){
                int temp = a[i];
                a[i] = a[i + 1];
                a[i+1] = temp;
            }
        }
        bubble(a,n-1);
    }
}