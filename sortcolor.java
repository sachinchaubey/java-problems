import java.util.Arrays;

//leetcode problems

class sortcolor{
    public static void main(String[] args){
        int[] a = {0,1,2,1,0,2,1,1,0};
        int n = a.length;
        int c0 = 0;
        int c1 = 0;
        int c2 = 0;
        for(int i = 0 ; i< n ; i++){
            if(a[i] == 0){
                c0 += 1;
            }
            else if(a[i] == 1){
                c1 += 1;
            }
            else if(a[i] == 2){
                c2 += 1;
            }
        }
        int ans[] = new int[n];
    //     for(int i = 0; i < c0 ; i++){
    //         ans[i] = 0;
    //     }
    //     for(int i = 0 ; i < c1; i++){
    //         ans[c0 + i] = 1;
    //     }
    //     for(int i = 0 ; i < c2; i++){
    //         ans[c1 + i] = 2;
    //     }
    //     Arrays.sort(ans);
    //     System.out.println(Arrays.toString(ans));
    //     // for(int i = 0 ; i < c1; i++){
    //     //     ans[c0 + i] = 1; 
    //     // }
    //     // for(int i = 0; i < c2; i++){
    //     //     ans[c1 + i] = 2;
    // }

        // System.out.println(Arrays.toString(ans));
        int i = 0;
        while(c0 > 0 || c1 > 0 || c2 > 0){
            if(c0 > 0){
                ans[i] = 0;
                c0--;
                // i++;
            }
            else if(c1 > 0){
                ans[i] = 1;
                c1--; 
            }
            else if(c2 > 0){
                ans[i] = 2;
                c2--;
            }
            i++;
            
        }
        System.out.println(Arrays.toString(ans));
    }
        // System.out.println(c0);
}