class revPair{
    public static void main(String[] args){
        int[] nums = {233,2000000001,234,2000000006,235,2000000003,236,
                    2000000007,237,2000000002,2000000005,
                    233,233,233,233,233,2000000004};
        // int[] nums = {233,200000001,234,200000006,235};
        int count = 0;
        for(int i = 0 ; i < nums.length-1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] < 0 && nums[j] < 0){
                    count++;
                }
                else if(nums[i] == nums[j]){
                    // continue;
                }
                else if(nums[i] > 2*nums[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
        // return count;
    }
}