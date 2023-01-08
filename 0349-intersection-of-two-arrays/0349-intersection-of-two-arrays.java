class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> h = new HashSet<>();
        for(int i: nums1){
            h.add(i);
        }
        Set<Integer> s = new HashSet<>();
        for(int i: nums2){
            if(h.contains(i)){
                s.add(i);
            }
        }
        int[] num = new int[s.size()];
        int i=0;
        for(int val: s){
            num[i++] = val;
        }
        return num;
    }
}