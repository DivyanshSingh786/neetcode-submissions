class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int res = 0, curr = nums[0], cnt = 0, i = 0;

        while(i<nums.length){
            if(curr != nums[i]){
                curr = nums[i];
                cnt = 0;
            }

            while(i < nums.length && nums[i] == curr) i++;

            cnt++;
            curr++;
            res = Math.max(res, cnt);
        }
        return res;
    }
}
