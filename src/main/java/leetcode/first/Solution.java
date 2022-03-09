package leetcode.first;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ArvikV
 * @version 1.0
 * @since 09.03.2022
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        //array to result indexes
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
