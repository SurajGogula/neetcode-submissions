class Solution {
    private boolean palindromeCheck(String s, int left, int right){
        if(left>=right)return true;
        if(s.charAt(left)!=s.charAt(right))return false;
        return palindromeCheck(s, left+1, right-1);

    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }
        String cleaned = sb.toString();
        return palindromeCheck(cleaned, 0, cleaned.length() - 1);
        
    }
}
