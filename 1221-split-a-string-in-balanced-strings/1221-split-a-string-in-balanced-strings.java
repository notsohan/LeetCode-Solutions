class Solution {
    public int balancedStringSplit(String s) {
        int count = 0, r = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='R'){
                r++;
            }else{
                r--;
            }
            if(r==0) count++;
        }
        return count;
    }
}