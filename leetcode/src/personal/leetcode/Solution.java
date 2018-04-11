package personal.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bisnail 
 * 			从数组中找出两个数，使其和为特定值target。例如nums = [2, 7, 11, 15], target =
 *         9，因为2+7=9，返回[0, 1]
 */
public class Solution {
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(nums[i]) && map.get(nums[i]) != i) {
				result[0] = map.get(nums[i]);
				result[1] = i;
				break;
			}

			map.put(complement, i);
		}

		return result;
	}
	public static void main(String[] args) {
		int[] nums = new int[4];
		nums[0] = 2;
		nums[1] = 7;
		nums[2] = 11;
		nums[3] = 5;
		int target = 9;
		int[] result = Solution.twoSum(nums, target);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}