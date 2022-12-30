class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        String[] newStr = new String[k];
        int i=0;
        while(k-->0){
            newStr[i] = str[i];
            i++;
        }
        return String.join(" ", newStr);
    }
}