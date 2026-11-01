class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seenElements = new HashSet<>();
        for (int num : nums) {
            if (seenElements.contains(num)) {
                return true;
            }
            seenElements.add(num);
        }
        return false; 
    }
}