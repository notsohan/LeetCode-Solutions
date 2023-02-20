class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalin(word)) {
                return word;
            }
        }
        return "";
    }
    public boolean isPalin(String word){
        for(int i=0, j=word.length()-1; i<word.length(); i++, j--){
            if(word.charAt(i)!=word.charAt(j)){
                return false;
            }
        }
        return true;
    }
}