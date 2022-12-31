class Solution {
    public int search(int[] nums, int target) {
        int val=0;
        int left = 0, right=nums.length-1;
        while(right-left>1){
            int mid = (left+right)/2;
            if(nums[mid]<target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(nums[left]==target) {return left;}
        else if(nums[right]==target) {return right;}
        return -1;
    }
}