class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = index(word, ch);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<=idx; i++){
            sb.append(word.charAt(i));
        }
        sb.reverse();
        sb.append(word.substring(idx+1));
        return sb.toString();
    }
    public int index(String word, char c){
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)==c){
                return i;
            }
        }
        return -1;
    }
}