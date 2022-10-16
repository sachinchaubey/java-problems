import java.util.Arrays;

//leetcode
// *! In this program sort the perityElmt , like sort the even elmt first and then odd elmt;

class parityElmt{
    public static void main(String[] args){
        int nums[] = {1,3,2,4};          
        int left = 0; 
        int right = nums.length-1;
        while(left < right){
            if(nums[left] % 2 != 0){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
            else{
                left++;
            }
        }
        System.out.println(Arrays.toString(nums));
    

    }
}