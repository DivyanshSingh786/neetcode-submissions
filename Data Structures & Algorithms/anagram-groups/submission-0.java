class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for(String s : strs){
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = new String(charArr);
            res.putIfAbsent(sortedStr, new ArrayList<>());
            res.get(sortedStr).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
