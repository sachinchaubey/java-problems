// TwoSum problem solution [leetcode] using hashmap

import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

class twoSum_leet{
    // private static final String Integer = null;
    public static int[] twoSum(int num[],int target){
        int[] result = new int[2];
        HashMap<Integer,Integer> value = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < num.length; i++){
            if(value.containsKey(target - num[i])){
                result[1] = i;
                result[0] = value.get(target - num[i]);
                return result;  

            }
            value.put(num[i], i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] num = {2,3,5,6,10};
        int target = 16;
        int[] ans = twoSum(num,target);
        System.out.println(Arrays.toString(ans));
        sc.close();
    }

}