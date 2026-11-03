class Solution {
    public int maxArea(int[] heights) {
        int res = 0, left = 0, right = heights.length-1;

        while(left<right){
            int curr = Math.min(heights[left], heights[right]) * (right - left);
            res = Math.max(res, curr);
            if(heights[left] < heights[right]){
                left++;
            }else right--;
        }
        return res;
    }
}
