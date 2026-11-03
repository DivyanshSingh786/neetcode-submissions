class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> cnt1 = new HashMap<>();
        for(char c : s1.toCharArray()){
            cnt1.put(c, cnt1.getOrDefault(c, 0)+1);
        }

        int need = cnt1.size();

        for(int i=0; i<s2.length(); i++){
            Map<Character, Integer> cnt2 = new HashMap<>();
            int cur = 0;
            for(int j=i; j<s2.length(); j++){
                char c = s2.charAt(j);
                cnt2.put(c, cnt2.getOrDefault(c, 0)+1);

                if(cnt1.getOrDefault(c, 0) < cnt2.getOrDefault(c, 0)){
                    break;
                }
                if(cnt1.getOrDefault(c, 0) == cnt2.get(c)){
                    cur++;
                }
                if(cur == need) return true;
            }
        }
        return false;
    }
}
