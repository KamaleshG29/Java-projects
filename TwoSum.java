package javaprojects;
import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer prevIndex = map.get(complement);
            if (prevIndex != null) {
                return new int[]{prevIndex, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{}; // Fallback, though problem guarantees a solution
    }
    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        System.out.printf("Test 1: nums = %s, target = %d%nResult: %s%n",
                Arrays.toString(nums1), target1, Arrays.toString(solution.twoSum(nums1, target1)));
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        System.out.printf("%nTest 2: nums = %s, target = %d%nResult: %s%n",
                Arrays.toString(nums2), target2, Arrays.toString(solution.twoSum(nums2, target2)));
        int[] nums3 = {3, 3};
        int target3 = 6;
        System.out.printf("%nTest 3: nums = %s, target = %d%nResult: %s%n",
                Arrays.toString(nums3), target3, Arrays.toString(solution.twoSum(nums3, target3)));
    }
}