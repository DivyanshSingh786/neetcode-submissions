class Solution {
    public boolean isPalindrome(String s) {
        if(s==null) return false;
        int n = s.length();
        int left = 0, right = n-1;
        while(left < right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
            left++;
        }
        while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
            right--;
        }
        if (left >= right) {
            break;
        }
        
        // Compare the valid pair
        if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
            return false;
        }
        
        // Crucial: Always move pointers inward after a successful match
        left++;
        right--;
        }
        return true;
    }
}
