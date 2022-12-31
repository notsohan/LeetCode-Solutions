class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lts = new ArrayList<>();

        // {1 2 5 2 3}
        //less here is only - 1
        // greater is - 2
        // x 2 2 y z
        int smaller = 0, larger = 0;
        for(int i: nums){
            if(i<target)
                smaller++;
            else if(i>target)
                larger++;
        }
        // 0 1 2 2 2 2 3 4 5
        // 9 - 3 - 1 = 5
        // nums.length - larger - 1 = last index

        for(int i=smaller; i<=nums.length-larger-1; i++){
            lts.add(i);
        }
        return lts;
    }
}