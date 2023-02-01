class Solution {
    public boolean isPalindrome(int x) {
        boolean flag = true;
        String num = Integer.toString(x);
        int[] nums = new int[num.length()];
        for(int i=0; i<nums.length; i++){
            nums[i] = num.charAt(i) - '0';
        }
        
        for(int i=0, j=nums.length-1; i<nums.length; i++, j--){
            if(nums[i]!=nums[j]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}