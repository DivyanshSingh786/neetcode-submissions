class Solution {
    public int findMin(int[] nums) {
        int mnum = Integer.MAX_VALUE;

        for(int num : nums){
            mnum = Math.min(mnum, num);
        }

        return mnum;
    }
}
