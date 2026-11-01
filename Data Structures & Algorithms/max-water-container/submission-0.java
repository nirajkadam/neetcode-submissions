class Solution
{
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, max = 0;
         while (left < right) {
            int len = right - left;
            int bre = Math.min(heights[left], heights[right]);
            max = Math.max(max, len * bre);
            if (heights[left] < heights[right]) {
                left++;
            }
            else {
                right--;
            }
         }
         return max;
    }
}

