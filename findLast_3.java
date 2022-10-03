import java.util.Arrays;
import java.util.*;


// leetcode problem find first and last occurrence using binary search

class findLast_3{
    public static int[] solve(int nums[],int target){
        // int[] result = new int[2];
        // result[0] = findfirst(nums, target);
        // result[1] = findlast(nums,target);
        // return result;
        return new int[]{findfirst(nums,target),findlast(nums,target)};

    }
    private static int findfirst(int nums[], int target){
        int start = 0;
        int end = nums.length -1;
        int ind = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                ind = mid;
                end = mid - 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ind;
    }

    private static int findlast(int nums[], int target){
        int start = 0;
        int end = nums.length -1; 
        int ind = -1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                ind = mid;
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return ind;
    }
    public static void main(String [] args){
        int a[] = {3,4,13,13,13,20,40};
        int tar = 13;
        int[] ans = new int[2];
        ans = solve(a,tar);
        System.out.println(Arrays.toString(ans));
    }
}