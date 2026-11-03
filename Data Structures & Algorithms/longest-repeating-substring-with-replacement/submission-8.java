class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0, n = s.length();
        HashMap<Character, Integer> count = new HashMap<>();
        int l = 0, r = 0;
        int maxFreq = 0;
        while(r<n){
            count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
            maxFreq = Math.max(maxFreq,count.get(s.charAt(r)));
            if((r-l+1)-maxFreq>k){
             count.put(s.charAt(l),count.getOrDefault(s.charAt(l),0)-1);
             l++;
            }
            res = Math.max(res,(r-l+1));
            r++;
        }
        return res;
    }
}
