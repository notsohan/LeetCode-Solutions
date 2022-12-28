class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        
        int i=0, t=2;
        while(t-->0){
            for(int j: nums){
                if(i<ans.length){
                    ans[i] = j;
                }
                i++;
            }
        }
        return ans;
    }
}