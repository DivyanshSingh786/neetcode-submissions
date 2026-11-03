class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n <= 0) return 0;

        HashSet<Character> charSet = new HashSet<>();
        int res = 0, l=0;

        for(int r=0; r<n; r++){
            while(charSet.contains(s.charAt(r))){
                charSet.remove((s.charAt(l)));
                l++;
            }
            charSet.add(s.charAt(r));
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}
