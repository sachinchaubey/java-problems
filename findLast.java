// import java.lang.annotation.Target;

//leetcode problems

class findLast{
    public static void main(String[] args){
        int a[] = {1,4,15,15,15,20,40};
        int tar = 15;
        int count = 0;
        for(int i = a.length-1 ; i >= 0 ; i--){
            if(a[i] == tar){
                count++;
                System.out.println(i);
                break;
            }
        }
        if(count == 0 ){
            System.out.println(-1);
        }
    }
}