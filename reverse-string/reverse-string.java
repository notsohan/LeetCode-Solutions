class Solution {
    public void reverseString(char[] s) {
        for(int i=0, j=s.length-1; i<j; i++, j--){
            swap(s, i, j);
        }
    }
    public void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}