class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxNum = Integer.MIN_VALUE, ans = Integer.MAX_VALUE;
        for(int pile : piles){
            maxNum = Math.max(maxNum, pile);
        }
        int low = 1, high = maxNum;

        while(low <= high){
            int mid = (low + high) / 2;
            int hCnt = 0;
            boolean flag = true;

            for(int pile : piles){
                hCnt += Math.ceil((double) pile / mid);
                if(hCnt > h) {
                    flag = false;
                    break;
                }
            }

            if(flag){
                ans = Math.min(ans, mid);
                high = mid - 1;
            }else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
