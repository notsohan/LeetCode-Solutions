class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] name = new String[names.length];
        Map<Integer, String> hm = new HashMap<>();
        for(int i=0; i<names.length; i++){
            hm.put(heights[i], names[i]);
        }
        Arrays.sort(heights);
        for(int i=heights.length-1, j=0; i>=0; i--, j++){
            name[j] = hm.get(heights[i]);
        }
        return name;
    }
}