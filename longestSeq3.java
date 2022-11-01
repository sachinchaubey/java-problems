// ! this problem solve in O(n);

import java.util.HashSet;

public class longestSeq3 {
    public static void main(String[] args) {
        int a[] = { 3, 4, 3, 7, 8, 6, 9, 10, 1 };
        HashSet<Integer> set = new HashSet<Integer>();
        for (int nums : a) {
            set.add(nums);
        }
        // System.out.println(set);
        int ans = 0;
        for (int nums : set) {
            if (!set.contains(nums - 1)) {
                int count = 1;
                int currentNo = nums;
                while (set.contains(currentNo + 1)) {
                    currentNo += 1;
                    count += 1;
                }
                ans = Math.max(count, ans);
            }
        }
        System.out.println(ans);
    }
}
