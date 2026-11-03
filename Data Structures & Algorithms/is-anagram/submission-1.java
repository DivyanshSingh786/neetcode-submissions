class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] alpha = new int[26];
        for(char sc : s.toCharArray()){
            alpha[sc - 'a']++;
        }
        for(char tc : t.toCharArray()){
            if(alpha[tc - 'a']==0)return false;
            alpha[tc - 'a']--;
        }

        return true;
    }
}
