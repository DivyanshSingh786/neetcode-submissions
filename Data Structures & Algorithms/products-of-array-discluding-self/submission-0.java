class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 1;
        for(int i=1;i<nums.length;i++){
            left[i] = nums[i-1]*left[i-1];
        }
        int[] r = new int[nums.length];
        r[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--){
            r[i] = nums[i+1]*r[i+1];
        }

        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]= left[i]*r[i];
        }
        return res;

    }
}  
