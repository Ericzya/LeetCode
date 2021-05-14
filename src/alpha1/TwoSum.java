package alpha1;

import java.util.HashMap;

/**
 * @author admin
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] resultArr = twoSumFast(new int[]{2, 7, 11, 15}, 9);
        for (int a : resultArr) {
            System.out.print(a + "\t");
        }
    }

    /**my answer 44.82
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = nums.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{j, i};
                }
            }
        }
        return null;
    }

    /**fastest answer
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumFast(int[] nums, int target) {
        HashMap<Integer, Integer> tempHashMap = new HashMap<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (tempHashMap.containsKey(nums[i])) {
                return new int[]{i, tempHashMap.get(nums[i])};
            }
            tempHashMap.put(key, i);
        }
        return null;
    }
}
