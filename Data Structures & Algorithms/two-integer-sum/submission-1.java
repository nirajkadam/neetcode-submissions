class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            Integer j = seen.get(diff);
            if (j != null) {
                return new int[] {j, i};
            }
            seen.put(nums[i], i);
        }
        return new int[] {};
    }
}
