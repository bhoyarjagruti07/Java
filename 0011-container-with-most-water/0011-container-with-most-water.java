class Solution {
    public int maxArea(int[] height) {
        int result = 0;

        int l = 0;
        int h = height.length-1;
        while (h>l) {
            int left = height[l];
            int right = height[h];
            
            int area = Math.min(left, right)*(h-l);
            result = Math.max(result,area);

            if (left<right) {
                l++;
            }
            else {
                h--;
            }
        }
        return result;
    }
}